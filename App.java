import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = scan.nextInt();
        for(int i = 1; i < 11; i++)
            System.out.println(num + " x " + i + " = " + (num*i));
        scan.close();
    }
}
