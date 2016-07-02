/**
 * 
 */
package wespeakcode;

/**
 * @author Ilie
 *
 */
public class Rucsac {
	int volum;
	int volumCurent;
	String culoare;

	void adauga(int cantitate) {
		if (volumCurent + cantitate <= volum) {
			volumCurent += cantitate;
		} else {
			System.out.println("Rucsacul e prea plin.");
		}
	}

	boolean ePlin() {
		return volumCurent == volum;
	}
}
