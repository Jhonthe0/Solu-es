public class StringUtils {
    // Método para inverter uma string
    public static String inverterString(String str) {
        // Converte a string para um array
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os índices para o próximo par de caracteres
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
