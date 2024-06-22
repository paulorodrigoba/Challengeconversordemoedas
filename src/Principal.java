package br.com.aluno.converte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.aluno.converte.ConversaoFinanceira.imprimirTabelaDeMoedas;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ConversorDeMoedas> conversores = new ArrayList<>();

        System.out.println("Bem-vindo ao Conversor de Moedas!");

        while (true) {
            imprimirTabelaDeMoedas();

            System.out.print("Digite a moeda de origem (ex: USD) ou 'sair'/'exit' para encerrar: ");
            String moedaOrigem = scanner.nextLine().trim().toUpperCase();
            if (moedaOrigem.equals("SAIR") || moedaOrigem.equals("EXIT")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite a moeda de destino (ex: EUR): ");
            String moedaDestino = scanner.nextLine().trim().toUpperCase();

            System.out.print("Digite o valor a ser convertido: ");
            double quantia = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            try {
                ConversorDeMoedas conversor = new ConversorDeMoedas(moedaOrigem, moedaDestino, quantia);
                double valorConvertido = conversor.converte();
                System.out.printf("Valor Convertido: %.2f %s\n", valorConvertido, moedaDestino);

                conversores.add(conversor);

                GeradorDeArquivos gerador = new GeradorDeArquivos();
                gerador.geraArquivo(conversores);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
