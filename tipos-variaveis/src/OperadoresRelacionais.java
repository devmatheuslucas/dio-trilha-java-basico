public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que numero2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual a numero2? " + simNao);
    }
}
