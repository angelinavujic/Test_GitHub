package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrrayListExample2 {
	
	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		
		
		 trimNonGrowingNumbers(numbers);
	        System.out.println(numbers); 
	}
	
	public static void trimNonGrowingNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; ) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
            	numbers.remove(i+1);
            }else {
            	i++;
            	
            }
            	
            }
            
	}
}
