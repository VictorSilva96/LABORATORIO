import java.util.Scanner;



public class Main {
	
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		JOGO_PPT p1 = new JOGO_PPT();
		int jogador = 0;

		while( jogador != -1){
			System.out.println("Bem vindo ao maravilhoso mundo do Pedra-Papel-Tesoura");
			System.out.println("-------------------------------------------");
			System.out.println("----------Aqui voc� ter� 4 op��es----------");
			System.out.println("[1] Para Pedra-------------------------");
			System.out.println("[2] Para Papel-------------------------");
			System.out.println("[3] Para Tesoura-----------------------");
			System.out.println("[-1] Para Sair------------------------------");
			
			jogador = ler.nextInt();

			if (jogador >= 1 && jogador <= 3) {
				p1.jogar(jogador);

			}else if (jogador ==-1) {
				System.out.println("Voc� saiu");
			} else{
				
				System.out.println("Erro digite 0,1,2 ou 3");
				
			}		
		}

	}
	
}