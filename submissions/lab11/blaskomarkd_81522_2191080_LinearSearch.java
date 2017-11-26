public class LinearSearch {

    public static int getFirstIndex(double item, double[] x) { //For when arguments are doubles
	int index = -1;
	for (int i = 0; i < x.length; i++) {
	    if (item == x[i]) {
		if (index == -1) {
		index = i;
		}
	    }
	}
	return index;
    }
    
    public static int getFirstIndex(String item, String[] x) { //For when arguments are Strings
	int index = -1;
	for (int i = 0; i < x.length; i++) {
	    if (item.equals(x[i])) {
		if (index == -1) {
		    index = i;
		}
	    }
	}
		return index;
    }
    
    public static void main(String[] args) {
       
	if (args[0].equals( "-s")) { //First Argument
	    String[] x = new String[args.length - 3];
	    for(int i = 0; i < x.length; i++) {
		x[i] = args[i+3];
	    }
	    if (LinearSearch.getFirstIndex(args[1], x) != -1) {
		System.out.println(args[1] + " found in x at index " +  LinearSearch.getFirstIndex(args[1], x));
	    }
	    else {
		System.out.println(args[1] + " not found in x");
	    }
	} //end of if

	else if (args[0].equals("-d")) { //First Argument
	    double item = Double.parseDouble(args[1]);
	    double[] x = new double[args.length - 3];
	    for (int i = 0; i < x.length; i++) {
		x[i] = Double.parseDouble(args[i+3]);
	    }
	    if (LinearSearch.getFirstIndex(item, x) != -1) {
		    System.out.println(item + " found in x at index " + LinearSearch.getFirstIndex(item, x));
		}
	   else {
	       System.out.println(item + " not found in x");
	   }
       	} //end of else if

    } //end of main

} //end of class
