public class OperadoresUnarios {
    public static void main(String[] args) {
        // operadores unários
        // são operadores que atuam sobre um único operando, ou seja, um único valor.
        // o operador de incremento (++) é um operador unário que aumenta o valor de uma variável em 1.
        int numero = 5;
        numero++;
        System.out.println(numero);

        // o operador de decremento (--) é um operador unário que diminui o valor de uma variável em 1.
        numero--;
        System.out.println(numero);

        // o operador de negação (!) é um operador unário que inverte o valor de uma variável booleana.
        boolean verdadeiro = true;
        System.out.println(!verdadeiro);
    }
    
}
