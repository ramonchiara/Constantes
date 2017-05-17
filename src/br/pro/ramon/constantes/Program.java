package br.pro.ramon.constantes;

import java.util.Random;
import java.util.Scanner;

public class Program {

    // esta constante pode ser usada em todas as funções...
    public static final int MAIOR = 10;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // esta constante só pode ser usada dentro da função main...
        final int MAXIMO_TENTATIVAS = 3;

        int sorteado = sorteiaNumero();
        System.out.println("Pensei em um número entre 1 e " + MAIOR);
        System.out.println("Tente adivinhá-lo em, no máximo, " + MAXIMO_TENTATIVAS + " tentativas...");

        for (int i = 1; i <= MAXIMO_TENTATIVAS; i++) {
            System.out.println("Tentativa " + i + ": ");
            int n = console.nextInt();

            if (n == sorteado) {
                System.out.println("Você acertou!!!");
                break;
            } else {
                int tentativas = (MAXIMO_TENTATIVAS - i);
                if (tentativas > 0) {
                    System.out.println("Você errou e tem mais " + tentativas + " tentativas...");
                } else {
                    System.out.println("Que pena! Você não conseguiu acertar. Mais sorte na próxima vez!");
                }
            }
        }
    }

    public static int sorteiaNumero() {
        Random rng = new Random();

        int sorteado = rng.nextInt(MAIOR) + 1;

        return sorteado;
    }

}
