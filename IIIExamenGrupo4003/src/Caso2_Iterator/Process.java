package Caso2_Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo Villalobos
 */

public class Process {

	private int codigo;
	private ProcessTypeEnum TYPE;
	
	public Process(int cod, ProcessTypeEnum type){
		this.codigo=cod;
		this.TYPE=type;
	}

	public double getCodigo() {
		return codigo;
	}

	public ProcessTypeEnum getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString(){
		return "Codigo="+this.codigo+", Type="+this.TYPE;
	}
	
}
