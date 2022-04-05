import java.util.Arrays;

public class course3_02_1 {
    public static void main(String[] args) {
        int[] d = {3, 22, 1, 13, 4, 6, 16, 5};
        System.out.print("Четные числа: ");
        for(int i = 0 ; i < d.length; i++) {
            if (d[i] % 2 == 0)
                System.out.print(d[i] + " ");
        }
        System.out.print("\nДвузначные числа: ");
        for(int i = 0 ; i < d.length; i++) {
            if (Integer.toString(d[i]).length() == 2)
                System.out.print(d[i] + " ");
        }
        System.out.print("\nМаксимальное число: ");
        int max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] > max) max = d[i];
        }
        System.out.print(max);
        System.out.print("\nСумма элементов в массиве: ");
        long total = 0;
        for (int i = 0; i < d.length; i++) {
            total += d[i];
        }
        System.out.print(total);
        int[] d2 = new int[d.length];
        for (int i = 0, j = d2.length - 1; i < d.length; i++, j--) {
            d2[j] = d[i];
        }
        System.out.print("\nИсходный массив   : " + Arrays.toString(d));
        System.out.print("\nВ обратном порядке: " + Arrays.toString(d2));
    }
}
