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
public class LoggingJob implements Job{

    private Logging logging;

    public void setLogging(Logging logging){

        this.logging = logging;

    }

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando logging jobs.");

        if(logging!=null){

            logging.log();

        }

         

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}

