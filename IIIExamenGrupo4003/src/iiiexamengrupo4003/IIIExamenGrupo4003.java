/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo4003;

import Caso3_State.*;

 /*
 * @author mcv26
 */
public class IIIExamenGrupo4003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
