package program;

public class main {
    public static void main(String[] args) {
        int[] iRefactoredThisVariable = {0, 1, 2, 3, 4};
        int[] iRefactoredThisVariableToo = new int[100];

        for (int i = 0; i < 100; i++) {
            iRefactoredThisVariableToo[i] = i;
        }

        System.out.println("The number of even numbers in iRefactoredThisVariable is: " +
                countEvenNum(iRefactoredThisVariable, iRefactoredThisVariable.length) + ".");
        System.out.println("The number of even numbers in iRefactoredThisVariableToo is: " + countEvenNum(iRefactoredThisVariableToo, iRefactoredThisVariableToo.length) + ".");

    }

    static int countEvenNum(int[] arr, int size) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}