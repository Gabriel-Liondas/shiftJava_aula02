import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Por favor digite sua idade: ");
        idade = sc.nextInt();

        if ( idade<16 ) {
            System.out.println("Não pode votar");
        } else {
            System.out.println("Pode votar");
        }

    }
}