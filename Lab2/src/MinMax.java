import java.util.Scanner;
public class MinMax {
	


	public static void main(String[] args){
	int num, maior, menor, numeroCompare;
	maior = Integer.MIN_VALUE;
	menor = Integer.MAX_VALUE;
	int count = 1;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite quanto numeros vão ser comparados: ");
	numeroCompare = entrada.nextInt();

	while (count <= numeroCompare){
		System.out.print("Numero " + count + " : ");
		num = entrada.nextInt();
		if(num < menor){
			menor = num;
		}
		if(num > maior){
			maior = num;
		}
	count++;
	
	}
	System.out.println("O maior numero digitado foi: " + maior);
	System.out.println("O menor numero digitado foi: " + menor);
	}
}
