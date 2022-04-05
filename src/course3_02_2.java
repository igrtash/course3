import java.util.*;

public class course3_02_2 {
    // ввод массива
    public static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("Введите число для элемента [%d,%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // суммирование элементов по строкам
    public static void printSumRow(int[][] arr) {
        int sumRow;
        for (int i = 0; i < arr.length; i++) {
            sumRow = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sumRow += arr[i][j];
            }
            System.out.printf("Сумма элементов %d строки = %d%n", i+1, sumRow);
        }
    }

    // суммирование элементов по столбцам
    public static void printSumCol(int[][] arr) {
        int sumCol;
        for (int i = 0; i < arr[0].length; i++) {
            sumCol = 0;
            for (int j = 0; j < arr.length; j++) {
                sumCol += arr[j][i];
            }
            System.out.printf("Сумма элементов %d столбца = %d%n", i+1, sumCol);
        }
    }

    // замена четных и нечетных элементов
    public static void replaceNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((i+j+1)%2 == 0)
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    // среднее значение по строкам
    public static void printAvgRow(int[][] arr) {
        int avgRow;
        for (int i = 0; i < arr.length; i++) {
            avgRow = 0;
            for (int j = 0; j < arr[0].length; j++) {
                avgRow += arr[i][j];
            }
            avgRow = avgRow / arr[0].length;
            System.out.printf("Среднее значение элементов %d строки = %d%n", i+1, avgRow);
        }
    }

    // преобразование в одномерный массив
    public static int[] convertArr(int[][] arr) {
        int[] result = new int[arr.length * arr[0].length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result[n] = arr[i][j];
                n++;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][3];
        inputArray(array);
        //int[][] array = {{1, 2, 3},{4, 5, 6},[7, 8, 9},{0, 1, 2}};
        System.out.print("Введенный массив: ");
        System.out.println(Arrays.deepToString(array));
        printSumRow(array); // суммирование по строкам
        printSumCol(array); // суммирование по стобцам
        printAvgRow(array); // среднее значение по строкам
        int[] arr2 = convertArr(array); // преобразование массива в одномерный
        System.out.println("Элементов в одномерном массиве: " + arr2.length);
        //System.out.println(Arrays.toString(arr2));
        replaceNumbers(array);
    }
}
