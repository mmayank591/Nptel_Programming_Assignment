import java.util.Scanner;
  
  public class Question5_3 {
  public static void main(String[] args) { 
      int a, b;
      Scanner input = new Scanner(System.in);
//Read any two values for a and b.
int result;
a=input.nextInt();
b=input.nextInt();

//Get the result of a/b;
try
{
  result=a/b;
  System.out.print(result);
}
catch(Exception e)
{
  System.out.print("Exception caught: Division by zero.");
}
}
}
