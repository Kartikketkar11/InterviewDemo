package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();
		
		Boolean cond = false;
		
		a1.add(1);
		a1.add(4);
		a1.add(3);
		a1.add(5);
		
		a2.add(1);
		a2.add(3);
		a2.add(4);
		
		
        Collections.sort(a1);

try {
		for(int i =0; i<a1.size();i++) {
		 
			if(a1.get(i)==a2.get(i)) {
				cond = true;
			}
			else {
				cond = false;
			}
			
		}
}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Both list should be of same size");
}
		

	}

}
