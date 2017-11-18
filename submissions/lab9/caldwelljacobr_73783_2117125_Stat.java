
public class Stat {

	private double[] data;
	
	public Stat() {
		double[] d = {0};
		data = d;
	}
	
	public Stat (double[] d) {
		setData(d);
		//double[] newArray = d;
		//this.data = newArray;
	}
	
	public double[] getData() {
		double[] d = data.clone();
		return d;
	}
	
	public void setData(double[] d) {
		double[] newArray = d;
		data = newArray;
		
	}
	
	public boolean equals(Stat s) {
		double[] newArray = s.getData();
		boolean equal = false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == newArray[i]) {
				equal = true;
			}
			else {
				equal = false;
				i = data.length;
				
			}
		}
		return equal;
	}
	
	public String toString() {
		double[] d = getData();
		String values = "[";
		for (int i = 0; i < d.length; i++) {
			values += d[i];
			if ((d.length - 1) > i) {
				values += ", ";
			}
		}
		values += "]";
		return "" + values;
	}
	
	public double min() {
		double min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	
	public double max() {
		double max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	
	public double average() {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		total = total / data.length;
		return total;
	}
	
	public double mode() {
		double mode = Double.NaN;
		int count = 0;
		int greatestCount = 1;
		double value;
		for (int i = 0; i < data.length; i++) {
			 value = data[i];
			 count = 1;
			 for (int k = i + 1; k < data.length; k++) {
				 if (value == data[k]) {
					 count++;
				 } 
			 }
			 if (count == greatestCount) {
				 mode = Double.NaN;
			 }
			 if (count > greatestCount) {
				 greatestCount = count;
				 mode = value;
			 }
		}
		return mode;
	}
	
	public static void main(String[] args) {
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
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
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " +    stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " +  stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==  \"? " + (stat1 == stat3));
	}
	
}
