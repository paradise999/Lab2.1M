/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2m;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab-2
 */



class AT2 extends Thread
{
    String s;
    
    AT2(String a){
        s = a;
    }
    
	@Override
	public void run()	//Этот метод будет выполнен в побочном потоке
	{            
            while(true){
                try { 
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AT2.class.getName()).log(Level.SEVERE, null, ex);
                }
         System.out.println(s);      
            }
        }
}

public class Lab21M
{
        static AT2 at;
        public static int c = 0;
        public static boolean bc = true;
        
        
	public static void main(String[] args)
	{
            
		//Создание потока
	Scanner sc = new Scanner(System.in);				
        String str = sc.nextLine();
        at = new AT2(str);
        at.start();
	System.out.println("Главный поток завершён...");
	}
}


