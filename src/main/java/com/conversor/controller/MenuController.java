package com.conversor.controller;

import com.conversor.service.ConversaoService;
import java.util.Scanner;

public class MenuController {
    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        ConversaoService conversaoService = new ConversaoService();

        while (true) {
            System.out.println("=== Conversor de Moedas ===");
            System.out.println("1 - BRL para USD");
            System.out.println("2 - BRL para ARS");
            System.out.println("3 - BRL para BOB");
            System.out.println("4 - BRL para CLP");
            System.out.println("5 - BRL para COP");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 6) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite o valor em BRL: ");
            double valor = scanner.nextDouble();
            String resultado = conversaoService.converter(opcao, valor);
            System.out.println(resultado);
        }

        scanner.close();
    }
}
