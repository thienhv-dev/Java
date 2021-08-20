/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCM;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author THANH
 */
public class currentdateandtime  extends JLabel implements Runnable{

    public  currentdateandtime() {
    
}
 @Override
    public void run() {
        while (true){
            SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss     dd/MM/yyyy");
            this.setText(sd.format(new Date()));
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }
        
    }
    
}