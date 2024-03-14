import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int placa,ultimoDigito;

        System.out.println("Por favor digite os números da sua placa: ");
        placa = sc.nextInt();

        ultimoDigito = placa%10;
        String dia = "segunda";
        if (ultimoDigito==1 || ultimoDigito==2) {
            dia = "Segunda";
        } else if (ultimoDigito==3 || ultimoDigito==4) {
            dia = "Terça";
        } else if (ultimoDigito==5 || ultimoDigito==6) {
            dia = "Quarta";
        } else if (ultimoDigito==7 || ultimoDigito==8) {
            dia = "Quinta";
        } else if (ultimoDigito==9 || ultimoDigito==0) {
            dia = "Sexta";
        }
        System.out.printf("%s é o dia do seu rodízio %n", dia);
    }
}
