import java.util.Scanner;

public class DescontoOperadorOu {
    public void main(){
        Scanner sc = new Scanner(System.in);
        double valorTotalCompra, desconto = 0, valorFinal;
        String cumpom;

        System.out.println("Por favor digite o valor total da compra: : ");
        valorTotalCompra = sc.nextDouble();
        System.out.println("Por favor digite o cupom: ");
        cumpom = sc.nextLine();

        if ( valorTotalCompra >= 1000 || cumpom.equalsIgnoreCase("DESCONTO20")){
            desconto = valorTotalCompra * 0.2;
        }

        valorFinal = valorTotalCompra - desconto;
        System.out.printf("O valor final da compra é de: R$%.2f%n", valorFinal);
    }
}
