import java.util.Arrays;

public class Lab09StatTester {
	

	private static boolean test1() {

		System.out.println("Test 1: Default constructor and toString()\n");

		Stat stat1 = new Stat();
		String result = stat1.toString();
		System.out.println("data = " + result);

		System.out.println();

		String reference = "[0.0]";

//		System.out.println("\tExpected:\t" + reference);
//		System.out.println("\tFound:\t\t" + result);

		if (reference.replaceAll("\\s+","").equals(result.replaceAll("\\s+",""))) {
			System.out.println("Passed");
			return true;
		} else {
			System.out.println("Failed");
			return false;
		}
	}

	private static boolean test2() {

		System.out
		.println("Test 2: Stat(double[] d) constructor and toString()\n");

		double[] data1 = { 1, 2, 3, 4, 5};
		Stat stat1 = new Stat(data1);
		String result = stat1.toString();
		System.out.println("data = " + result);
		
		System.out.println();

		String reference = "[1.0, 2.0, 3.0, 4.0, 5.0]";
		
		//System.out.println("\tExpected:\t" + reference);
		//System.out.println("\tFound:\t\t" + result);

		if (reference.replaceAll("\\s+","").equals(result.replaceAll("\\s+",""))) {
			System.out.println("Passed");
			return true;
		} else {
			System.out.println("Failed");
			return false;
		}
	}

	private static boolean test3() {

		System.out.println("Test 3: Min test\n");

		////////////
		double min = -20;
		double[] data1 = { min, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		double[] data2 = { 1, 2, 3, 4, 5, min, 6, 7, 8, 9, 0 };
		double[] data3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, min};

		Stat stat1 = new Stat(data1);
		Stat stat2 = new Stat(data2);
		Stat stat3 = new Stat(data3);				
		
		double min1 = stat1.min();
		double min2 = stat2.min();
		double min3 = stat3.min();

		System.out.println("min == min1: " + (min == min1));
		System.out.println("min == min2: " + (min == min2));
		System.out.println("min == min3: " + (min == min3));
		////////////
		
		
		if (min1 == min && min2 == min
			&& min3 == min) {
			System.out.println("\nPassed");
		return true;
	} else {
		System.out.println("\nFailed");
		return false;
	}
}

private static boolean test4() {

	System.out.println("Test 4: Max test\n");

	double max = 2000;
	double[] data1 = { max, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	double[] data2 = { 1, 2, 3, 4, 5, max, 6, 7, 8, 9, 0 };
	double[] data3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, max};

	Stat stat1 = new Stat(data1);
	Stat stat2 = new Stat(data2);
	Stat stat3 = new Stat(data3);				

	double max1 = stat1.max();
	double max2 = stat2.max();
	double max3 = stat3.max();

	System.out.println("max == max1: " + (max == max1));
	System.out.println("max == max2: " + (max == max2));
	System.out.println("max == max3: " + (max == max3));



	if (max1 == max && max2 == max
		&& max3 == max) {
		System.out.println("\nPassed");
	return true;
} else {
	System.out.println("\nFailed");
	return false;
}
}

private static boolean test5() {

	System.out.println("Test 5: Average test\n");

	double[] data2 = { 10, 10, 10, 10, 10, 10, 20, 20 };
	double[] data3 = { 1, 2, 2, 3, 3, 4 };

	Stat stat1 = new Stat();
	Stat stat2 = new Stat(data2);
	Stat stat3 = new Stat(data3);

	double refAvg1 = 0;
	double refAvg2 = 12.5;
	double refAvg3 = 2.5;

	double average1 = stat1.average();
	double average2 = stat2.average();
	double average3 = stat3.average();


	System.out.println("refAvg1 == average1: " + (refAvg1 == average1));
	System.out.println("refAvg2 == average2: " + (refAvg2 == average2));
	System.out.println("refAvg3 == average3: " + (refAvg3 == average3));


	if (average1 == refAvg1 && average2 == refAvg2
		&& average3 == refAvg3) {
		System.out.println("\nPassed");
	return true;
} else {
	System.out.println("\nFailed");
	return false;
}
}

private static boolean test6() {

	System.out.println("Test 6: Mode test\n");

	double[] data2 = { 10, 10, 10, 10, 10, 10, 20, 20 };
	double[] data3 = { 1, 2, 2, 3, 3, 4 };

	Stat stat1 = new Stat();
	Stat stat2 = new Stat(data2);
	Stat stat3 = new Stat(data3);

	double refMode1 = 0.0;
	double refMode2 = 10;

	double mode1 = stat1.mode();
	double mode2 = stat2.mode();
	double mode3 = stat3.mode();

	System.out.println("refMode1 == mode1: " + (refMode1 == mode1));
	System.out.println("refMode2 == mode2: " + (refMode2 == mode2));
	System.out.println("refMode3 == mode3: " + Double.isNaN(mode3));

	if (mode1 == refMode1 && mode2 == refMode2
		&& Double.isNaN(mode3)) {
		System.out.println("\nPassed");
	return true;
} else {
	System.out.println("\nFailed");
	return false;
}
}

private static boolean test7() {

	System.out.println("Test 7: Equals Test\n");

	double[] data1 = { 1, 2, 2, 3, 3, 4 };
	double[] data2 = { 1, 2, 2, 3, 3, 4 };
	double[] data3 = { 2, 2, 3, 3 };

	Stat stat1 = new Stat(data1);
	Stat stat2 = new Stat(data2);
	Stat stat3 = new Stat(data3);

	boolean res1 = stat1.equals(stat1);
	boolean res2 = stat2.equals(stat1);
	boolean res3 = !stat3.equals(stat2);

	System.out.println("stat1.equals(stat1): " + res1);
	System.out.println("stat2.equals(stat1): " + res2);
	System.out.println("!stat3.equals(stat2): "+ res3);

	if (res1 && res2 && res3) {
		System.out.println("\nPassed");
		return true;
	} else {
		System.out.println("\nFailed");
		return false;
	}
}

private static boolean test8() {

	System.out.println("Test 8: Getter/Setter test\n");

	double[] data1 = { 1, 2, 3, 4 };
	double[] data2 = { 1, 2, 3, 4};
	Stat stat1 = new Stat();
	stat1.setData(data1);

	data1[0] = 0;
	double[] data3 = stat1.getData();
	boolean result = Arrays.equals(data2,  data3);
	System.out.println("data2 equals data3: " + result);

	if (result){
		System.out.println("\nPassed");
		return true;
	} else{
		System.out.println("\nFailed");
		return false;
	}
		//return result;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int grade = 0; 

		try {
			if(test1())
				grade += 15;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test2())
				grade += 15;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test3())
				grade += 15;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test4())
				grade += 15;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test5())
				grade += 10;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test6())
				grade += 10;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test7())
				grade += 10;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.println();

		try {
			if(test8())
				grade += 10;
		} catch (Exception e) {
			System.out.print(e);
		}

		System.out.print("\nGrade=" + grade);
		
	}

}
