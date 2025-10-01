/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

/**
 *
 * @author ADMIN
 */
public class LanguageModify {
    
    private static final String[][] vietnameseDiacritics = {
            {"[áãàạảắăặàẵẳâầậẫấẩ]", "a"},//[abc]: regex
            {"[èéẹẻẽêềếệểễ]", "e"},
            {"[ìíịỉĩ]", "i"},
            {"[òóọỏõôồốộổỗơờớợởỡ]", "o"},
            {"[ùúụủũưừứựửữ]", "u"},
            {"[ỳýỵỷỹ]", "y"},
            {"đ", "d"},
            {"[ÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴ]", "A"},
            {"[ÈÉẸẺẼÊỀẾỆỂỄ]", "E"},
            {"[ÌÍỊỈĨ]", "I"},
            {"[ÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠ]", "O"},
            {"[ÙÚỤỦŨƯỪỨỰỬỮ]", "U"},
            {"[ỲÝỴỶỸ]", "Y"},
            {"Đ", "D"}
        };
    
    public static String removeVietnameseDiacritics(String text){
        String rs = text;
        for (String[] pair : vietnameseDiacritics){
            rs = rs.replaceAll(pair[0], pair[1]);
        }
        return rs;
    }
}
