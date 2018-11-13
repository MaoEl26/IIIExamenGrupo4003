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
public class Robot {
    Estado estado;
    
    public Robot(){
        estado = null;
        //estado = new Off();
    }
    
    public Estado getEstado() {
        
        if (estado!=null)
            estado.toString();
        return estado;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
}
