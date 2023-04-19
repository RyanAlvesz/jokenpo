package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		int escolhaJogador;

		System.out.println("*************************************");
		System.out.println("        J  O  K  E  N  P  Ô");
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.print("Faça a sua escolha (1 à 3): ");
		escolhaJogador = teclado.nextInt();

		System.out.println("");

		int escolhaComputador = aleatorio.nextInt(3);
		
		if (escolhaComputador == 0) {

			escolhaComputador = aleatorio.nextInt(3);

		} else if (escolhaJogador == escolhaComputador) {

			System.out.println("*****************************");
			System.out.println("*******   EMPATE!!    *******");
			System.out.println("*****************************");

		} else if (escolhaJogador == 1 && escolhaComputador == 2) {

			System.out.println("Você escolheu ----> PEDRA!");
			System.out.println("O computador escolheu ----> PAPEL!");
			System.out.println("");
			System.out.println("*****************************");
			System.out.println("*******   QUE PENA    *******");
			System.out.println("******* VOCÊ PERDEU!  *******");
			System.out.println("*****************************");

		} else if (escolhaJogador == 1 && escolhaComputador == 3) {
			System.out.println("Você escolheu ----> PEDRA!");
			System.out.println("O computador escolheu ----> TESOURA!");
			System.out.println("");
			System.out.println("*****************************");
			System.out.println("******* VOCÊ VENCEU!  *******");
			System.out.println("*****************************");

		} else if (escolhaJogador == 2) {
			System.out.println("Você escolheu ----> PAPEL!");

		} else {
			System.out.println("Você escolheu ----> TESOURA!");
		}

	}

}
