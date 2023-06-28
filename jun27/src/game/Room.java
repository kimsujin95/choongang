package game;

public class Room {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == 1) {
					if (j == 1 || j == 2 || j == 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i == 2) {
					if (j == 1 || j == 2 || j == 3 || j == 4) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else if (i == 3) {
					if (j == 1 || j == 2 || j == 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				} 
			}
			System.out.println();
		}
	}
}
