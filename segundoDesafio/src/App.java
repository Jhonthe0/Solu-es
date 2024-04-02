import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero para verificar se pertence a sequencia: ");
        int numero = entrada.nextInt();

        int anterior = 0;
        int atual = 1;
        boolean encontrado = false;

        while (atual < numero) {
            if (atual == numero) {
                encontrado = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (encontrado) {
            System.out.println(numero + " faz parte da sequencia fibonaci.");
        } else {
            System.out.println(numero + " não faz parte da sequencia de fibonaci.");
        }

        entrada.close();
    }
}
