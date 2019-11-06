import java.math.BigDecimal;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        OperMatrice OperMatrice = new OperMatrice();

        System.out.print("Numarul de linii al primei matrice este: ");
        int rows1 = keyboard.nextInt();
        System.out.print("Numarul de coloane al primei matrice este: ");
        int columns1 = keyboard.nextInt();

        BigDecimal[][] matrix1 = new BigDecimal[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++ ) {
                System.out.print("mat1[" + i + "][" + j + "] = ");
                matrix1[i][j] = keyboard.nextBigDecimal();
            }
        }

        System.out.print("Numarul de linii pentru a doua matrice este: ");
        int rows2 = keyboard.nextInt();
        System.out.print("Numarul de coloane pentru a doua matrice este: ");
        int columns2 = keyboard.nextInt();

        BigDecimal[][] matrix2 = new BigDecimal[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("mat2[" + i + "][" + j + "] = ");
                matrix2[i][j] = keyboard.nextBigDecimal();
            }
        }

        System.out.println("Prima matrice este: ");
        OperMatrice.afisare(matrix1,rows1,columns1);

        System.out.println("A doua matrice este: ");
        OperMatrice.afisare(matrix2,rows2,columns2);

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Nu se pot efectua operatii pe aceste doua matrici!");
        } else {
            BigDecimal[][] addResult = OperMatrice.add(matrix1,matrix2,rows1,columns1);
            System.out.println("Suma celor doua matrici este: ");
            OperMatrice.afisare(addResult,rows1,columns1);

            BigDecimal[][] subtractResult = OperMatrice.subtract(matrix1,matrix2,rows1,rows2);
            System.out.println("Diferenta celor doua matrici este: ");
            OperMatrice.afisare(subtractResult,rows1,columns1);

            BigDecimal[][] multiplyResult = OperMatrice.multiply(matrix1,matrix2,rows1,columns1);;
            System.out.println("Rezultatul inmultirii celor doua matrici este: ");
            OperMatrice.afisare(multiplyResult,rows1,columns1);

            System.out.print("Valoarea scalarului este: ");
            int scalar = keyboard.nextInt();
            BigDecimal[][] firstMultiplyScalar = OperMatrice.multiplyScalar(matrix1,rows1,columns1,scalar);
            System.out.println(scalar + " * matricea1: ");
            OperMatrice.afisare(firstMultiplyScalar,rows1,columns1);
            BigDecimal[][] secondMultiplyScalar = OperMatrice.multiplyScalar(matrix2,rows2,columns2,scalar);
            System.out.println(scalar + " * matricea2: ");
            OperMatrice.afisare(secondMultiplyScalar,rows2,columns2);

            if (OperMatrice.areEqual(matrix1,matrix2,rows1,columns1) == true) {
                System.out.println("Cele doua matrici sunt egale.");
            } else {
                System.out.println("Cele doua matrici nu sunt egale.");
            }

            if(OperMatrice.isZeroMatrix(matrix1,rows1,columns1) == true) {
                System.out.println("Prima matrice este matricea nula.");
            } else {
                System.out.println("Prima matrice nu este matricea nula.");
            }
            if (OperMatrice.isZeroMatrix(matrix2,rows2,columns2) == true) {
                System.out.println("A doua matrice este matricea nula.");
            } else {
                System.out.println("A doua matrice nu este matricea nula.");
            }

            if(OperMatrice.isIdentityMatrix(matrix1,rows1,columns1) == true) {
                System.out.println("Prima matrice este matricea identitate.");
            } else {
                System.out.println("Prima matrice nu este matricea identitate.");
            }
            if(OperMatrice.isIdentityMatrix(matrix2,rows2,columns2) == true) {
                System.out.println("A doua matrice este matricea identitate.");
            } else {
                System.out.println("A doua matrice nu este matricea identitate.");
            }

            BigDecimal gradUmplere1 = OperMatrice.fillDegree(matrix1,rows1,columns1);
            System.out.println("Gradul de umplere al primei matrice este: " + gradUmplere1 + "%");
            BigDecimal gradUmplere2 = OperMatrice.fillDegree(matrix2,rows2,columns2);
            System.out.println("Gradul de umplere al celei de-a doua matrice este: " + gradUmplere2 + "%");

        }
    }
}