import java.util.Scanner;

public class MatrixAddition {
 
    public static void main(String...args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows in matrix : "); 
           int rows = scanner.nextInt();
           System.out.print("Enter number of columns in matrix : ");
           int columns = scanner.nextInt();
           int[][] matrix1 = new int[rows][columns];
           int[][] matrix2 = new int[rows][columns];
           
           System.out.println("Enter the elements in first matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix1[i][j] = scanner.nextInt();
                  }
           }
           System.out.println("Enter the elements in second matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix2[i][j] = scanner.nextInt();
                  }
           }
    
           int[][] resultMatix = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        resultMatix[i][j] = matrix1[i][j] + matrix2[i][j];
                  }
           }
           int[][] productMatrix  = new int[rowsMatrix1][columnsMatrix2];
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < columnsMatrix2; j++) {
                for (int k = 0; k < columnsMatrix1RowsMatrix2; k++) { //columns in matrix1= rows in matrix2
                    productMatrix[i][j] = productMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
           System.out.println("\nThe sum of the two matrices is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        System.out.print(resultMatix[i][j] + " ");
                  }
                  System.out.println();
           }
           System.out.println("\nProduct of matrix1 and matrix2 is");
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < columnsMatrix2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
       }
 
    }
    
}
