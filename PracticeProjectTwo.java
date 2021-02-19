import java.util.Scanner;

public class PracticeProjectTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter add, subtract, or product");
        String operation = input.nextLine();
        double sum = 0;
        int money = 9;

        if(operation.equals("add")){
            System.out.println("Please enter the value of num");
            int num = input.nextInt();

            System.out.println("Please enter the value of num2");
            double num2 = input.nextDouble();

            sum = num + num2;

        }
        else if(operation.equals("subtract")){
            System.out.println("Please enter the value of num");
            int num = input.nextInt();

            System.out.println("Please enter the value of num2");
            double num2 = input.nextDouble();

            sum = num - num2;
        }
        else if(money>=1){
            System.out.println("You have >= $1");
        }
        else{
            System.out.println("Money less");
        }

        System.out.println("The sum is: ");
        System.out.println(sum);
















    }
}
