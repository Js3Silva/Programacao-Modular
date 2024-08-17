import java.util.Scanner;

public class Exercicio1 {
	
    // Método para preencher o array
    private static int[] preencheArrays(int quantidade, Scanner teclado) {
        int[] array = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            array[i] = teclado.nextInt();
        }

        return array;
    }

    // Método para inverter o array
    private static int[] inverteVetor(int[] array) {
        int[] inverso = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            inverso[i] = array[array.length - 1 - i];
        }

        return inverso;
    }
    
    // Método para imprimir o vetor
    private static void imprimirVetor(int[] inverso, int quantidade_numeros) {
        System.out.print("O vetor invertido: ");
        for (int i = 0; i < quantidade_numeros; i++) {
            System.out.print(inverso[i] + " ");
        }
        System.out.println(); 
    }
	
    public static void main(String[] args) throws Exception {
        int[] inverso;
        int[] array;
        int quantidade_numeros;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que deseja digitar:");
        quantidade_numeros = teclado.nextInt();

        // Inicializando o array com o tamanho correto
        array = preencheArrays(quantidade_numeros, teclado);

        // Passando o array inteiro para o método inverteVetor
        inverso = inverteVetor(array);
        
        // Chamando o método para imprimir o vetor invertido
        imprimirVetor(inverso, quantidade_numeros);

        teclado.close();
    }
}
