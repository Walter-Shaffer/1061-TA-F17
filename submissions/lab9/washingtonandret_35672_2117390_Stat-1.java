
public class Stat {

	private double[] data;
	
	public Stat(){
		double[] array = {0.0};
		this.data = array;
		
	public double[] getData(){
		double[] arrayOne = new double [data.length];
		for(int j = 0; j < data.length; j++){
			arrayOne[j] = data[j];
		}
			return arrayOne;
	}
	public void setData(double[] d){
		double [] arrayTwo = new double [d.length];
		for(int j = 0; j < d.length; j++ ){
			arrayTwo[j] = d[j];
	}
		data = arrayTwo;
	}
	public boolean equals(Stat s){
		boolean isEquals = true;
		if(data.equals(this.data));{
		}	
			return false;
	}
	
	
	public String toString(){
		String d = String.format(" [ ");
		for(int j = 0; j < data.length; j++){
			d += data[j] + ",";
			System.out.print(" " + d);
		}
		System.out.print( "] ");
			return"";
	}
	
	public double min(){
		double minValue = data[0];
		for(int j = 1; j < data.length; j++){
			if(data [j] < minValue)
				minValue = data[j];
		}
			return minValue;
	}
	
	public double max(){
		double maxValue = data[0];
		for(int j = 1; j < data.length; j++){
			if(data[j] > data[j])
				maxValue = data[j];
		}
			return maxValue;
	}	
	public double average(){
		double sum = 0;
		for(int j = 0; j < data.length; j++){
			sum = (sum + data[j]);
		}
		double average = sum / data.length;
			return average;
	}
	
	public double mode(){
		double mode = data[0];
		double maxCount = 0;
		double count = 1;
		for(int j = 0; j < data.length; j++){
			double value = data[j];
			for(int i = 0; i < data.length; i++){
				if(data[i] ==value) {
						count++;
				}
		if (count > maxCount){
			mode = value; maxCount = count;
			}
	}
		}
		
			return mode;
	}
	/*public static void main(String[] args){
		Stat stat = new Stat();
		System.out.println("stat data = " + stat1.toString());
		System.out.println("stat min = " + stat1.min());
		System.out.println("stat average = " + stat1.average());
		System.out.println("stat mode = " + stat1.mode());
		System.out.println("stat data = " + stat1.toString());
	}*/
		
		
		
		
		
		
		
}
	
