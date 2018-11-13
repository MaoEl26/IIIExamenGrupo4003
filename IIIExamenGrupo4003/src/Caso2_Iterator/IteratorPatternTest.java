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

public class IteratorPatternTest {

	public static void main(String[] args) {
		ProcessCollection process = populateProcess();
		ProcessIterator baseIterator = process.iterator(ProcessTypeEnum.ALL);
		while (baseIterator.hasNext()) {
			Process p = baseIterator.next();
			System.out.println(p.toString());
		}
		System.out.println("******");
		// Channel Type Iterator
		ProcessIterator smsIterator = process.iterator(ProcessTypeEnum.SMS);
		while (smsIterator.hasNext()) {
			Process p = smsIterator.next();
			System.out.println(p.toString());
		}
	}

	private static ProcessCollection populateProcess() {
		ProcessCollection process = new ProcessCollectionImpl();
		process.addProcess(new Process(1, ProcessTypeEnum.EMAIL));
		process.addProcess(new Process(2, ProcessTypeEnum.SMS));
		process.addProcess(new Process(3, ProcessTypeEnum.GALLERY));
		process.addProcess(new Process(4, ProcessTypeEnum.PLAY_MUSIC));
		process.addProcess(new Process(5, ProcessTypeEnum.PLAY_VIDEO));
		process.addProcess(new Process(6, ProcessTypeEnum.BROWSER));
		process.addProcess(new Process(7, ProcessTypeEnum.TEXT_FILE));
		process.addProcess(new Process(8, ProcessTypeEnum.BD));
		process.addProcess(new Process(9, ProcessTypeEnum.YOUTUBE));
                process.addProcess(new Process(10, ProcessTypeEnum.SMS));
		return process;
	}

}

