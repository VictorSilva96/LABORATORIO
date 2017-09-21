public class JOGO_PPT {
	private int jogador = -1;
	
	//retorna a variável máquina
	public int getMaquina(){		
		 return  1 + (int) (Math.random() * 3);		
	}
	
	public void jogar(int jogador) {
		
		if (jogador == getMaquina()) {
			System.out.println("Empate pois ambos botaram" + jogador);		
		} else if (jogador == 1 && getMaquina() == 2) {
			System.out.println("Droga você Perdeu, a temivel pedra foi derrotada pelo papel, Maquina vence");
		} else if (jogador == 1 && getMaquina() == 3) {
			System.out.println("Parabens você quebrou a tesoura usando um pedregulho, Usuario vence");
		} else if (jogador == 2 && getMaquina() == 1) {
			System.out.println("Parabens, você cobriu o pedregulho com o papel, Usuario vence");
		} else if (jogador == 2 && getMaquina() == 3) {
			System.out.println("VOCÊ FOI MUTILADO PELA TESOURA, Maquina vence");
		} else if (jogador == 3 && getMaquina() == 1) {
			System.out.println("Droga o pedregulho quebrou a tesoura , Maquina Vence");
		} else {
			System.out.println("Escolha digitando apenas de 1 a 3 ");
		}
		System.out.println("Voce escolheu " + jogador);
		System.out.println("A maquina escolheu" + getMaquina());
	}

}
