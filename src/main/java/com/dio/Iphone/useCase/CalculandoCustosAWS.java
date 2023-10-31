package com.dio.Iphone.useCase;

import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        //Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int quantidadeServidores = 3;

        int quantidadeBancosDados = 2;

        //TODO: Calcule os custos
        double ST = quantidadeServidores * custoPorHoraServidor;
        double BDT = quantidadeBancosDados * custoPorHoraBancoDados;
        double custoTotal = ST + BDT;

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        //scanner.close();
    }
}