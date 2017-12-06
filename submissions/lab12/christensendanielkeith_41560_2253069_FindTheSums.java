public class FindTheSums {

	
	public static String arrayToString(int[][] a) {
		
		String output = "";
		if (a==null) {
			
		}
		else {
			for(int i = 0; i<a.length; i++) {
				
				for(int j = 0; j<a[i].length; j++) {
					
					if (j == a[i].length-1) {
						
						if(i == a.length-1) {
							output+=a[i][j];
						}
						else{
							output+=a[i][j]+"\n";
						}
					
					}
					else {
						output+=a[i][j]+" ";
					}
				}
			}
		}
		output.trim();
		return output;
		
		
		
		
	}
	
	
	
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		
		int[][] output = new int[a.length][a[0].length];
		
		for(int i = 0 ; i<a.length; i++) {
			
			for(int j = 0; j<a[0].length; j++) {
				
				output[i][j] = 0;
			
			}
		}
		
		for(int i = 0; i<a.length; i++) {//goes through arrays in a
			
		    for(int j=0; j<a[i].length; j++) {//goes through elements of the ith array in a
				 
		    	int sum = 0;
		    	
		    	int count = 0;
		    	
		    	while(sum<sumToFind && j+count<a[i].length) {
		    		
		    		sum+=a[i][j+count];
		    		
		    		count++;
		    		
		    	}
		    	
		    	if(sum==sumToFind) {
		    		
		    		for(int k = 0; j+k<j+count; k++) {
		    		
		    			output[i][j+k]=a[i][j+k];
		    		
		    		}
		    	}	
			}
		}
		
		return output;
	
	}
	
	
	
	
	
    public static int[][] verticalSums(int[][] a, int sumToFind){
		
    	int[][] transpose = new int[a[0].length][a.length];
    	
    	for(int i = 0; i<a[0].length; i++) {
    		
    		for(int j = 0; j<a.length; j++) {
    			
    			transpose[i][j] = a[j][i];
    		}
    		
    	}
    	
    	int[][] transposedOutput = horizontalSums(transpose, sumToFind);
    	
    	int[][] output = new int[a.length][a[0].length];
    	
        for(int i = 0; i<a.length; i++) {
    		
    		for(int j = 0; j<a[0].length; j++) {
    			
    			output[i][j] = transposedOutput[j][i];
    		}
    		
    	}
        
        return output;
    	
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}