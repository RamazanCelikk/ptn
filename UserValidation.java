import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		int[][] production = {
			    {10, 10, 15, 8}, // A machine
			    {9, 12, 10, 19}, // B machine
			    {16, 8, 8, 14}    // C machine
			};
			int maxProduction = Integer.MIN_VALUE;
			String maxMachine = "";

			for (int i = 0; i < production.length; i++) {
			    int sum = 0;
			    for (int j = 0; j < production[i].length; j++) {
			        sum += production[i][j];
			    }
			    if (sum > maxProduction) {
			        maxProduction = sum;
			        maxMachine = Character.toString((char)('A' + i));
			    }
			}

			System.out.println("En fazla üretim yapan makine: " + maxMachine);
			System.out.println("Toplam üretim miktarı: " + maxProduction);
	}	
}
