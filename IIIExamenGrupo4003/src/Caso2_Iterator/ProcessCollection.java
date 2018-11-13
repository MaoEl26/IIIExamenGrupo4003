/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Iterator;

/**
 *
 * @author Gerardo Villalobos
 */

public interface ProcessCollection {

	public void addProcess(Process p);
	
	public void removeProcess(Process p);
	
	public ProcessIterator iterator(ProcessTypeEnum type);
	
}
