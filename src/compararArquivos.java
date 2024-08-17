import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class compararArquivos{

    // Método para comparar o conteúdo de dois arquivos byte a byte
    private static int comparaArquivos(String nomeArquivo1, String nomeArquivo2) {
        try (FileInputStream ver1 = new FileInputStream(nomeArquivo1);
             FileInputStream ver2 = new FileInputStream(nomeArquivo2)) {

            int byte1, byte2, index = 0;

            // Lê os bytes dos arquivos até o final de qualquer um dos arquivos
            while ((byte1 = ver1.read()) != -1 && (byte2 = ver2.read()) != -1) {
                if (byte1 != byte2) {
                    return index; // Retorna o índice do primeiro byte diferente
                }
                index++;
            }

            // Se um arquivo é mais longo que o outro
            if (ver1.read() != -1 || ver2.read() != -1) {
                return index; // Retorna o índice do final do menor arquivo
            }

            return -1; // Retorna -1 se os arquivos forem idênticos

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir um dos arquivos: " + e.getMessage());
            return -1;
        } catch (IOException e) {
            System.out.println("Erro ao ler os arquivos: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner leitorTeclado = new java.util.Scanner(System.in);

        System.out.print("Qual é o primeiro arquivo? ");
        String nomeArquivo1 = leitorTeclado.nextLine();

        System.out.print("Qual é o segundo arquivo? ");
        String nomeArquivo2 = leitorTeclado.nextLine();

        // Comparar os arquivos
        int resultado = comparaArquivos(nomeArquivo1, nomeArquivo2);
        if (resultado == -1) {
            System.out.println("Os arquivos são idênticos.");
        } else {
            System.out.println("Os arquivos diferem no byte no índice " + resultado);
        }

        leitorTeclado.close();
    }
}
