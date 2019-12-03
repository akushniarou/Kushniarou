import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число больше чем 7.");

        int numb = scan.nextInt();

        if (numb > 7) {
            System.out.println("Привет");
        }
    }
}

