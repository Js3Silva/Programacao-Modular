public class imparesMultiplos1 {

    private static int[] verificarImpares(int limite) {
        int tamanho = (limite + 1) / 2;
        int impares[] = new int[tamanho];
        int indice = 0;

        for (int i = 0; i < limite; i++) {
            if (i % 2 != 0) {
                impares[indice] = i;
                indice++;
            }
        }
        // Redimensionar o array para o tamanho exato dos ímpares encontrados
        int[] resultado = new int[indice];
        for (int j = 0; j < indice; j++) {
            resultado[j] = impares[j];
        }

        return resultado;
    }

    private static int[] verificarDivisiveis(int[] impares){
       int tamanho = impares.length;
       int[] divisiveis = new int[tamanho];
       int indice = 0;

       for(int i=0; i < impares.length; i++){
        if(impares[i]%3 == 0){
            divisiveis[indice] = impares[i];
            indice++;
        }
       }
        // Redimensionar o array para o tamanho exato dos ímpares encontrados
        int[] resultado = new int[indice];
        for (int j = 0; j < indice; j++) {
            resultado[j] = divisiveis[j];
        }
       return resultado;
    }

    private static int somaImpares(int[] divisiveis) {
        int soma = 0;

        for (int numero : divisiveis) {
            soma += numero;
        }
        return soma;
    }

    public static void main(String[] args) {
        int limite = 1000;

        int[] impares = verificarImpares(limite);
        int[] divisiveis = verificarDivisiveis(impares);

        System.out.println("A soma dos números ímpares divisíveis por 3 é igual: " + somaImpares(divisiveis));
    }
}
