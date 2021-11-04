import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEscriu el teu nom: ");
        String nom = in.nextLine();
        System.out.println("\nHola " + nom + "!!\n");
        in.close();
    }
}