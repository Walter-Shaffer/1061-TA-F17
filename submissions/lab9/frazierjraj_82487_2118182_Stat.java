public class Stat {
	private double[] data;
public Stat(){
	this.data = new double[] {0.0};
}
public Stat(double[] d){
	double[] data = new double [d.length];
	for(int i = 0; i <d.length; i++){
		data[i] = d[i];
	}
this.data=data;
}
public String toString(){
	String dataString = "[";
	for(int i = 0; i <this.data.length;i++){
		if(i<data.length-1){
			dataString += (this.data[i]+ ",");}
		else{
			dataString += (this.data[i]);
		}
	}
		return dataString + "]";}
public double[] getData(){
	double[] copyOfData = new double[this.data.length];
	for(int i =0; i<data.length;i++){
		copyOfData[i] = data[i];
	}
	return copyOfData;
}
public void setData(double[] d){
	double[] newData = new double[d.length];
	for(int i =0; i<d.length;i++){
		newData[i] = d[i];
	}
	this.data = newData;
}
public boolean equals(Stat s){
	int value = 0;
	boolean equals = false;
	if(this.data.length==s.data.length){
	for(int i =0; i <data.length;i++){
		if(this.data[i] != s.data[i]){
			value -= 999;
		}
		else{
			value +=1;
		}
	}
	if(value > 0){
		equals = true;
	}
	else if(value<0){
		equals = false;
	}
	}
	return equals;
}
public double min(){
	double min = Integer.MAX_VALUE;
	for(int i = 0; i<this.data.length;i++){
		if(data[i]<min){
			min = data[i];
		}
	}
	return min;
}
public double max(){
	double max = Integer.MIN_VALUE;
	for(int i=0; i<this.data.length;i++){
		if(data[i]>max){
			max = data[i];
		}
	}
	return max;
}
public double average(){
	double sum =0;
	for(int i =0; i<this.data.length;i++){
		sum +=data[i];
	}
	double average = sum/data.length;
	return average;
}
public double mode(){
	
	int [] count = new int[data.length];
	for(int i = 0; i<data.length;i++){
		double n = data[i];
		for(int j = 0; j<data.length;j++){
			if(n == data[j]){
				count[i]+=1;
			}
		}
	}
	double mode = count[0];
	int indexofMax=0;
	for(int i =0;i<count.length;i++){
		if(count[i] > mode){
			mode = count[i];
			indexofMax = i;
		}
	} 
	int maxCount = 0;
	for(int i = 0; i<count.length;i++){
		if(mode == count[i]){
			maxCount ++;
		}
	}
	if(maxCount >mode){
		return Double.NaN;
	}
	else{
		return data[indexofMax];
	}
}

public static void main( String[] args){
	double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88, 109.5, -90, 88.9};
	double[] data2 = {100.34, 50.01, 50.01, -8};
	Stat stat1 = new Stat();
	System.out.println("stat1 data = " + stat1.toString());
	stat1 = new Stat(data);
	System.out.println("stat1 has been altered.");
	System.out.println("stat1 data = " + stat1.toString());
	System.out.println("stat1 min = " + stat1.min());
	System.out.println("stat1 max = " + stat1.max());
	System.out.println("stat1 average = " + stat1.average());
	System.out.println("stat1 mode = " + stat1.mode() + "\n");
	Stat stat2 = new Stat();
	stat2.setData(data2);
	Stat stat3 = new Stat(stat1.getData());
	System.out.println("stat2 data = " + stat2.toString());
	System.out.println("stat3 data = " + stat3.toString());
	System.out.println();
	System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
	stat1.equals(stat2));
	System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
	stat1.equals(stat3));
	System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
	
}}
