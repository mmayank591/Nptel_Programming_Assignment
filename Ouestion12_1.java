import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
         char seq[] = input.toCharArray();
		int outflag=0;
		
		for(int i=0; i<seq.length; i++){
			seq[i]=gui_map(seq[i]);
		   if (seq[i]=='R' || seq[i]=='S' || seq[i]=='F' ||seq[i]=='C')
				break;
		}
		//Print Mapped GUI (remove comment to see the mapped sequence input)
		/*
		for(int i=0; i<seq.length; i++){
			System.out.print(seq[i]);
		}
		*/
		// Use double type of values for entire calculation
		double operand1=0.0;
		String o1="";
		double operand2=0.0;
		String o2="";
		double output=0.0;
