/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ADMIN
 */
public class DateConverter {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public static LocalDateTime stringToLocalDateTime(String time){
        LocalDateTime lcDateTime = LocalDateTime.parse(time, dateTimeFormatter);
        return lcDateTime;
    }
}
