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
public class MusicaJob implements Job{

    private Musica musica;

    public void setMusica(Musica musica) {

        this.musica = musica;

    }

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando musica jobs.");

        if(musica!=null){

            musica.reproducirMusica();

        }

        try {

            Thread.sleep(1000);

       } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}
