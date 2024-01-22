public class Main {
    public static void main(String[] args) {

        int m1[][] = {{2,3,2},{2,3,1},{2,1,0}};
        int m2[][] = {{3,1},{3,2},{1,0}};
        int m3[][] = {{3,0},{0,2}};
        int m4[][] = {{1,0},{0,1}};
        try {
            System.out.println(Matrix.toString(Matrix.moltiplication(m1, m2)));
            System.out.println(Matrix.toString(m2));
            System.out.println(Matrix.toString(Matrix.trasposta(m2)));
            System.out.println(Matrix.isQuadrata(m2)); //false
            System.out.println(Matrix.isQuadrata(m1)); //true
            System.out.println(Matrix.diagonale(m1)); //false
            System.out.println(Matrix.diagonale(m3)); //true
            System.out.println(Matrix.identita(m3)); //false
            System.out.println(Matrix.identita(m4)); //true

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}