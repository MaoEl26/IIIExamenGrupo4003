/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiiexamengrupo4003;

import Caso2_Iterator.ProcessCollection;
import Caso2_Iterator.ProcessCollectionImpl;
import Caso2_Iterator.ProcessIterator;
import Caso2_Iterator.ProcessTypeEnum;
import Caso3_State.*;

 /*
 * @author mcv26
 */
public class IIIExamenGrupo4003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejecución del caso 2.
        System.out.println("-----------------------------------------------------");
        System.out.println("Caso 2 - Iterator");
        
                ProcessCollection process = populateProcess();
		ProcessIterator baseIterator = process.iterator(ProcessTypeEnum.ALL);
		while (baseIterator.hasNext()) {
			Caso2_Iterator.Process p = baseIterator.next();
			System.out.println(p.toString());
		}
		System.out.println("******");
		// Process Type Iterator
		ProcessIterator smsIterator = process.iterator(ProcessTypeEnum.SMS);
		while (smsIterator.hasNext()) {
			Caso2_Iterator.Process p = smsIterator.next();
			System.out.println(p.toString());
		}
                
        System.out.println("-----------------------------------------------------");
        
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
    
    private static ProcessCollection populateProcess() {
		ProcessCollection process = new ProcessCollectionImpl();
		process.addProcess(new Caso2_Iterator.Process(1, ProcessTypeEnum.EMAIL));
		process.addProcess(new Caso2_Iterator.Process(2, ProcessTypeEnum.SMS));
		process.addProcess(new Caso2_Iterator.Process(3, ProcessTypeEnum.GALLERY));
		process.addProcess(new Caso2_Iterator.Process(4, ProcessTypeEnum.PLAY_MUSIC));
		process.addProcess(new Caso2_Iterator.Process(5, ProcessTypeEnum.PLAY_VIDEO));
		process.addProcess(new Caso2_Iterator.Process(6, ProcessTypeEnum.BROWSER));
		process.addProcess(new Caso2_Iterator.Process(7, ProcessTypeEnum.TEXT_FILE));
		process.addProcess(new Caso2_Iterator.Process(8, ProcessTypeEnum.BD));
		process.addProcess(new Caso2_Iterator.Process(9, ProcessTypeEnum.YOUTUBE));
                process.addProcess(new Caso2_Iterator.Process(10, ProcessTypeEnum.SMS));
		return process;
	}
    
}
