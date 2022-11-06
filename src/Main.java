import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int row = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int col = scanner.nextInt();
        int[][] matris = new int[row][col];
        int[][] transpose = new int[col][row];


        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(+ i +".Satır " + j +". Sütun: elemanı giriniz: ");
                matris[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Your Matris :");
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");

            }
            System.out.println();

        }



        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                transpose[j][i] = matris[i][j];
            }
        }
        System.out.println("Transposed Matris: ");

        for (int i = 0; i < transpose.length; i++){
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
}