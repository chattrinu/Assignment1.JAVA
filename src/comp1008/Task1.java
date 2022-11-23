package comp1008;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        // receive a first number from keyboard
        float fnum = input.nextFloat();
        System.out.println("Enter a second number");
        // receive a second number from keyboard
        float snum = input.nextFloat();
        System.out.println("Enter an arithmetic operator (+,-,*,/)");
        // receive arithmetic operation  from keyboard
        char operation = input.next().charAt(0);
        float result;
        //
        if (operation == '+') { // if + is input
             result = fnum + snum;
             System.out.printf("result of %d + %d = %d",(int)fnum,(int)snum,(int)result);

        } else if (operation == '-') {
            result = fnum - snum;
            System.out.printf("result of %d - %d = %d",(int)fnum,(int)snum,(int)result);

        } else if (operation == '*') {
            result = fnum * snum;
            System.out.printf("result of %d * %d = %d",(int)fnum,(int)snum,(int)result);

        } else if (operation == '/') {
            result = fnum / snum;
            System.out.printf("result of %d / %d = %.1f",(int)fnum,(int)snum,result);

        }
        System.out.println();
        System.out.println();

    }

}

