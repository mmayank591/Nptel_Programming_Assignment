// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;
public class Question1{ 
        public static void main (String[] args){

//Write the appropriate code to read the 3 integer values and find their sum.
          int i,n=0,sum=0;
          Scanner in=new Scanner(System.in);
          for(i=0;i<3;i++)
          {
            n=in.nextInt();
            sum=sum+n;
            
          }
System.out.println(sum);
  }
}
