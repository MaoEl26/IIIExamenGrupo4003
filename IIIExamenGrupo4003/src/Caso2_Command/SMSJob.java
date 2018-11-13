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
public class SMSJob implements Job{

    private SMS sms;

    public void setSMS(SMS sms) {

        this.sms = sms;

    }

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando sms jobs.");

        if(sms!=null){

            sms.enviarSMS();

        }

        try {

            Thread.sleep(1000);

       } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}

