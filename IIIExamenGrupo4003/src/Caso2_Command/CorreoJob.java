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
public class CorreoJob implements Job{
    private Correo correo;

     

    public void setCorreo(Correo correo){

        this.correo = correo;

    }

     

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando correo jobs.");

        if(correo!=null){

            correo.enviarCorreo();

        }

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}
