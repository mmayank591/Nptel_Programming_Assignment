import java.util.*;
public class Question12_3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
    //Read your first name in string
    String f=s1.next();
    //Read  your last name in string
   String l=s1.next();
     //Read  rollnumber in integer
    int n=s1.nextInt();
    //Read  1st subject mark in float
    double db=s1.nextDouble();
    //Read  2nd subject mark in float
	double db1=s1.nextDouble();
    // find the avg mark in the subject
double avg=(db+db1)/2;
    //Print the record in the format: name+" "+rollnumber+" "+avg_mark
System.out.print(f+l+" "+n+" "+avg);
  }
}
