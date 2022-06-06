package exercicio_5;

import java.util.Scanner;
import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		Jogo a = new Jogo();
                   
        Scanner input = new Scanner(System.in);
        
        Random gerarNumAleatorio = new Random();
        a.sorteado = gerarNumAleatorio.nextInt(100);
        System.out.println("Número entre 0 e 99 sorteado!");
        
        do{
            System.out.println("Tentativas: " + a.tentativas);
            
            System.out.print("Dê um chute: ");
            a.chute = input.nextInt();
            
            a.tentativas++;
            
            a.dica(a.chute, a.sorteado, a.tentativas);
            
        }while (a.chute != a.sorteado);
	}
}
