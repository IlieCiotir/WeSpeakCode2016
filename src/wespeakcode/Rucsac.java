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
		}
	}
}
