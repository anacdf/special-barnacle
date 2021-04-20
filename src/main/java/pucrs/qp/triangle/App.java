package pucrs.qp.triangle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean segue = true;
		double nota;
		int number, total = 0;
		ArrayList<Double> notasValidas = new ArrayList<>();
		ArrayList<Double> notasInvalidas = new ArrayList<>();

		while (segue) {
			nota = input.nextDouble();
			if (nota < 0 || nota > 10) {
				notasInvalidas.add(nota);
			}
			else {
				notasValidas.add(nota);
				if (notasValidas.size() > 1) {
					segue = false;
				}
			}
		}
		if (!notasInvalidas.isEmpty()) {
		notasInvalidas.forEach(n -> System.out.println("nota invalida"));
		}
		if (!notasValidas.isEmpty()) {
			double media = (notasValidas.get(0) + notasValidas.get(1)) / 2.0;
			System.out.println("media = " + media);
		}
	}

	public static String scoreValidation(double i, double i1) {
		if (i < 0 || i1 < 0 || i > 10 || i1 > 10) {
			return "nota invalida";
		}
		return "media = " + ((i + i1)/2.0);
	}
}








