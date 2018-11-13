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
public class On implements Estado {
    
    public On(){
    }    
    /**
     *
     * @param robot
     */
    @Override
    public void Accion(Robot robot){
        if(robot.getEstado()== null || robot.getEstado().toString().equals("Off")){
           System.out.println("Encendiendo.... \n Esperando instruccion");
           robot.setEstado(this); 
        }else{  
           System.out.println("Accion Invalida");
        }
    }
    
    @Override
    public String toString(){
        return "On";
    }    
}
