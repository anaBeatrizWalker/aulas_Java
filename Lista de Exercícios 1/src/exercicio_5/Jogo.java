package exercicio_5;

public class Jogo {
	
	int chute = 0, 
        numero, 
        tentativas = 0,
        sorteado;

    public void dica(int palpite, int numero, int tentativas){
        if(chute > numero){
            System.out.println("Chute maior que o n�mero sorteado.");
        } else {
            if(chute < numero){
                    System.out.println("Chute menor que o n�mero sorteado.");
            } else {
                System.out.println("Correto! O n�mero era " + numero);
                System.out.println("Voc� fez " + tentativas + " tentativas antes de acertar!");
            }
        }
    }
 }