/**
 * 
 */
package wespeakcode;

import java.util.Scanner;

/**
 * @author Ilie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(1 + 1);
		System.out.println(100 / 14);
		System.out.println(100 * 2);
		System.out.println(100 % 3);

		int x = 10;

		String nume = "Ion";
		boolean awesome = false;

		if (awesome) {
			System.out.println("Be awesome!");
		} else {
			System.out.println(":(");
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		while (x < 100) {
			System.out.println(nume + x);
			x++;
		}

		Rucsac scoala = new Rucsac();

		System.out.println(scoala.volum);

		scoala.culoare = "rosie";
		scoala.volum = 1000;

		System.out.println(scoala.volum);

		Rucsac vacanta = new Rucsac();

		System.out.println(vacanta.culoare);
		vacanta.culoare = "verde";
		vacanta.volum = 10;
		System.out.println(vacanta.culoare);

		scoala.adauga(13);
		scoala.adauga(12);
		System.out.println(scoala.volumCurent);

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Adauga volum: ");
			String input = scanner.nextLine();
			Integer volum = Integer.valueOf(input);
			scoala.adauga(volum);
			System.out.println(scoala.volumCurent);

		} while (!scoala.ePlin());
	}

}
