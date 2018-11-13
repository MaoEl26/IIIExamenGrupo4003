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
public class BrowserJob implements Job{

    private Browser browser;

    public void setBrowser(Browser browser) {

        this.browser = browser;

    }

    @Override

    public void run() {

        System.out.println("Job ID: "+Thread.currentThread().getId()+" ejecutando browser jobs.");

        if(browser!=null){

            browser.abrirBrowser();

        }

        try {

            Thread.sleep(1000);

       } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }

}

