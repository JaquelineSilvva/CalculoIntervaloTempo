/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculointervalotempo;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author Jaqueline
 */
public class CalculoIntervaloTempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Formato para leitura de horários
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        Scanner scanner = new Scanner(System.in);
        boolean refazerCalculo = true;

        while (refazerCalculo) {
            // Obtém o primeiro horário do usuário
            System.out.print("Digite o primeiro horário (HH:mm): ");
            String horario1Str = scanner.nextLine();

            // Obtém o segundo horário do usuário
            System.out.print("Digite o segundo horário (HH:mm): ");
            String horario2Str = scanner.nextLine();

            // Converte as strings em objetos LocalTime
            LocalTime horario1 = LocalTime.parse(horario1Str, formatter);
            LocalTime horario2 = LocalTime.parse(horario2Str, formatter);

            // Calcula a diferença de tempo entre os horários
            Duration diferenca = Duration.between(horario1, horario2);

            // Exibe a diferença de tempo
            long horas = diferenca.toHours();
            long minutos = diferenca.toMinutes() % 60;
            System.out.println("Diferença de tempo: " + horas + " horas e " + minutos + " minutos");

            // Pergunta se deseja refazer o cálculo
            System.out.print("Deseja refazer o cálculo? (S/N): ");
            String resposta = scanner.nextLine();
            refazerCalculo = resposta.equalsIgnoreCase("S");
        }

        // Fecha o scanner
        scanner.close();
    }
    }
    

