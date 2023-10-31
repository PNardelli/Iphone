package com.dio.Iphone.useCase;

import java.util.*;

public class MonitoramentoLogsAWS {

    private static String EC2 = "EC2";
    private static String LAMBDA = "Lambda";
    private static String S3 = "S3";
    private static String RDS = "RDS";

    Map<String, Integer> eventosPorServicoMap;

    public MonitoramentoLogsAWS() {
        this.eventosPorServicoMap = new HashMap<>();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        int valor = 0;
        scanner.nextLine(); // Limpar o buffer do scanner

        MonitoramentoLogsAWS monitoramentoLogsAWS = new MonitoramentoLogsAWS();

        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            if (servico.matches(EC2)) {
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(EC2) == null) {
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, 1);
                } else {
                    valor = monitoramentoLogsAWS.eventosPorServicoMap.get(EC2);
                    valor++;
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, valor);

                }
            } else if (servico.matches(S3)) {
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(S3) == null) {
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, 1);
                } else {
                    valor = monitoramentoLogsAWS.eventosPorServicoMap.get(S3);
                    valor++;
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, valor);
                }
            } else if (servico.matches(LAMBDA)) {
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(LAMBDA) == null) {
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, 1);
                } else {
                    valor = monitoramentoLogsAWS.eventosPorServicoMap.get(LAMBDA);
                    valor++;
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, valor);
                }
            } else if (servico.matches(RDS)) {
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(RDS) == null) {
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, 1);

                } else {
                    valor = monitoramentoLogsAWS.eventosPorServicoMap.get(RDS);
                    valor++;
                    monitoramentoLogsAWS.eventosPorServicoMap.put(servico, valor);
                }
            }
            if (i == quantidadeLogs - 1) {
                System.out.println("Eventos por servico:");
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(S3) != null) {
                    System.out.println("S3:" + (monitoramentoLogsAWS.eventosPorServicoMap.get(S3)));
                }
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(EC2) != null) {
                    System.out.println("EC2:" + (monitoramentoLogsAWS.eventosPorServicoMap.get(EC2)));
                }
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(LAMBDA) != null) {
                    System.out.println("Lambda:" + (monitoramentoLogsAWS.eventosPorServicoMap.get(LAMBDA)));
                }
                if (monitoramentoLogsAWS.eventosPorServicoMap.get(RDS) != null){
                System.out.println("RDS:" + (monitoramentoLogsAWS.eventosPorServicoMap.get(RDS)));
                }

                Map<String, Integer> ordenacao = new TreeMap<>(monitoramentoLogsAWS.eventosPorServicoMap);
                String servicoMaior = null;
                String servicoMenor = null;
                int maior = 0;

                for (Map.Entry<String, Integer> entry : monitoramentoLogsAWS.eventosPorServicoMap.entrySet()) {
                    if (entry.getValue() > maior) {
                        if (servicoMenor == null){
                            servicoMaior = entry.getKey();
                            servicoMenor = servicoMaior;
                        }
                        maior = entry.getValue();
                        servicoMenor = servicoMaior;
                        servicoMaior = entry.getKey();
                    }
                    if (entry.getValue() < maior) {
                        servicoMenor = entry.getKey();
                    }
                }
                System.out.println("Maior:" + servicoMaior + "\nMenor:" + servicoMenor);
            }
        }
    }
}