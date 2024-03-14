import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, seuNome;
        nome = "Gabriel";
        System.out.println("Por favor digite seu nome: ");
        seuNome = sc.nextLine();

        if (nome.equals(seuNome)){
            System.out.println("Os dois nomes são iguais");
        } else {
            System.out.println("Os dois nomes são diferentes");
        }


    }
}