import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, resultado;
        int operacao;

        System.out.println("Calculadora");
        System.out.println("Digite um número: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        numero2 = sc.nextDouble();
        System.out.println("Opções do menu: "+
                            "\n1- Soma"+
                            "\n2- Subtração"+
                            "\n3- Multiplicação"+
                            "\n4- Divisão"+
                            "\nDigite a opção desejada"
        );
        operacao = sc.nextInt();

        if (operacao==1) {
            resultado = numero1+numero2;
        } else if(operacao==2) {
            resultado = numero1-numero2;
        } else if(operacao==3) {
            resultado = numero1*numero2;
        } else if(operacao==4) {
            resultado = numero1/numero2;
        } else {
            resultado = 0;
        }

        System.out.printf("Resultado: %.2f",resultado);
    }
}
