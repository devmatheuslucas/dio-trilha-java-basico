public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1200.50;

        short numeroCurto = 10;
        int numeroNormal = numeroCurto;
        // quando fazemos a conversão de um tipo menor para um tipo maior, não precisamos fazer o casting, pois o java faz isso 
        // automaticamente.
        // quando fazemos a conversão de um tipo maior para um tipo menor, precisamos fazer o casting, pois o java 
        // precisa ter a certeza de que estamos cientes da possibilidade de perda de dados.
        short numeroCurto2 = (short) numeroNormal;

        // para declarar uma constante, usamos a palavra reservada final, 
        // e por convenção, o nome da constante é escrito em letras maiúsculas.
        final double VALOR_DE_PI = 3.14; 
        System.out.println("O valor de pi e: " + VALOR_DE_PI);

        // estudar a classe String, que é uma classe que representa uma sequência de caracteres.
        // estudar tipos primitivos, que são tipos de dados que representam valores simples, 
        // como números e caracteres.



        
    }
}
