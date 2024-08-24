import java.util.Scanner;

public class exercicio1 {

    public static double transformarHoras(double minutos, double dias){
       double horas = dias/24;
        horas = minutos/60;
        return horas;
    }

    public static int lerDados(Scanner teclado){
        int valor = teclado.nextInt();
        return valor;
    }

    public static double calculoCalorias(double minutos, double hora, double dias){
        int calorias = 230;
        double quantCalorias;
        hora += transformarHoras(minutos, dias);
        quantCalorias = hora*calorias;
        return quantCalorias;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas por dia?");
        double horas = lerDados(teclado);
        System.out.println("Quantos minutos por dia?");
        double minutos = lerDados(teclado);
        System.out.println("Quantas dias?");
        double diasDaSemana = lerDados(teclado);

        double quantCalorias = calculoCalorias(minutos, horas, diasDaSemana);

        System.out.println("Gasto de caloria no dia: "+ quantCalorias);
        System.out.println("Gasto de caloria na semana: "+ quantCalorias*diasDaSemana);
        System.out.println("Gasto de caloria no mês: "+ (quantCalorias*diasDaSemana)*4.5);
        teclado.close();
    }
}
