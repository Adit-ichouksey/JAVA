
//Sum Array

//  import java.util.Scanner;
//  public class lec2 {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int sum = 0;
//         System.out.println("Enter Elements");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }
//         System.out.println("Sum = " + sum);
//     }
// }

// Maximum Element
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter size of array: ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     System.out.println("Enter Elements: ");
//     for (int i = 0; i < n; i++) {
//         arr[i] = sc.nextInt();
//     }
//     int max = arr[0];
//     for (int i = 1; i < n; i++) {
//         if (arr[i] > max) {
//             max = arr[i];
//         }
//     }
//     System.out.println("Maximum Element : " + max);
// }

// Count Even & Odd Number
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int even = 0, odd = 0;
//         System.out.println("Enter Elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             if (arr[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//             System.out.println("Even:" + even + " Odd:" + odd);
//         }
//     }
// }

// Linear Search
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter Elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter element to search: ");
//         int x = sc.nextInt();
//         boolean found = false;
//         for (int val : arr) {
//             if (val == x) {
//                 found = true;
//                 break;
//             }
//         }
//         if (found) {
//             System.out.println(x + " is present in the array.");
//         } else {
//             System.out.println(x + " is not present in the array.");
//         }
//     }
// }

// Reverse Array
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter Elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Reversed Array: ");
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
