import java.util.Scanner;
public class Idade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade=38;
        double media= 7.55;
        int num;

        System.out.println("Fulano tem " +idade+ " anos");
        System.out.printf("Média = %.2f\n", media);
        System.out.println("Digite um valor inteiro: ");
        num = entrada.nextInt();
    }
}
