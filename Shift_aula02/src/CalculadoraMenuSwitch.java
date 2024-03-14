import java.util.Scanner;

public class CalculadoraMenuSwitch {
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

        switch (operacao) {
            case 1:
                resultado = numero1+numero2;
                System.out.printf("Resultado: %.2f",resultado);
                break;
            case 2:
                resultado = numero1-numero2;
                System.out.printf("Resultado: %.2f",resultado);
                break;
            case 3:
                resultado = numero1*numero2;
                System.out.printf("Resultado: %.2f",resultado);
                break;
            case 4:
                if(numero2!=0){
                    resultado = numero1/numero2;
                    System.out.printf("Resultado: %.2f",resultado);
                 } else {
                    System.out.println("Não é possível dividir por 0");
                }
                break;
            default: System.out.println("Opção inválida");
        }

    }
}
