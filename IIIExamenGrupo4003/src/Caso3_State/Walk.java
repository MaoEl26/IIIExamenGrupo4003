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
public class Walk implements Estado{

    public Walk(){
    
    }
    
    @Override
    public void Accion(Robot robot) {
        System.out.println("Camindando");
        robot.setEstado(this);
    }
    
    @Override
    public String toString(){
        return "Walk";
    }  
}
