import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {



        public static void main(String[] args) {
            // Task 1
            task1();

            // Task 2
            task2();

            // Task 3
            task3();

            // Task 4
            task4();

            // Task 5
            task5();

            // Task 6
            task6();

            // Task 7
            task7();

            // Task 8
            task8();

            // Task 9
            task9();

            // Task 10
            task10();

            // Task 11
            task11();
        }

        // Task 1
        public static void task1() {
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            System.out.println("Task 1:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }

        // Task 2
        public static void task2() {
            int[] numbers = {13, 5, 7, 68, 2};
            int middleIndex = numbers.length / 2;
            System.out.println("\nTask 2:");
            System.out.println("Middle element: " + numbers[middleIndex]);
        }

        // Task 3
        public static void task3() {
            String[] colors = {"red", "green", "blue", "yellow"};
            String[] colorsCopy = colors.clone();
            System.out.println("\nTask 3:");
            System.out.println("Array length: " + colors.length);
            System.out.println("Original array: " + Arrays.toString(colors));
            System.out.println("Copied array: " + Arrays.toString(colorsCopy));
        }

        // Task 4
        public static void task4() {
            int[] myArray = {10, 20, 30, 40, 50};
            System.out.println("\nTask 4:");
            System.out.println("Value at index 0: " + myArray[0]);
            System.out.println("Value at index " + (myArray.length - 1) + ": " + myArray[myArray.length - 1]);

            try {
                System.out.println("Value at index " + myArray.length + ": " + myArray[myArray.length]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }

            try {
                myArray[5] = 60;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
        }

        // Task 5
        public static void task5() {
            int[] myArray = new int[5];
            System.out.println("\nTask 5:");
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i;
                System.out.println("Element at index " + i + ": " + myArray[i]);
            }
        }

        // Task 6
        public static void task6() {
            int[] myArray = new int[5];
            System.out.println("\nTask 6:");
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i * 2;
                System.out.println("Element at index " + i + ": " + myArray[i]);
            }
        }

        // Task 7
        public static void task7() {
            int[] myArray = {10, 20, 30, 40, 50};
            System.out.println("\nTask 7:");
            for (int i = 0; i < myArray.length; i++) {
                if (i != 2) { // Skip the middle element
                    System.out.println("Element at index " + i + ": " + myArray[i]);
                }
            }
        }

        // Task 8
        public static void task8() {
            String[] myArray = {"first", "second", "third", "fourth", "fifth"};
            System.out.println("\nTask 8:");
            String temp = myArray[0];
            myArray[0] = myArray[2];
            myArray[2] = temp;
            System.out.println("Array after swapping first and middle elements: " + Arrays.toString(myArray));
        }

        // Task 9
        public static void task9() {
            int[] numbers = {4, 2, 9, 13, 1, 0};
            Arrays.sort(numbers);
            System.out.println("\nTask 9:");
            System.out.println("Array in ascending order: " + Arrays.toString(numbers));
            System.out.println("The smallest number is " + numbers[0]);
            System.out.println("The biggest number is " + numbers[numbers.length - 1]);
        }

        // Task 10
        public static void task10() {
            Object[] myArray = new Object[5];
            myArray[0] = 42;
            myArray[1] = "red";
            myArray[2] = "green";
            myArray[3] = "blue";
            myArray[4] = 3.14;
            System.out.println("\nTask 10:");
            System.out.println("Array contents: " + Arrays.toString(myArray));
        }

        // Task 11
        public static void task11() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nTask 11:");
            System.out.print("How many favorite things do you have? ");
            int numThings = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String[] favorites = new String[numThings];

            for (int i = 0; i < favorites.length; i++) {
                System.out.print("Enter favorite thing " + (i + 1) + ": ");
                favorites[i] = scanner.nextLine();
            }

            System.out.println("Your favorite things are: " + Arrays.toString(favorites));
        }
    }

