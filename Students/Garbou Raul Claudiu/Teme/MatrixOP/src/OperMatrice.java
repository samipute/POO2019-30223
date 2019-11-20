import java.math.BigDecimal;

public class OperMatrice {
    public static void afisare(BigDecimal[][] matrix, int rand, int coloana) {
        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < rand; j++ ) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static BigDecimal[][] add(BigDecimal[][] first, BigDecimal[][] second, int rand, int coloana) {
        BigDecimal[][] auxiliar = new BigDecimal[rand][coloana];
        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < coloana; j++) {
                auxiliar[i][j] = first[i][j].add(second[i][j]);
            }
        }
        return auxiliar;
    }

    public static BigDecimal[][] subtract(BigDecimal[][] first, BigDecimal[][] second, int rand, int coloana) {
        BigDecimal[][] auxiliar = new BigDecimal[rand][coloana];
        for (int i = 0; i < rand; i++ ) {
            for (int j = 0; j < coloana; j++ ) {
                auxiliar[i][j] = first[i][j].subtract(second[i][j]);
            }
        }
        return auxiliar;
    }

    public static BigDecimal[][] multiply(BigDecimal[][] first, BigDecimal[][] second, int rand, int coloana) {
        BigDecimal[][] auxiliar = new BigDecimal[rand][coloana];
        BigDecimal partialResult = new BigDecimal(0);
        BigDecimal zero = new BigDecimal(0);
        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < rand; j++) {
                for (int k = 0; k < coloana; k++) {
                    partialResult = partialResult.add(first[i][k].multiply(second[k][j]));
                }
                auxiliar[i][j] = partialResult;
                partialResult = zero;
            }
        }
        return auxiliar;
    }

    public static BigDecimal[][] multiplyScalar(BigDecimal[][] mat, int rand, int coloana, int scalar) {
        BigDecimal[][] matResult = new BigDecimal[rand][coloana];
        BigDecimal bigDecimalScalar = new BigDecimal(scalar);
        for(int i = 0; i < rand; i++) {
            for (int j = 0; j < coloana; j++) {
                matResult[i][j] = mat[i][j].multiply(bigDecimalScalar);
            }
        }
        return matResult;
    }

    public static boolean areEqual(BigDecimal[][] first, BigDecimal[][] second, int rand, int coloana) {
        boolean ok = true;
        int i = 0;
        int j = 0;
        while (i < rand && ok == true) {
            while (j < coloana && ok == true) {
                if (first[i][j].equals(second[i][j]) == false) {
                    ok = false;
                }
                j++;
            }
            i++;
        }
        return  ok;
    }

    public static boolean isZeroMatrix(BigDecimal[][] mat, int rand, int coloana) {
        boolean ok = true;
        BigDecimal zero = new BigDecimal(0);
        int i = 0;
        int j = 0;
        while (i < rand && ok == true) {
            while(j < coloana && ok == true) {
                if (mat[i][j].equals(zero) == false) {
                    ok = false;
                }
                j++;
            }
            i++;
        }
        return  ok;
    }

    public static boolean isIdentityMatrix(BigDecimal[][] mat, int rand, int coloana) {
        boolean ok = true;
        int i = 0;
        int j = 0;
        BigDecimal zero = new BigDecimal(0);
        BigDecimal unu = new BigDecimal(1);
        while (i < rand && ok == true) {
            if (mat[i][i].equals(unu) == false) {
                ok = false;
            }
            i++;
        }
        if (ok == true) {
            i = 0;
            while (i < rand && ok == true) {
                while(j < coloana && ok == true) {
                    if (i != j){
                        if (mat[i][j].equals(zero) == false){
                            ok = false;
                        }
                    }
                    j++;
                }
                i++;
            }
            return ok;
        } else {
            return false;
        }
    }

    public static BigDecimal fillDegree(BigDecimal[][] mat, int rand, int coloana) {
        BigDecimal nrElemente = new BigDecimal(rand * coloana);
        BigDecimal zero = new BigDecimal(0);
        BigDecimal unu = new BigDecimal(1);
        int numarElementeNenule = 0;
        for (int i = 0; i < rand; i++) {
            for (int j = 0; j < coloana; j++) {
                if (mat[i][j].equals(zero) == false) {
                    numarElementeNenule += 1;
                }
            }
        }
        BigDecimal nrElementeNenule = new BigDecimal(numarElementeNenule);
        BigDecimal grad = nrElementeNenule.divide(nrElemente);
        //int suta1 = 100;
        //BigDecimal suta = new BigDecimal(suta1);
        grad = BigDecimal.valueOf(100).multiply(grad);
        return grad;
    }
}
