import java.util.Scanner;

public class Exercicio6{
	
	private static int lerNumero(Scanner teclado) {
		System.out.println("Digite o numero com dois algarismos que você deseja multiplicar por 11:");
		int numero = teclado.nextInt();
		
        if (numero >= 10 && numero <= 99) {
        	return numero;
        } else {
            System.out.println("Por favor, insira um número de 2 dígitos.");
            return 0;
        }
	}

	private static int multiplicacao(int numero) {
	 	int digitoEsquerda = numero / 10; 
        int digitoDireita = numero % 10; 
        
        int soma = digitoEsquerda + digitoDireita;
        
        if (soma >= 10) {
            digitoEsquerda += 1;
            soma -= 10;
        }
        
        return digitoEsquerda * 100 + soma * 10 + digitoDireita;
    }
	
	public static void main(String[] args) throws Exception{
		int resultado = 0, numero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		numero = lerNumero(teclado);
		resultado = multiplicacao(numero);
        System.out.println("Resultado: " + resultado);
		
		teclado.close();
		
	}
}