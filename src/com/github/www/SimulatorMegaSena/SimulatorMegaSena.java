package com.github.www.SimulatorMegaSena;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SimulatorMegaSena {
    public static void main(String[] args) {
        // Chama a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Simulador
        System.out.println();
        System.out.println("---------- MEGA SENA SIMULATOR ----------");
        System.out.println();

        Set<Integer> numerosEscolhidos = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 60): ");
            int numero = scanner.nextInt();

            // Verifica se o número está entr 0 e 60
            if (numero < 0 || numero > 60) {
                System.out.println("Número fora do intervalo válido (0 a 60). Tente novamente.");
                i--;
                continue;
            }

            numerosEscolhidos.add(numero);
        }

        System.out.println();

        // Gera os Números Aleatórios
        Set<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();

        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(61)); // Intervalo de 0 a 60
        }

        System.out.println("Números sorteados: " + numerosSorteados);

        if (numerosEscolhidos.equals(numerosSorteados)) {
            System.out.println("Parabéns, você ganhou! Os seus números são: " + numerosEscolhidos);
        } else {
            System.out.println("Mais sorte na próxima. Os seus números são: " + numerosEscolhidos);
        }
        System.out.println();
        System.out.println("---------- FIM ----------");
    }
}
