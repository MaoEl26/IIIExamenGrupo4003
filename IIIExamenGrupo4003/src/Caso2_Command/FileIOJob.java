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
public class FileIOJob implements Job{

    private FileIO fileIO;

    public void setFileIO(FileIO fileIO){

        this.fileIO = fileIO;

    }

     

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando fileIO jobs.");

        if(fileIO!=null){

            fileIO.execute();

        }

         

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}

