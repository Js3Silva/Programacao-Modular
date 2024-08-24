import java.util.Scanner;

public class exercicio2 {

    // Função para computar o voto em um determinado apartamento
    public static void computarVoto(String apto, int[] apartamento) {
        switch (apto) {
            case "101":
                apartamento[0]++;
                break;
            case "102":
                apartamento[1]++;
                break;
            case "201":
                apartamento[2]++;
                break;
            case "202":
                apartamento[3]++;
                break;
            case "301":
                apartamento[4]++;
                break;
            case "302":
                apartamento[5]++;
                break;
            case "401":
                apartamento[6]++;
                break;
            case "402":
                apartamento[7]++;
                break;
            case "501":
                apartamento[8]++;
                break;
            case "502":
                apartamento[9]++;
                break;
            case "601":
                apartamento[10]++;
                break;
            case "602":
                apartamento[11]++;
                break;
            case "701":
                apartamento[12]++;
                break;
            case "702":
                apartamento[13]++;
                break;
            case "801":
                apartamento[14]++;
                break;
            case "802":
                apartamento[15]++;
                break;
            case "901":
                apartamento[16]++;
                break;
            case "902":
                apartamento[17]++;
                break;
            case "1001":
                apartamento[18]++;
                break;
            case "1002":
                apartamento[19]++;
                break;
            case "1101":
                apartamento[20]++;
                break;
            case "1102":
                apartamento[21]++;
                break;
            case "1201":
                apartamento[22]++;
                break;
            case "1202":
                apartamento[23]++;
                break;
            case "1301":
                apartamento[24]++;
                break;
            case "1302":
                apartamento[25]++;
                break;
            case "00":  
                apartamento[26]++;
                break;
            default:   
                apartamento[27]++;
                break;
        }
    }

    public static void exibirResultados(int[] apartamento, int totalVotos) {
        System.out.println("Resultados:");
        for (int i = 0; i < 26; i++) {
            int andar = (i / 2) + 1;
            int numero = (andar * 100) + (i % 2) + 1;
            System.out.println("Apartamento " + numero + ": " + apartamento[i] + " votos (" + (apartamento[i] * 100.0 / totalVotos) + "%)");
        }
        System.out.println("Votos em branco: " + apartamento[26] + " (" + (apartamento[26] * 100.0 / totalVotos) + "%)");
        System.out.println("Votos nulos: " + apartamento[27] + " (" + (apartamento[27] * 100.0 / totalVotos) + "%)");
    }

    public static String vencedor(int[] apartamento) {
        int maxVotos = 0;
        int indiceVencedor = -1;
        for (int i = 0; i < 26; i++) {  
            if (apartamento[i] > maxVotos) {
                maxVotos = apartamento[i];
                indiceVencedor = i;
            }
        }
        return "O apartamento vencedor é " + (indiceVencedor + 101) + " com " + maxVotos + " votos.";
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] apartamento = new int[28];  
        int voto = 0;
        int totalVotos = 0;

        while (voto != 999) {
            System.out.println("Deseja votar em qual apartamento?");
            String apto = teclado.nextLine();

            if (apto.equals("999")) {
                break;
            }

            computarVoto(apto, apartamento);
            totalVotos++;
        }
        exibirResultados(apartamento, totalVotos);
        System.out.println(vencedor(apartamento));
        teclado.close();
    }
}
