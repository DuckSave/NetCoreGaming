package utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;

public class HoaDonPrinter {

    public static void inHoaDon(String sdt, String maHD, String username, String soGC, String ngayChoi, String[][] chiTietHD) {

        Document document = new Document(PageSize.A5);
        try {
            String filePath = "HoaDon_" + maHD + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Thêm logo
            Image logo = Image.getInstance("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\logoHoaDon.png");
            logo.setAlignment(Element.ALIGN_CENTER);
            logo.scaleAbsolute(100, 100);
            document.add(logo);

            // Tạo khoảng trống giữa logo và tiêu đề
            document.add(new Paragraph(" "));

            // Tiêu đề
            Paragraph centerText = new Paragraph();
            centerText.setAlignment(Element.ALIGN_CENTER);
            BaseFont bf = BaseFont.createFont("fonts/arial-unicode-ms.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font vietnameseFont = new Font(bf, 12);
            Font HoaDonFont = new Font(bf, 18);
            Chunk title = new Chunk("HÓA ĐƠN", HoaDonFont);
            centerText.add(title);
            document.add(centerText);

            // Nội dung
            document.add(new Paragraph(" "));

            PdfPTable table = new PdfPTable(2);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);

            addTableRow(table, "Ngày In:", getCurrentDate(), vietnameseFont);
            addTableRow(table, "Tên Khách Hàng:", username, vietnameseFont);
            addTableRow(table, "Số Điện Thoại:", sdt, vietnameseFont);
            addTableRow(table, "Số Giờ Chơi:", soGC, vietnameseFont);
            addTableRow(table, "Ngày Chơi:", ngayChoi, vietnameseFont);

            document.add(table);
            document.add(new Paragraph());
            document.add(new Chunk(new LineSeparator()));
            document.add(new Paragraph(" "));

            // Bảng chi tiết hóa đơn
            PdfPTable detailTable = new PdfPTable(3);
            detailTable.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell TSP = new PdfPCell(new Phrase("Tên Sản Phẩm", vietnameseFont));
            TSP.setPadding(5);
            TSP.setBorder(Rectangle.NO_BORDER);
            TSP.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell SL = new PdfPCell(new Phrase("Số Lượng", vietnameseFont));
            SL.setPadding(5);
            SL.setHorizontalAlignment(Element.ALIGN_CENTER);
            SL.setBorder(Rectangle.NO_BORDER);
            PdfPCell DG = new PdfPCell(new Phrase("Đơn Giá", vietnameseFont));
            DG.setPadding(5);
            DG.setHorizontalAlignment(Element.ALIGN_CENTER);
            DG.setBorder(Rectangle.NO_BORDER);
            detailTable.addCell(TSP);
            detailTable.addCell(SL);
            detailTable.addCell(DG);

            double totalAmount = 0;

            for (String[] ct : chiTietHD) {
                PdfPCell cellTSP = new PdfPCell(new Phrase(ct[0], vietnameseFont));
                cellTSP.setPadding(5);
                cellTSP.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTSP.setBorder(Rectangle.NO_BORDER);
                detailTable.addCell(cellTSP);

                PdfPCell cellSL = new PdfPCell(new Phrase(ct[1], vietnameseFont));
                cellSL.setPadding(5);
                cellSL.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellSL.setBorder(Rectangle.NO_BORDER);
                detailTable.addCell(cellSL);

                PdfPCell cellDG = new PdfPCell(new Phrase(ct[2], vietnameseFont));
                cellDG.setPadding(5);
                cellDG.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellDG.setBorder(Rectangle.NO_BORDER);
                detailTable.addCell(cellDG);

                double quantity = Double.parseDouble(ct[1]);
                double unitPrice = Double.parseDouble(ct[2]);
                totalAmount += quantity * unitPrice;
            }

            document.add(detailTable);

            // Đường kẻ phía dưới cuối cùng
            document.add(new Paragraph(" "));
            document.add(new Chunk(new LineSeparator()));

            // Phần Tổng Tiền
            document.add(new Paragraph(" "));
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String formattedTotalAmount = df.format(totalAmount);
            Paragraph totalAmountParagraph = new Paragraph("Tổng Tiền: " + formattedTotalAmount, vietnameseFont);
            totalAmountParagraph.setAlignment(Element.ALIGN_RIGHT);
            document.add(totalAmountParagraph);

            
            // Thêm logo
            Image qrcode = Image.getInstance("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\QRcode.png");
            qrcode.setAlignment(Element.ALIGN_CENTER);
            qrcode.scaleAbsolute(100, 100);
            document.add(qrcode);
            

            // Đóng document
            document.close();
            
            openFile(filePath);

            System.out.println("Hóa đơn đã được in và lưu vào file: " + filePath);

        } catch (DocumentException | IOException  e) {
            System.out.println("Chưa có hóa đơn nào");
        }
    }

    private static void addTableRow(PdfPTable table, String header, String value, Font font) {
        PdfPCell cellHeader = new PdfPCell(new Phrase(header, font));
        cellHeader.setHorizontalAlignment(Element.ALIGN_LEFT);
        cellHeader.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellHeader);

        PdfPCell cellValue = new PdfPCell(new Phrase(value, font));
        cellValue.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellValue.setBorder(Rectangle.NO_BORDER);
        cellValue.setPadding(7);
        table.addCell(cellValue);
    }

    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(new Date());
    }
    
    private static void openFile(String filePath) {
        try {
            File file = new File(filePath);
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("Không thể mở file tự động trên hệ điều hành này.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi mở file: " + e.getMessage());
        }
    }

    
}
