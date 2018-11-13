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

import java.util.ArrayList;
import java.util.List;

public class ProcessCollectionImpl implements ProcessCollection {

	private List<Process> processList;

	public ProcessCollectionImpl() {
		processList = new ArrayList<>();
	}

	public void addProcess(Process p) {
		this.processList.add(p);
	}

	public void removeProcess(Process p) {
		this.processList.remove(p);
	}

	@Override
	public ProcessIterator iterator(ProcessTypeEnum type) {
		return new ProcessIteratorImpl(type, this.processList);
	}

	private class ProcessIteratorImpl implements ProcessIterator {

		private ProcessTypeEnum type;
		private List<Process> process;
		private int position;

		public ProcessIteratorImpl(ProcessTypeEnum ty,
				List<Process> processList) {
			this.type = ty;
			this.process = processList;
		}

		@Override
		public boolean hasNext() {
			while (position < process.size()) {
				Process p = process.get(position);
				if (p.getTYPE().equals(type) || type.equals(ProcessTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Process next() {
			Process p = process.get(position);
			position++;
			return p;
		}

	}
}

