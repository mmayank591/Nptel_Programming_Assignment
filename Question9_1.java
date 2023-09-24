import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
  int i=0,j=0;
double output =0;
char seq[]=input.toCharArray();
for(int a=0;a<seq.length;a++)
{
  if(seq[a]=='+')
  {
    i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,seq.length));
    output=(double)i+j;
  }
  if(seq[a]=='-')
  {
    i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,seq.length));
    output=(double)i-j;
  }
  if(seq[a]=='/')
  {
    i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,seq.length));
    output=(double)i/j;
  }
  if(seq[a]=='*')
  {
    i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,seq.length));
    output=(double)i*j;
  }  
}
System.out.print(input+" = " + Math.round(output));
  }
}
