package Exc2;

import Exc1.Modelo;

public class Negocio {
	public void insertionSort(Modelo modelo) {
		int[] numeros = new int[modelo.getNumeroElementos()];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = modelo.getNumero(i);
		}

		int j;
		int key;
		int i;
		for (j = 1; j < numeros.length; j++) {
			key = numeros[j];
			for (i = j - 1; (i >= 0) && (numeros[i] > key); i--) {
				numeros[i + 1] = numeros[i];
			}
			numeros[i + 1] = key;
		}

		for (int k = 0; k < numeros.length; k++) {
			System.out.println("Insertion Sort: " + numeros[k]);
		}
	}

	public void bubbleSort(Modelo modelo) {
		int[] numeros = new int[modelo.getNumeroElementos()];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = modelo.getNumero(i);
		}

		int n = numeros.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {

					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}
		}

		for (int k = 0; k < numeros.length; k++) {
			System.out.println("Bubble Sort: " + numeros[k]);
		}
	}

}
