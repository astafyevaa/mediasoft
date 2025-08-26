import java.util.Scanner;

public class classes1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Integer result = Integer.valueOf(input);
        System.out.println(result + 30);
    }
}
