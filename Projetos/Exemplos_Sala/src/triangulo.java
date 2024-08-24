import java.util.Scanner;

public class triangulo {

    private static String tipoTriangulo(int ladoA, int ladoB, int ladoC){
        String tipo = "equilátero";
        if(ladoA == ladoB && ladoB != ladoC || ladoC == ladoA && ladoA != ladoB)
        return "isóceles";
        else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA)
        return "escaleno";
        
        return tipo;
    }

    private static boolean verificarTriangulo(int ladoA, int ladoB, int ladoC){

        if(ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoA+ladoB)
        return true;
        
        return false;
    } 

    private static int lerNumero(Scanner teclado){
        System.out.println("Digite o tamanho do lado:");
        return teclado.nextInt();
    }
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);    
    
    int ladoA, ladoB, ladoC;

    ladoA = lerNumero(teclado);
    ladoB = lerNumero(teclado);
    ladoC = lerNumero(teclado);

    if(verificarTriangulo(ladoA, ladoB, ladoC)){
        System.out.println("É um triângulo "+tipoTriangulo(ladoA, ladoB, ladoC)); 
    }else{
        System.out.println("Não é possivel formar um triângulo");
    }
    }
}
