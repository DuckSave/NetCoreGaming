package DAO;

import entity.TaiSan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.connection;

public class TaiSanDAO extends NetCoreDAO<TaiSan, Integer> {

    @Override
    public void insert(TaiSan entity) {
        String sql = "INSERT INTO TaiSan (MaKH, SoTien, NgayNap) VALUES (?,?,?)";
        connection.Update(sql,
                entity.getMaKH(),
                entity.getSoTN(),
                entity.getNgayChoi());
    }

    @Override
    public void update(TaiSan entity) {
        String sql = "UPDATE TaiSan SET MaKH=?, SoTN=?, NgayChoi=? WHERE MaTS=?";
        connection.Update(sql,
                entity.getMaKH(),
                entity.getSoTN(),
                entity.getNgayChoi(),
                entity.getMaTS());
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM TaiSan WHERE MaTS=?";
        connection.Update(sql, id);
    }

    @Override
    public TaiSan selectById(Integer id) {
        String sql = "SELECT * FROM TaiSan WHERE MaTS=?";
        List<TaiSan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TaiSan> selectAll() {
        String sql = "SELECT * FROM dbo.TaiSan";
        return selectBySql(sql);
    }

    @Override
    protected List<TaiSan> selectBySql(String sql, Object... args) {
        List<TaiSan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while (rs.next()) {
                    TaiSan entity = new TaiSan();
                    entity.setMaTS(rs.getInt("MaTS"));
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setSoTN(rs.getInt("SoTN"));
                    entity.setNgayChoi(rs.getDate("NgayChoi"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
