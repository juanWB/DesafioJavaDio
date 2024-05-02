import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println(" ");
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Olá, me chamo " + nome + " e tenho " + idade + " anos!");
       





    }
}
