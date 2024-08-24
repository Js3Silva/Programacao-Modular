import java.util.Scanner;

public class retangulo {

    static Scanner teclado = new Scanner(System.in);

    /**
     * Encapsula uma leitura de teclado, com mensagem personalizada. 
     * A mensagem sempre é completada com ":". Retorna um inteiro.
     * 
     * @param mensagem A mensagem a ser exibida, sem pontuação final.
     * @return String convertida em inteiro (int).
     */
    public static int leituraInteiro(String mensagem) {
        System.out.print("\n" + mensagem + ": ");
        return Integer.parseInt(teclado.nextLine());
    }

    /**
     * Usa os métodos {@link #imprimirLinhaCheia(int, char) imprimirLinhaCheia} e 
     * {@link #imprimirLinhaVazada(int, char) imprimirLinhaVazada}
     * para desenhar um retângulo na tela. O caractere usado para a borda está fixo em '#'.
     * 
     * @param largura A largura do retângulo.
     * @param altura A altura do retângulo.
     */
    public static void imprimirRetangulo(int largura, int altura) {
        imprimirLinhaCheia(largura, '_');
        for (int i = 0; i < altura - 2; i++) {
            imprimirLinhaVazada(largura, '|');
        }
        imprimirLinhaCheia(largura, '-');
    }

    /**
     * Imprime uma linha preenchida pelo caractere 'borda', com a largura especificada.
     * 
     * @param largura Qual a largura da linha.
     * @param borda O caractere para ser a 'borda' da linha.
     */
    public static void imprimirLinhaCheia(int largura, char borda) {
        for (int i = 0; i < largura; i++) {
            System.out.print(borda);
        }
        System.out.println();
    }

    /**
     * Imprime uma linha vazada por espaços, usando o caractere 'borda' nas extremidades, 
     * com a largura especificada.
     * 
     * @param largura Qual a largura da linha.
     * @param borda O caractere para ser a 'borda' da linha.
     */
    public static void imprimirLinhaVazada(int largura, char borda) {
        System.out.print(borda);
        for (int i = 0; i < largura - 2; i++) {
            System.out.print(" ");
        }
        System.out.println(borda);
    }

    public static void main(String[] args) {
        // Aqui você pode chamar o método exercicio01() ou outros métodos para testar.
        int largura = leituraInteiro("Largura do retângulo");
        int altura = leituraInteiro("Altura do retângulo");
        imprimirRetangulo(largura, altura);
    }
}

