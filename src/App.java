import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite o numero:\n");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
