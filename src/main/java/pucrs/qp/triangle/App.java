package pucrs.qp.triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		//Método criado com TDD
		System.out.println(scoreValidation(5,7));

		//Métodos enviados para URI
		notasBernardo();
		notasAna();
	}


	public static String scoreValidation(double i, double i1) {
		if (i < 0 || i1 < 0 || i > 10 || i1 > 10) {
			return "nota invalida";
		}
		return "media = " + ((i + i1)/2.0);
	}

	public static void notasBernardo() {
		Scanner input = new Scanner(System.in);
		double notas[] = new double[2];
		int cont = 0;
		double nota;
		while (cont <= 1) {
			nota = input.nextDouble();
			if (nota < 0 || nota > 10) {
				System.out.println("nota invalida");
			} else {
				notas[cont++] = nota;
			}
		}
		double media = (notas[0] + notas[1]) / 2;
		System.out.println("media = " + String.format("%.2f", media));
	}

	public static void notasAna() {
		Scanner input = new Scanner(System.in);
		boolean segue = true;
		double nota;
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
}








