/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Command;

/**
 *
 * @author Gerardo Villalobos
 */
public class TestCommandPattern {

    public static void main(String[] args)

    {

        init();

    }

    private static void init()

    {

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

    }

}

