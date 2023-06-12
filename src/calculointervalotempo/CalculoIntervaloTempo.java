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

    
    public static void main(String[] args) {
         
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        Scanner scanner = new Scanner(System.in);
        boolean refazerCalculo = true;

        while (refazerCalculo) {
       
            System.out.print("Digite o primeiro horário (HH:mm): ");
            String horario1Str = scanner.nextLine();

    
            System.out.print("Digite o segundo horário (HH:mm): ");
            String horario2Str = scanner.nextLine();

         
            LocalTime horario1 = LocalTime.parse(horario1Str, formatter);
            LocalTime horario2 = LocalTime.parse(horario2Str, formatter);

        
            Duration diferenca = Duration.between(horario1, horario2);

            
            long horas = diferenca.toHours();
            long minutos = diferenca.toMinutes() % 60;
            System.out.println("Diferença de tempo: " + horas + " horas e " + minutos + " minutos");

        
            System.out.print("Deseja refazer o cálculo? (S/N): ");
            String resposta = scanner.nextLine();
            refazerCalculo = resposta.equalsIgnoreCase("S");
        }


        scanner.close();
    }
    }
    

