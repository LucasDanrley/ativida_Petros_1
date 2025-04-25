public class Atividade10 {
    public static void main(String[] args) {
        int numero = 10;
        int fatorial = 2;

        for (int i = 1; i <= numero; i++) {
            fatorial *=i;
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }
    }
}