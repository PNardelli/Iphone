package com.dio.Iphone.useCase;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        double podsPorNode = 10;
        double podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        double numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = calcularServidoresPods(numeroTotalPods, podsPorNode);
        //System.out.println(numeroMinimoNodes);

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = calcularServidoresPods(numeroTotalPods, podsPorServidor);
        //System.out.println(numeroMinimoServidores);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        String teste = recomendacaoQuantidade(numeroMinimoNodes, numeroMinimoServidores);
        System.out.println(teste);
    }


    private static int calcularServidoresPods(double numeroTotalPods, double x) {
        double result = Math.round(numeroTotalPods / x);
        int numeroMinimoNodes = (int) result;
        return numeroMinimoNodes;
    }

    private static String recomendacaoQuantidade(int x, int y) {
        if (x <= 1 && y != 1) {
            return "1.Recomendamos usar um unico node" +
                    "\n2.Numero minimo de servidores:" + y;

        }else if (x > 1 && y > 1){
            return "1.Numero minimo de nodes:" + x +
                    "\n2.Numero minimo de servidores:" + y;
        }
        return "";
    }
    // Fechando o Scanner

}