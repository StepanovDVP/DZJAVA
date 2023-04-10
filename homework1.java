import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(isLeapYear(1920));
        System.out.println(Arrays.toString(createArray(3, 5)));
        int[] arr = createArrNull_or_One(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(change_one_and_null(arr)));
        int[] arr1 =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(change_number(arr1)));
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        matrix_one((array));
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int c = a + b;
        if (c >= 10 & c <= 20) return true;
        return false;
    }
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) return true;
        return false;
    }
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        var s = source.repeat(repeat);
        System.out.println(s);
    }
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if ((year % 4 == 0) & (year % 100 != 0)) return true;
        return false;
    }
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    public static int[] createArrNull_or_One(int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (int) (Math.random()   * 2);
        }
        return arr;
    }
    public static int[] change_one_and_null(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }
    public static int[] change_number(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < 6) arr[i] = arr[i] * 2;
        }
        return arr;
    }
    public static int[][] matrix_one(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) arr[i][j] = 1;
            }
        }
        return arr;
    }



}
