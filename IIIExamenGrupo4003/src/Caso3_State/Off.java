/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_State;

/**
 *
 * @author mcv26
 */
public class Off implements Estado {
    
    //private Estado cook = new Cook();
    
    public Off(){
     
    }
    
    @Override
    public void Accion(Robot robot) {
        if(!("Cook".equals(robot.getEstado().toString()))){
            System.out.println("Apagando");
            robot.setEstado(this);
        }else{
            System.out.println("Accion Invalida");
        }
    }
        
    @Override
    public String toString(){
        return "Off";
    }
}
