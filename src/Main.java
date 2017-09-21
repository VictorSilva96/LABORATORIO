import java.util.Scanner;



public class Main {
	
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		Ppt p1 = new Ppt();
		int jogador = 0;

		while( jogador != -1){
			System.out.println("Bem vindo ao maravilhoso mundo do Pedra-Papel-Tesoura");
			System.out.println("-------------------------------------------");
			System.out.println("----------Aqui você terá 4 opções----------");
			System.out.println("[1] Para Pedra-------------------------");
			System.out.println("[2] Para Papel-------------------------");
			System.out.println("[3] Para Tesoura-----------------------");
			System.out.println("[-1] Para Sair------------------------------");
			
			jogador = ler.nextInt();

			if (jogador >= 1 && jogador <= 3) {
				p1.jogar(jogador);

			}else if (jogador ==-1) {
				System.out.println("Você saiu");
			} else{
				
				System.out.println("Erro digite 0,1,2 ou 3");
				
			}		
		}

	}
	
}