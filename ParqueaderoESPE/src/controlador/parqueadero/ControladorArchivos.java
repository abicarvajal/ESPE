/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.parqueadero;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.swing.JOptionPane;



/**
 *
 * @author Abi
 */
public class ControladorArchivos {
    
    private static final String QR_CODE_IMAGE_PATH = "./MyQRCode.png";
    private static final String PDF_PATH = "./PDF";
    
    private static void generateQRCodeImage(String text, int width, int height, String filePath)
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    
    public void generarQR(String datos){
        try {
            generateQRCodeImage(datos, 350, 350, QR_CODE_IMAGE_PATH);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
    
    public void generarPDF(String contenido){
        
        String ruta = FileSystems.getDefault().getPath(PDF_PATH).toString();
        
        try{
            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            documento.add(new Paragraph(contenido));
            documento.close();
            
            JOptionPane.showMessageDialog(null,"PDF correctamente creado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Fallo en crear el PDF");

        }
    }
    
}
