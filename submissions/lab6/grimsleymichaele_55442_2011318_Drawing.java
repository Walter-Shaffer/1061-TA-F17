import java.util.Scanner;

public class Drawing {
	public static void main(String args[]) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("input stair");

		int stair = Keyboard.nextInt();
		int stair2 = stair;
		int stair3 = stair;
		System.out.println("How many times will the drawing repet");
		int rep = Keyboard.nextInt();
		for (int q = rep; q > 0; q--)
		{
			stair = stair3;
			stair2 = stair3;
			for (int i = stair; i > 0; i--) {

				for (int k = 0; k < stair; k++) {
					System.out.print("*");
				}
				System.out.println("");
				stair--;
			}

			for (int i = 0; i < stair2; i++) {
				stair++;
				for (int k = 0; k < stair; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
