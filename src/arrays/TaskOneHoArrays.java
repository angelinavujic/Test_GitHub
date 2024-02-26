package arrays;

public class TaskOneHoArrays {
	
	int[] dailyGains = {1000, 2000, 500, 9000, 9010};
	
	public static int count5PercentJumps(int[]gains) {
		if(gains == null) {
			System.out.println("Array darf nicht null sein");
			return 0;
		}else {
		 int count = 0;
	        for (int i = 1; i < gains.length; i++) {
	            int currentGain = gains[i];
	            int previousGain = gains[i - 1];
	            double fivePercentIncrease = previousGain * 0.05; 
	            if (currentGain >= previousGain + fivePercentIncrease) {
	                count++;
	            }
	        }
		
	        return count; 
		}
	    } 
	
	public static void main(String[]args) {
		int[] dailyGains = {1000, 2000, 500, 9000, 9010};
		 int count = count5PercentJumps(dailyGains);
		    System.out.println("Anzahl der 5%igen Sprünge: " + count);
	}
	
}
	
	
	





