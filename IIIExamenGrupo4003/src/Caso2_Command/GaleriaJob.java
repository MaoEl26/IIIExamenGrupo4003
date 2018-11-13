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
public class GaleriaJob implements Job{

    private Galeria galeria;

    public void setGaleria(Galeria galeria) {

        this.galeria = galeria;

    }

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando galeria jobs.");

        if(galeria!=null){

            galeria.abrirGaleria();

        }

        try {

            Thread.sleep(1000);

       } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}