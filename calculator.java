import java.util.*;
public class calculator {
    public static void main ( String[] args){
        System.out.println("Enter the veriable a & b");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the veriable a");
        int a = sc.nextInt();
        System.out.println("Enter the veriable b");
        int b = sc.nextInt();
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Result = " + ( a+b));
            break;
            case 2 : System.out.println(" Result = " + ( a*b));
            break;
            case 3 : System.out.println( " Result = " + ( a-b));
            break;
            case 4 : System.out.println( " Result = " + (a%b));
            break;
            default : System.out.println("Resulet = Invalid input");
        }
    }
}