public class Project3Tester {
	public static int engineTest1() {
		try {
			System.out.println("Engine: Generate/get secret test. ");
			boolean passed = true;
			boolean foundOneEndingIn9 = false;
			boolean foundOneEndingIn0 = false;
			boolean foundOneStartingWith9 = false;

			for (int digits = 2; digits <= 3; digits++) {
				int min = (int) Math.pow(10, digits - 1);
				int max = (int) (Math.pow(10, digits) - 1);
				int trials = (int) Math.pow(100, digits);
				for (int i = 0; i < trials && passed; i++) {
					Engine e = new Engine();
					e.setNumDigits(digits);
					e.generateNewSecret();
					int[] digitArray = e.getSecretNumber();
					// check the size because exception will only be thrown if undersized
					if(digitArray.length != digits) {
						passed = false;
					}
					if(passed){
						if(digitArray[digitArray.length-1] == 9) foundOneEndingIn9 = true;
						if(digitArray[digitArray.length-1] == 0) foundOneEndingIn0 = true;
						if(digitArray[0] == 9) foundOneStartingWith9 = true;
						String secret = "";
						for (int j = 0; j < digitArray.length; j++)
							secret += digitArray[j];
						int result = Integer.parseInt(secret);
						if (result > max || result < min) {
							passed = false;
						}
					}
				}
			}

			System.out.println("Passed: " + passed);

			if(!foundOneEndingIn9 || !foundOneEndingIn0 || !foundOneStartingWith9) {
				System.out.println("\tbut range is too tight.");
				return 5;
			}
			if(passed)
				return 10;
			return 0;
		} catch (Exception e) {
			System.out.println("Failed (exception thrown):");
			System.out.println(e);
			return 0;
		}
	}

	public static int engineTest2() {
		try {
			int digits = 3;
			int min = 100;
			int max = 999;
			System.out.println("Engine: Number conversion test");
			String s = "";
			Engine e = new Engine();
			boolean passed = true;
			for (int i = min; i <= max; i++) {
				s = "" + min;
				int[] digitArray = e.convertNumToDigitArray(s);
				int result = 0;
				String s2 = "";
				for (int j = 0; j < digitArray.length; j++) {
					s2 += digitArray[j];
				}
				if (!s2.equals(s)) {
					//System.out.println("Valued passed is " + s
					//		+ ". Value returned is :" + s2);
					passed = false;
				}
			}
			System.out.println("Passed: " + passed);
			if(passed)
				return 5;
			return 0;
		} catch (Exception e) {
			System.out.println("Failed (exception thrown):");
			System.out.println(e);
			return 0;
		}
	}

	public static int playerTest1() {
		try {
			//boolean passed = true;
			System.out.println("Player: Name test.");
			String[] names = { "Alice", "Bob", "Carol", "Dan", "Edward" };
			for (String name : names) {
				Player p = new Player();
				p.setName(name);
				//System.out.println("Player name: " + p.getName());
				if(!name.equalsIgnoreCase(p.getName())){
					System.out.println("Failed on player " + name );
					return 0;
				}
			}
			return 5;

		} catch (Exception e) {
			System.out.println("Failed (exception thrown):");
			System.out.println(e);
			return 0;
		}
	}

	public static int playerTest2() {
		try {
			System.out.println("Player: Games completed test.");

			int[] moves = { 11, 7, 12, 6, 13, 5, 14, 4, 15, 3 };
			Player p = new Player();
			for (int score : moves) {
				p.updateStats(score);
				//System.out.println("Games played: " + p.getGamesCompleted());
			}
			if(p.getGamesCompleted() == 10)
				return 5;
			else{
				System.out.println("Only completed " + p.getGamesCompleted() + " games");
				return 0;
			}
		} catch (Exception e) {
			System.out.println("Failed (exception thrown):");
			System.out.println(e);
			return 0;
		}
	}

	public static int playerTest3() {
		try {
			System.out.println("Player: Fastest win test.\n");
			int[] moves = { 11, 7, 12, 6, 13, 5, 14, 4, 15, 3 };
			int min = moves[0];
			Player p = new Player();
			for (int score : moves) {
				//System.out.println("score is: " + score);
				p.updateStats(score);
				//System.out.println("Fastest win: " + p.getFastestWin());
				if(score < min)
					min = score;
				if(p.getFastestWin() != min ){
					System.out.println("Failed on score " + score );
					return 0;
				}
			}
			return 5;
		} catch (Exception e) {
			System.out.println("Failed (exception thrown):");
			System.out.println(e);
			return 0;
		}
	}

	public static void main(String[] args) {
		int grade = 0;
		grade += engineTest1();
		System.out.println();
		grade += engineTest2();
		System.out.println();

		grade += playerTest1();
		System.out.println();
		grade += playerTest2();
		System.out.println();
		grade += playerTest3();
		System.out.println();

		System.out.print("\nGrade=" + grade);
	}

}
