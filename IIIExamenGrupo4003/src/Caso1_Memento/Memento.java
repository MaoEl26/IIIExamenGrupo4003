/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Memento;

/**
 *
 * @author andre
 */
public class Memento {
   private String state;
   
   private float v1;
   private float v2;
   private float v3;
   
   private String operacion;
   
    public Memento(String state, float v1, float v2, float v3, String operacion) {
        this.state = state;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.operacion = operacion;
    }
   
   

    public String getState() {
        return state;
    }

    public float getV1() {
        return v1;
    }

    public float getV2() {
        return v2;
    }

    public float getV3() {
        return v3;
    }

    public String getOperacion() {
        return operacion;
    }


    
   	
}