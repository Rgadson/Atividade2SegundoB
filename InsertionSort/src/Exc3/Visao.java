package Exc3;

import java.util.Scanner;
import Exc1.Modelo;
import Exc2.Negocio;

public class Visao {

	public static void main(String[] args) {
		int tamanho = 10;
		Modelo vetor = new Modelo(tamanho);
		Visao visualizacao = new Visao();
		Negocio controlador = new Negocio();

		visualizacao.EntrarNumero(vetor, tamanho);

		long tempoInicialInsertionSort = System.currentTimeMillis();
		controlador.insertionSort(vetor);
		long tempoFinalInsertionSort = System.currentTimeMillis();
		System.out.println(
				"Insertion Sort executado em = " + (tempoFinalInsertionSort - tempoInicialInsertionSort) + " ms");

		long tempoInicialBubbleSort = System.currentTimeMillis();
		controlador.bubbleSort(vetor);
		long tempoFinalBubbleSort = System.currentTimeMillis();
		System.out.println("Bubble Sort executado em = " + (tempoFinalBubbleSort - tempoInicialBubbleSort) + " ms");
	}

	public void EntrarNumero(Modelo vetor, int tamanho) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite " + tamanho + " números:");
		for (int i = 0; i < tamanho; i++) {
			vetor.adicionarNumero(i, scanner.nextInt());
		}
	}

}
