import java.util.Scanner;

public class PracticeProject {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int money = 6;
        double add = 0;
        double subtract = 0;
        double product = 0;
        System.out.println("Please enter a value for num");
        int num = input.nextInt();

        System.out.println("Please enter a value of number2: ");
        double number2 = input.nextDouble();

        System.out.println("Please enter aDD , SUBTRACT OR multiply");
        String operation = input.nextLine();

        if(operation.equals("add")){
            add = num + number2;
            System.out.println("I have $10");
        }
        else if(operation.equals("subtract")){
            add = num - number2;
            subtract = num-number2;
            System.out.println("Money between 5 to 9");
        }
        else if(money >=1){
            System.out.println("Money between 1 to 5");
        }
        else{
            System.out.println("Dont have enough money");
        }

        System.out.println("The add value is: ");
        System.out.println(add);


        System.out.println("End");





//        Scanner input = new Scanner(System.in);
//

//
//
//        double product = (num * number2)/2;

       // System.out.println(product);
    }
}
