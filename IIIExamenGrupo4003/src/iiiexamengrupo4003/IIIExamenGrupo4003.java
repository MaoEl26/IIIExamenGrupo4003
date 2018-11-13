/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo4003;


import Caso2_Command.Browser;
import Caso2_Command.BrowserJob;
import Caso2_Command.Correo;
import Caso2_Command.CorreoJob;
import Caso2_Command.FileIO;
import Caso2_Command.FileIOJob;
import Caso2_Command.Galeria;
import Caso2_Command.GaleriaJob;
import Caso2_Command.Logging;
import Caso2_Command.LoggingJob;
import Caso2_Command.Musica;
import Caso2_Command.MusicaJob;
import Caso2_Command.SMS;
import Caso2_Command.SMSJob;
import Caso2_Command.Subproceso;
import Caso3_State.*;

 /*
 * @author mcv26
 */
public class IIIExamenGrupo4003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejecución del caso 2.
        System.out.println("-----------------------------------------------------");
        System.out.println("Caso 2 - Iterator");
        
        Subproceso pool = new Subproceso(10);

        

        SMS sms = null;

        SMSJob smsJob = new SMSJob();
        
        Correo correo = null;

        CorreoJob  correoJob = new CorreoJob();

        FileIO fileIO = null;;

        FileIOJob fileIOJob = new FileIOJob();

        Logging logging = null;

        LoggingJob logJob = new LoggingJob();
        
        Galeria galeria = null;
        
        GaleriaJob galeriaJob = new GaleriaJob();
        
        Musica musica = null;
        
        MusicaJob musicaJob = new MusicaJob();
        
        Browser browser = null;
        
        BrowserJob browserJob = new BrowserJob();

        for (int i = 0; i < 8; i++) {

            correo = new Correo();

            correoJob.setCorreo(correo);

            sms = new SMS();

            smsJob.setSMS(sms);

            fileIO = new FileIO();

            fileIOJob.setFileIO(fileIO);

            logging = new Logging();

            logJob.setLogging(logging);
            
            galeria = new Galeria();
            
            galeriaJob.setGaleria(galeria);
            
            musica = new Musica();
            
            musicaJob.setMusica(musica);
            
            browser = new Browser();
            
            browserJob.setBrowser(browser);
            

            pool.addJob(correoJob);

            pool.addJob(smsJob);

            pool.addJob(fileIOJob);

            pool.addJob(logJob);
            
            pool.addJob(galeriaJob);
            
            pool.addJob(musicaJob);
            
            pool.addJob(browserJob);

        }

        pool.shutdownPool();

           
                
        System.out.println("-----------------------------------------------------");
        
        //Ejecucion Caso 3
        System.out.println("Caso 3 State");
        Robot robot = new Robot();
        Estado on = new On();
        Estado off = new Off();
        Estado walk = new Walk();
        Estado cook = new Cook();
        
        System.out.print(on.toString()+": ");
        on.Accion(robot);
        System.out.print(off.toString()+": ");
        off.Accion(robot);
        System.out.print(cook.toString()+": ");
        cook.Accion(robot);
        System.out.print(walk.toString()+": ");
        walk.Accion(robot);
        System.out.print(off.toString()+": ");
        off.Accion(robot);
        System.out.print(on.toString()+": ");
        on.Accion(robot);
        System.out.print(cook.toString()+": ");
        cook.Accion(robot);
        System.out.print(off.toString()+": ");
        off.Accion(robot);
        System.out.print(walk.toString()+": ");
        walk.Accion(robot);
        System.out.print(off.toString()+": ");
        off.Accion(robot);
        
          
        
    }
    
}
