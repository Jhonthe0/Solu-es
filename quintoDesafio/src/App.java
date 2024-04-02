import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String inputString = scanner.nextLine();

        String invertedString = StringUtils.inverterString(inputString);

        System.out.println(invertedString);

        scanner.close();
    }
}