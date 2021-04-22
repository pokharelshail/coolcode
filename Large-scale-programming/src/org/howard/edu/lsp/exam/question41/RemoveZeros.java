package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;


public class RemoveZeros {
	
	
	/**
	 * Remove all the zeros from a given list
	 * @param list is list of integers which may or may not contain zeros
	 */
	public void removeZeros(ArrayList<Integer> arr) {
		for (int i =0; i < arr.size();) {
			if (arr.get(i) == 0) {
				arr.remove(i);
			}else {
				i++;
			}
			
		}
	}
	

}
