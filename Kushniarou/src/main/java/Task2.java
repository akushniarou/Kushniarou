import java.util.Scanner;

public class Task2 {


    public static void main(String args[]) {

//        Кодировка для  jar cmd Windows
//        Scanner scan = new Scanner(System.in, "Cp866");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя Вячеслав");
        String name = scan.nextLine();
        if ("Вячеслав".equals(name)) {
            System.out.println("Привет, Вячеслав.");
        } else {
            System.out.println("Нет такого имени.");

        }
    }
}