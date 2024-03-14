import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Por favor digite sua idade: ");
        idade = sc.nextInt();

        if ( idade<16 ) {
            System.out.println("Não pode votar");
        } else if(idade >= 16 && idade <18) {
            System.out.println("Já Pode votar - Não é obrigatório");
        }  else if(idade >= 18 && idade <75) {
            System.out.println("Deve votar - É obrigatório");
        } else {
            System.out.println("Você já não precisa mais votar, mas pode");
        }

        if ( idade<12 ) {
            System.out.println("Não pode jogar");
            System.out.println("Esse jogo não é recomendado por conter violência");
        }


    }
}