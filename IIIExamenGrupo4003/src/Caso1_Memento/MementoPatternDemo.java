/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Memento;



import java.util.ArrayList;

/*Clase main */
public class MementoPatternDemo {
    public static void main(String[] args) {
        
        /*Lista que ira almacenando los mementos*/
        ArrayList<Memento> careTaker = new ArrayList<Memento>();
        
       /*Clase originator la cual se encarga de ir generando los ejemplares para convertirlos en mementos*/ 
      Originator originator = new Originator();
      
      
      /*Estado inicial con los valores en 0*/
      /*Estado base de la calculadora con las 3 variables en 0 y la operacion nula*/
      originator.setState("Estado 0");
      originator.setV1(0);
      originator.setV2(0);
      originator.setV3(0);
      originator.setOperacion("");
      originator.imprimirEstado();
      careTaker.add(originator.saveStateToMemento());
      
      
      /*Estado 1 Se le suma 3 a la variable 1*/
      originator.setState("Estado 1");
      originator.setV1(originator.getV1()+3);
      originator.setV2(originator.getV2());
      originator.setV3(originator.getV3());
      originator.setOperacion("+");
      originator.imprimirEstado();
      careTaker.add(originator.saveStateToMemento());
      
      /*Estado 2 Se le suma 1 a la variable 2*/
      originator.setState("Estado 2");
      originator.setV1(originator.getV1());
      originator.setV2(originator.getV2()+1);
      originator.setV3(originator.getV3());
      originator.setOperacion("+");
      originator.imprimirEstado();
      careTaker.add(originator.saveStateToMemento());
      
      
      /*Estado 3 Se le suma 9 a la variable 3*/
      originator.setState("Estado 3");
      originator.setV1(originator.getV1());
      originator.setV2(originator.getV2());
      originator.setV3(originator.getV3()+9);
      originator.setOperacion("+");
      originator.imprimirEstado();
      careTaker.add(originator.saveStateToMemento());
      
      /*Estado 4 Se le suma a v1 v2*/
      originator.setState("Estado 4");
      originator.setV1(originator.getV1()+originator.getV2());
      originator.setV2(originator.getV2());
      originator.setV3(originator.getV3());
      originator.setOperacion("+");
      originator.imprimirEstado();
      careTaker.add(originator.saveStateToMemento());
      
      
      /*Deshacer un estado*/
      careTaker.remove(careTaker.remove(careTaker.size()-1)); /*Se remueve de la lista de mementos el ultimo memento*/
      
      /*Se asignar a originator todos los valores del ultimo memento guardado en la lista careTaker*/
      originator.getOperacionFromMemento(careTaker.get(careTaker.size()-1));
      originator.getStateFromMemento(careTaker.get(careTaker.size()-1));
      originator.getV1FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV2FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV3FromMemento(careTaker.get(careTaker.size()-1));
      originator.imprimirEstado();
      
      
      /*Regresar cierta cantidad d e estados*/
      int cantidad = 2;/*Numero a elegir*/
      for (int i=0; i<cantidad;i++){
          careTaker.remove(careTaker.size()-1);
      }
      /*Se asignar a originator todos los valores del ultimo memento guardado en la lista careTaker*/
      originator.getOperacionFromMemento(careTaker.get(careTaker.size()-1));
      originator.getStateFromMemento(careTaker.get(careTaker.size()-1));
      originator.getV1FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV2FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV3FromMemento(careTaker.get(careTaker.size()-1));
      originator.imprimirEstado();
      
      
      /*Regresar a un estado base*/
      
      for (int i=0;i<careTaker.size()-1; i++){
          careTaker.remove(careTaker.size()-1); /*Se eliminan todos los mementos eceptuando el primero*/
      }
      
      /*Se asignar a originator todos los valores del ultimo memento guardado en la lista careTaker*/
      originator.getOperacionFromMemento(careTaker.get(careTaker.size()-1));
      originator.getStateFromMemento(careTaker.get(careTaker.size()-1));
      originator.getV1FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV2FromMemento(careTaker.get(careTaker.size()-1));
      originator.getV3FromMemento(careTaker.get(careTaker.size()-1));
      originator.imprimirEstado();
     

     
      
   }
    
}