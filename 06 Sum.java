import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Now, please enter the second number: ");
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your numbers is: " + sum);
    }
}