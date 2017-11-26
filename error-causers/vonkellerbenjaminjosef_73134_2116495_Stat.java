import java.util.Arrays;


public class Stat {
private double[] data;
public Stat(){
	double[] a = {0.0};
	data = a;
}
public Stat(double[] d) {
	this.data = d;
}
public double[] getData() {
	double[] a = this.data;
	return a;
}
public void setData(double[] d) {
	this.data = d;
}
public boolean equals(Stat s) {
	int i = 0;
	boolean equals = true;
	while (i != data.length) {
		if (data[i] != s.data[i]) {
			i = data.length;
			equals = false;
		}
	}
	return equals;
}
public String toString() {
	String dataString = "[";
	for (int i = 0; i < data.length; i++) {
		dataString = dataString + data[i] + ", ";
	}
	dataString = dataString.substring(0, (dataString.length()-2));
	dataString = dataString + "]";
	return dataString;
}
public double min() {
	double min = data[0];
	for (int i = 1; i < data.length; i++) {
		if (data[i] < data[i-1]) {
			min = data[i];
		}
	}
	return min;
}
public double max() {
	double max = data[0];
	for (int i = 1; i < data.length; i++) {
		if (data[i] > max) {
			max = data[i];
		}
		else {
			max = max;
		}
	}
	return max;
}
public double average() {
	double average, sum = 0;
	for (int i = 0; i < data.length; i++) {
		sum = sum + data[i];
	}
	average = sum / data.length;
	return average;
}
public double mode() {
	if (data.length ==0) {
		return Double.NaN;
	}
	if (data.length == 1) {
		return data[0];
	}
	if (data.length == 2) {
		if (data[0] == data[1]) {
			return data[0];
		}
		else {
			return Double.NaN;
		}
	}
	double[] a = new double[data.length];
	int[] b = new int[data.length];
	int c = 0;
	for (int i = 0; i < data.length; i++) {
		boolean d = false;
		for (int k = 0; k < c; k++) {
			if (data[i] == a[k]) {
				d = true;
				b[c]++;
			}
		}
		if (!d) {
			a[c] = data[i];
			b[c] = 1;
			c++;
		}
	}
	int max = b[0];
	int q = 0;
	for (int i = 1; i < c; i++) {
		if (b[i] > max) {
			max = b[i];
			q = i;
		}
	}
	int bee = 0;
	for (int i=0; i < c; i++) {
		if (b[i] == max) {
			bee++;
		}
	}
	if (bee == 1) {
		return a[q];
	}
	else {
		return Double.NaN;
	}
	
}
}

