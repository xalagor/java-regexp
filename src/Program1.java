import java.util.Scanner;
import java.util.regex.Pattern;

public class Program1 {
    private static Scanner sc1;

    public static void main(String[] args) throws Exception {
        sc1 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc1.nextLine();
        if (checkPhoneNumberIsValid(str)) {
            System.out.println("Строка подходит");
        } else {
            System.out.println("Строка не подходит");
        }
    }

    public static boolean checkPhoneNumberIsValid(String arg) {
        return Pattern.matches(".+[0-9]+\\+.+", arg);
    }
}
