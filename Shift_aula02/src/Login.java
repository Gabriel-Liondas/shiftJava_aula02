import java.util.Scanner;

public class Login {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user, password, token, tipoUsuario;

        System.out.println("Por favor digite seu usuário: ");
        user = sc.nextLine();
        System.out.println("Por favor digite sua senha: ");
        password = sc.nextLine();
        System.out.println("Por favor digite seu token: ");
        token = sc.nextLine();
        System.out.println("Por favor digite o tipo do usuario: ");
        tipoUsuario = sc.nextLine();

        if (!tipoUsuario.equalsIgnoreCase("administrador")){
            System.out.println(" usuário sem privilegios admnistrativos");
        } else {
            if (user.equalsIgnoreCase("admin") && (password.equals("admin123") || token.equals("123"))) {
                System.out.println(user + " bem vindo ao sistema Fiap");
            } else {
                System.out.println("Usuário ou senha inválidos");
            }
        }
    }
}
