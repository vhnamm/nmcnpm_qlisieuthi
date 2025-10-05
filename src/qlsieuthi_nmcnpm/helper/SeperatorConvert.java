/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class SeperatorConvert {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,###");
    
    public static String doubleToThousandFormatted(double x){
        return decimalFormat.format(x);
                
    }
    
    public static double thousandFormattedToDouble(String x){
        x = x.replace(".", "");
        return Double.parseDouble(x);
    }
}
