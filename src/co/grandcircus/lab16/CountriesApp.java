package co.grandcircus.lab16;

import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Country> country = CountriesTextUtil.readFile();

		System.out.println("Welcome to the Countries Maintenance Application!");
		
		boolean shouldContinue = true;
			System.out.println("1- See the list of countries\n" + "2-Add a country\n" + "3-Exit");
			int menuOption = Integer.parseInt(scanner.nextLine());
			switch (menuOption) {
			case 1:
				// See the list of countries
				for (Country c : country) {
					System.out.println(c.getName() + " ==> " + c.getContinent());
				}
				break;
			case 2:
				System.out.println("Please enter a new country");
				String inputCountry = scanner.nextLine();
				System.out.println("This country has been saved to the list!");
				System.out.println("Please enter a new continent");
				String inputContinent = scanner.nextLine();
				System.out.println("This continent has been saved to the list!");
				Country newCountry = new Country(inputCountry, inputContinent);
				CountriesTextUtil.appendLine(newCountry);
				break;
			case 3:
				System.out.println("Buh-bye!");
				shouldContinue = false;
			}
			
		scanner.close();
	}

}
