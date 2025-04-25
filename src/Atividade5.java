public class Atividade5 {
    public static void main(String[] args) {
        double peso = 86.0;
        double altura = 1.90;

        double imc = peso/(altura*altura);

        System.out.printf("O IMC é: %.2f" , imc);
    }
}