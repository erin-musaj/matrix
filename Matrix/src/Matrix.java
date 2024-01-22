public class Matrix {

    public static int[][] sum(int m1[][] , int m2[][]) throws Exception {
        int k = 0;
        if(m1.length!=m2.length || m1[k].length!=m2[k].length){
            throw new Exception("Matrici di dimensione diversa");
        }
        int m3[][] = new int[m1.length][m2.length];
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return m3;
    }

    public static int[][] moltiplication(int m1[][] , int m2[][]) throws Exception {
        int k = 0;
        if(m1.length!= m2[k].length && m1[k].length!=m2.length){
            throw new Exception("Matrici non moltiplicabili");
        }
        int m3[][] = new int[m1.length == m2[k].length? m1.length:m2.length][m1.length == m2[k].length? m1[k].length:m2[k].length];
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                for (int l = 0; l < m3.length; l++) {
                    m3[i][j] += ((m1.length == m2[k].length? m1[l][j]:m2[l][j]) * (m1.length == m2[k].length? m2[i][l]:m1[i][l]));
                }
            }
        }
        return m3;
    }

    public static boolean isQuadrata(int m[][]){
        return m.length == m[0].length;
    }

    public static int[][] trasposta(int m[][]){
        int m2[][] = new int [m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m2[j][i]=m[i][j];
            }
        }
        return m2;
    }

    public static boolean diagonale(int m[][]) throws Exception {
        if(!isQuadrata(m)){
            throw new Exception("matrice non quadrata");
        }
        boolean rit = true;
        int i = 0;
        int j = 0;
        while(j!=m.length && i!=m.length){
            if(i==m.length-1){
                if(j==m.length-1){
                    break;
                } else {
                    j++;
                }
                i = 0;
            } else {
                i++;
            }
            if(i!=j && m[i][j]!=0) {
                break;
            }
        }

        if(j!=m.length-1 || i!=m.length-1){
            rit = false;
        }
        return rit;
    }

    public static boolean identita(int m[][]) throws Exception {
        if(!isQuadrata(m)){
            throw new Exception("matrice non quadrata");
        }
        boolean rit = true;
        int i = 0;
        int j = 0;
        while(j<m.length){
            if(i==j && m[i][j]!=1) {
                break;
            }
            if(i==m.length-1){
                if(j==m.length-1){
                    break;
                } else {
                    j++;
                }
                i = 0;
            } else {
                i++;
            }
            if(i!=j && m[i][j]!=0) {
                break;
            }
        }

        if(j!=m.length-1 || i!=m.length-1){
            rit = false;
        }
        return rit;
    }

    public static int[][] potenza(int m[][], int p) throws Exception {
        if(!isQuadrata(m)){
            throw new Exception("non è quadrata");
        }
        for (int i = 0; i < p; i++) {
            m = moltiplication(m, m);
        }
        if (p == 0){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if(i==j){
                        m[i][j]=1;
                    } else {
                        m[i][j]=0;
                    }
                }
            }
        }
        return m;
    }
    public static String toString(int m[][]){
        String rit = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                rit += m[i][j] + "\t";
            }
            rit +="\n";
        }
        return rit;
    }
}
