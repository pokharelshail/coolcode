package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class RemoveZeros {
	
	public void removeZeros(ArrayList<Integer> list) {
		for (int i =0; i < list.size();i++) {
			if (list.get(i) == 0) {
				list.remove(i);
			}
		}	
	}

}
