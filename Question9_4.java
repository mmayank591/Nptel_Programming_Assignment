import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
// Declare necessary variables
// Input 5x5 2D Array using Scanner Class
// Perform the reflection operation
// Output 5x5 2D Reflection Array
char original[][]=new char[5][5];
char reflection[][]=new char[5][5];
for(int line=0;line<5;line++)
{
  String input = sc.nextLine();
  char seq[]=input.toCharArray();
  if(seq.length==5)
  {
    for(int i=0;i<5;i++)
    {
      original[line][i]=seq[i];
    }
  }
}
for(int i=0;i<5;i++)
{
  for(int j=0;j<5;j++)
  {
    reflection[i][j]=original[i][4-j];
  }
}
for(int i=0;i<5;i++)
{
  for(int j=0;j<5;j++)
  {
    System.out.print(reflection[i][j]);
  }
  System.out.println();
}

} // The main() method ends here
} // The main class end
