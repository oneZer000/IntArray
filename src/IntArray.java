public class IntArray {
    private static int sumDigits;
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumEven = IntArray.sumEvenNumbers(numbers);
        System.out.printf("Сумма элементов с четным индексом: %d\n", sumEven);
        int max = IntArray.findMax(numbers);
        System.out.printf("Максимальный элемент: %d\n", max);
        boolean sorted = IntArray.isSorted(numbers);
        System.out.printf("Массив отсортирован по неубыванию: %b\n", sorted);
        int sumDigits = sumDigits(12345);
        System.out.printf("Сумма цифр числа 12345: %d\n", sumDigits);
    }
    private static int sumEvenNumbers(int[] intArray){
        int arrLength = intArray.length - 1;
        int sumEven = 0;
        for (int i = 0; i < intArray.length; i++){
            if (i%2 == 0){
                sumEven += intArray[i];
            }
        }
        return sumEven;
    }
    private static int findMax(int[] intArray){
        int maxElement = intArray[0];
        for (int num: intArray){
            if (num > maxElement){
                maxElement = num;
            }
        }
        return maxElement;
    }
    private static boolean isSorted(int[] intArray){
        boolean sorted = true;
        for (int i = 1, j = i-1; i < intArray.length; i++, j++){
            if (intArray[i] <= intArray[j]){
                sorted = false;
                break;
            }
        }
        return sorted;
    }
    private static int sumDigits(int num){

        if (num == 0){
            return 0;
        }
        return num%10 + sumDigits(num / 10);
    }
}