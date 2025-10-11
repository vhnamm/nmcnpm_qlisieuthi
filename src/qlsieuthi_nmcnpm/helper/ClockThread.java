/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class ClockThread implements Runnable{
    private JLabel targetLabel;
    private boolean isRunning = true;
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public ClockThread(JLabel targetLabel){
        this.targetLabel = targetLabel;
    }
    @Override
    public void run(){
        while(isRunning){
            try {
                LocalDateTime lcDateTime = LocalDateTime.now();
                String formattedLcTime = lcDateTime.format(dateTimeFormatter);
                SwingUtilities.invokeLater(() -> this.targetLabel.setText(formattedLcTime));
                System.out.println("Luồng clock chạy");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    
    public void stopClockThread(Thread t){
        this.isRunning = false;
        if(t != null || t.isAlive()){
            t.interrupt();
        }
    }
    
}
