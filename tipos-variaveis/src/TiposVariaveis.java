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

        
    }
}
