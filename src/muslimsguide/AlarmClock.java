/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muslimsguide;

/**
 *
 * @author SHISHIR
 */
import java.awt.Font;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AlarmClock {
    public static void alarmaudio()
    {
        
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/SHISHIR/Documents/NetBeansProjects/MuslimsGuide/src/muslimsguide/birds.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception e){
            System.out.println("File not found");
        }
    }
    public void initalarm(String waqt, int hr, int mn)
    { 
        Thread t = new Thread(){
            @Override
            public void run()
            {
                while(true)
                {
                    Calendar c = new GregorianCalendar();
                    int hours = c.get(Calendar.HOUR);
                    int mins = c.get(Calendar.MINUTE);  
                    if(hr == hours && mn == mins)
                    {
                        alarmaudio();
                        JLabel label = new JLabel("Its Time For "+waqt+" Salah");
                        label.setFont(new Font("Times New Roman", Font.BOLD, 16));
                        JOptionPane.showMessageDialog(null,label,"Salah",JOptionPane.DEFAULT_OPTION);
                        JOptionPane.showMessageDialog(null, "Its "+waqt+" Time");
                        break;
                    }
                }
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }
}
