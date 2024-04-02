public class App {
    public static void main(String[] args) throws Exception {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k++;
            soma += k;
        }

        System.out.println(soma);
        // o resultado sera 91
    }
}
