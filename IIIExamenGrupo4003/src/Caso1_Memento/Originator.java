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
public class Originator {
   private String state;
   
   private float v1;
   private float v2;
   private float v3;
   
   private String operacion;
 
   private float uv1;
   private float uv2;
   private float uv3;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getV1() {
        return v1;
    }

    public void setV1(float v1) {
        this.v1 = v1;
    }

    public float getV2() {
        return v2;
    }

    public void setV2(float v2) {
        this.v2 = v2;
    }

    public float getV3() {
        return v3;
    }

    public void setV3(float v3) {
        this.v3 = v3;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }



   

   public Memento saveStateToMemento(){
      return new Memento(state, v1,  v2, v3, operacion);
   }
   
   

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }
   
   public void getV1FromMemento(Memento memento){
      v1 = memento.getV1();
   }
   
   public void getV2FromMemento(Memento memento){
      v2 = memento.getV2();
   }
   
   public void getV3FromMemento(Memento memento){
      v3 = memento.getV3();
   }

   
   public void getOperacionFromMemento(Memento memento){
      operacion = memento.getOperacion();
   }
   
   public void imprimirEstado(){
      System.out.println("Estado actual: "+this.getState());
      System.out.println("Valor x = "+this.getV1());
      System.out.println("Valor y = "+this.getV2());
      System.out.println("Valor z = "+this.getV3());
      System.out.println("Operacion realizada= "+this.getOperacion());
   }
   
   
}