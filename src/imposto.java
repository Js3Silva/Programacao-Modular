import java.util.Scanner;

public class imposto {

    public static double calcularImposto(double valor){
        double imposto =  valor*0.20;
        if(valor <= 1200){
            System.out.println("Isento");
        } else if(valor >= 1201 && valor <= 2500){
            imposto = valor*0.10;
        } else if(valor >= 2501 && valor <= 5000){
            imposto = valor*0.15;
        } 
        
        return imposto;
    }

    public static double lerValor(Scanner teclado){
        System.out.println("Digite o valor para o cálculo:");
        double valor = teclado.nextDouble();
        return valor;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double valor = lerValor(teclado);
        double imposto = calcularImposto(valor);
        System.out.println("O valor do importo será:" + imposto);

        teclado.close();
    }
}
