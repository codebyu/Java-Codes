import java.util.*;


public class Calculator {
    
    public static void main(String[] args)
{
    
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the Calculator Here You can Calculate The Following Mathematical Calculations :");
System.out.println("1.Additon");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Finding the Remainder/Modolu");
System.out.println("Simply type the number of the action you want to perform");
int x = sc.nextInt();
System.out.println("Ok Thanks for choosing the service" +x );
System.out.println("Now type the first number");
double a = sc.nextDouble();
System.out.println("Now type the second number");
double b = sc.nextDouble();

double c =a+b;
double d =a-b;
double e =a*b;
double f =a/b;
double g =a%b;



switch(x){
case 1 : System.out.println("Your Addition result is "+c);
                            break;
case 2 : System.out.println("Your Subtraction result is "+d);
                            break;
case 3 : System.out.println("Your Multiplication result is "+e);    
                            break;
case 4 : System.out.println("Your Divison result is "+f); 
                             break;
case 5 : System.out.println("Your remainder after dividing the numbers is "+g);
                             break;
default : System.out.println("This action is not defined");
}

System.out.println("Thanks For Using Our Service");



}


}



















