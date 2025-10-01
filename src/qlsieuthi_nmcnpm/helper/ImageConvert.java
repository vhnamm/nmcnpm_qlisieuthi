/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class ImageConvert {
    public static byte[] getImageToByte(ImageIcon imgIcon){
        // lấy img từ ImageIcon chứa trong Jlabel được truyền vào
        Image img = imgIcon.getImage();
        //Tạo buffred Image
        BufferedImage bimage = new BufferedImage(imgIcon.getIconWidth(), imgIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        
        //"vẽ" hình truyền vào vào trong BufferedImage vừa tạo > lúc này mới thật sự có ảnh
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0,null);
        bGr.dispose();
        
        // Ghi ra mảng byte với format JPG
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] byteArr = null;
        try {
            ImageIO.write(bimage, "jpg", baos);
            baos.flush();
            byteArr = baos.toByteArray();
            baos.close();
        } catch (IOException ex) {
            Logger.getLogger(ImageConvert.class.getName()).log(Level.SEVERE, null, ex);
        }
        return byteArr;
    }
}
