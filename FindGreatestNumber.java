public class FindGreatestNumber {
public static void main(String[] args) {
int[] numbers = {10, 34, 23, 56, 78, 12, 90, 67};
int greatest = findGreatestNumber(numbers);
System.out.println("The greatest number in the array is: " + greatest);
}
public static int findGreatestNumber(int[] array) {
int max = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
}
return max;
}
}
