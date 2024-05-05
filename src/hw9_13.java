import java.util.Scanner;

public class hw9_13 {
    public int row;
    public int column;
    public double maxValue;

    public hw9_13(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static hw9_13 locateLargest(double[][] a) {
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxRow = i;
                    maxColumn = j;
                    maxValue = a[i][j];
                }
            }
        }

        return new hw9_13(maxRow, maxColumn, maxValue);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        hw9_13 maxLocation = locateLargest(array);
        System.out.println("The location of the largest element is " + maxLocation.maxValue +
                " at (" + maxLocation.row + ", " + maxLocation.column + ")");
    }
}
