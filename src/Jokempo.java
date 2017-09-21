import java.util.Random;
import java.util.Scanner;
 
public class Jokempo {
    private Usuário user;
    private Computador computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
 
    private enum Move {
        PEDRA, PAPEL, TESOURA;
        public int compareMoves(Move otherMove) {
            // Empate
            if (this == otherMove)
                return 0;
 
            switch (this) {
            case PEDRA:
                return (otherMove == TESOURA ? 1 : -1);
            case PAPEL:
                return (otherMove == PEDRA ? 1 : -1);
            case TESOURA:
                return (otherMove == PAPEL ? 1 : -1);
            }
 
            return 0;
        }
    }
 
    private class Usuário {
        private Scanner inputScanner;
 
        public Usuário() {
            inputScanner = new Scanner(System.in);
        }
 
        public Move getMove() {
            // Perguntar ao usuário
            System.out.print("Pedra, papel ou tesoura? ");
 
            // Obter a entrada do usuário
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            char primeiraLetter;
			char segundaLetra;
			if (primeiraLetter == 'P' && (segundaLetra == 'E' || segundaLetra == 'A') || firstLetter == 'T') {
             // O usuário digitou uma entrada válida
              switch (PrimeiraLetra) {
                 case 'P':
                       if(segundaLetra == 'E') {return Move.PEDRA;} else {return Move.PAPEL;} 
                 case 'T':
               return Move.TESOURA;
        }
    }
 
            // O usuário não digitou uma entrada válida, tente novamente
            return getMove();
        }
 
        public boolean playAgain() {
            System.out.print("Você deseja jogar novamente? ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            return userInput.charAt(0) == 'S';
        }
    }
 
    private class Computador {
        public Move getMove() {
            Move[] moves = Move.values();
            Random random = new Random();
            int index = random.nextInt(moves.length);
            return moves[index];
        }
    }
 
    public void PedraPapelTesoura() {
        user = new Usuário();
        computer = new Computador();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }
 
    public void startGame() {
        System.out.println("PEDRA, PAPEL, TESOURA!");
 
        // Obtém os movimentos
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYou played " + userMove + ".");
        System.out.println("Computador played " + computerMove + ".\n");
 
        // Compara os movimentos e determina o vencedor
        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
        case 0: // Empate
            System.out.println("Empate!");
            break;
        case 1: // Usuário wins
            System.out.println(userMove + " ganha de " + computerMove + ". Você venceu!");
            userScore++;
            break;
        case -1: // Computador wins
            System.out.println(computerMove + " ganha de " + userMove + ". Você perdeu.");
            computerScore++;
            break;
        }
        numberOfGames++;
 
        // Pergunta ao usuário se ele deseja jogar novamente
        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }
 
    /**
     * Mostra as estatísticas do jogo. Considera os empates como 1/2 de uma vitória 
     * para definir a porcentagem de vitórias.
     */
    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;
 
        // Linha
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
 
        // Imprimir estatísticas
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "VITÓRIAS", "DERROTAS", "EMPATES", "JOGOS REALIZADOS", "PORCENTAGEM DE VITÓRIAS");
 
        // Linha
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");
 
        // Imprimir valores
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);
 
        // Linha
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }
 
    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
 
    public static void main(String[] args) {
       Jokempo game = new Jokem();
        game.startGame();
    }
}