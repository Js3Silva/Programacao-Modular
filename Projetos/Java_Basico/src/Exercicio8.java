import java.util.Scanner;

public class Exercicio8 {

    private static String lerData(Scanner teclado) {
        System.out.println("Digite a data que você deseja pesquisar no ano de 2024: XX/XX/XXXX");
        String data = teclado.nextLine();
        return data;
    }

    private static int procurarDia(String data) {
        // Quebrando a string da data para pegar dia, mês e ano
        String[] partes = data.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        // Ajustando mês e ano para o algoritmo de Zeller
        if (mes == 1 || mes == 2) {
            mes += 12;
            ano -= 1;
        }

        int k = ano % 100; // Últimos dois dígitos do ano
        int j = ano / 100; // Primeiros dois dígitos do ano

        // Algoritmo de Zeller para calcular o dia da semana
        int f = dia + (13 * (mes + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int d = f % 7;

        return d;
    }

    private static String localizarDia(int dia){
        switch (dia) {
            case 0: return "Sábado";
            case 1: return "Domingo";
            case 2: return "Segunda-feira";
            case 3: return "Terça-feira";
            case 4: return "Quarta-feira";
            case 5: return "Quinta-feira";
            case 6: return "Sexta-feira";
            default: return "Erro ao calcular o dia da semana.";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String data = lerData(teclado);
        int dia = procurarDia(data);
        System.out.println("O dia da semana correspondente é: " + localizarDia(dia));

        teclado.close();
    }
}
