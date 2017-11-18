
public class Stat {

	private double[] data;
	public Stat(){
		double[]data=new double[0];
		this.data=data;
}
	public Stat(double[] d){
	setData(d);
	data=getData();
	}
	public double[] getData(){
		return data;
	}
	public void setData(double[] d){
		this.data=d;
	}
	public boolean equals(Stat s){
		boolean isTrue;
		if (s.toString().equals(data.toString()));
			isTrue=true;
			return isTrue;
			
		
			
		
				
		
	}
	public String toString(){
		String temp ="[";
		//if(data.length==1){
			//temp+=data[(data.length-1)];
		//}
		for(int i=0;i<(data.length); i++){
			if(data.length==0)
				temp=temp+data[0];
			
				
			temp+=this.data[i]+",";
			//if(i==(data.length-1))
				//temp+=data[i];
			
		}
		return temp.substring(0, temp.length()-1)+"]";
		
		
		
		
		
	}
	public double min(){
		double min = this.data[0];
		for(int i=1;i<this.data.length;i++){
			if (this.data[i]<min)
				min=this.data[i];
			//else 
				//min=data[0];
		}
		return min;
		}
		public double max(){
			double temp=this.data[0];
			for(int i=0;i<data.length;i++){
				if(data[i]>temp)
					temp=data[i];
			}
			return temp;
		}
		public double average(){
			double sum=0;
			for(int i=0;i<data.length;i++)
				sum=sum+data[i];
			return sum/data.length;
		}
		public double mode(){
			double f = 0;
		    for(int i=0; i<data.length; i++){
		        for(int j=1; j<data.length-i; j++){
		            if(data[j-1] > data[j]){
		                f = data[j-1];
		                data[j-1] = data[j];
		                data[j] = f;
		            }
		        }
		    }

		    double mode = data[0];
		    int temp = 1;
		    int temp2 = 1;
		    for(int i=1;i<data.length;i++){
		        if(data[i-1] == data[i]){
		            temp++;
		        }
		        else {
		            temp = 1;
		        }
		        if(temp >= temp2){
		            mode = data[i];
		            temp2 = temp;
		        }
		    }
		    return mode;
		}
		
	//}
public static void main(String[] args) {
	double[] data={-5.3,2.5,88.9,0.0,0.0,28,16.5,88.9,109.5,-90,88.9};
	double[]data2={100.34,50.01,50.01,-8};
	Stat stat1=new Stat();
	System.out.println("stat1 data = " + stat1.toString());
	stat1=new Stat(data);
	System.out.println("stat1 has been altered. ");
	//System.out.println(data.length);
	//System.out.println(data[0]);
	//System.out.println(data[3]);
	System.out.println("stat1 data = " + stat1.toString());
	System.out.println("stat1 max = "+ stat1.max());
	System.out.println("stat1 min = " + stat1.min());
	System.out.println("stat1 average = "+ stat1.average());
	System.out.println("stat1 mode = " + stat1.mode()+ "\n");
	Stat stat2= new Stat();
	stat2.setData(data2);
	Stat stat3= new Stat(stat1.getData());
	System.out.println("stat2 data = " + stat2.toString());
	System.out.println("stat3 data = " + stat3.toString());
	System.out.println(stat3.equals(stat1));
	System.out.println(stat3.mode());
	
	//double[] data1={10.0,20.0,30.0};
	//Stat stat2=new Stat();
	//stat2.setData(data1);
	//Stat stat3=new Stat(data1);
	//double[] data2=stat2.getData();
	//System.out.println("the arrays are identical: "+ (data1==data2));
	//System.out.println("stat3 equals stat2: "+ stat3.equals(stat3));
	//System.out.println("stat2 equals stat3: "+ stat2.equals(stat3));
	//System.out.println(stat3.toString());
	
	
	
	
	
	
	
	
}
}





