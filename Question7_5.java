import java.util.*;
public class Question7_5 {  
    public static void main(String[] args) { 
       try{	
	    String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c='a';
//Replace the char in string "s1" with the char 'a' at index "n"  and print the modified string
byte barr[]=s1.getBytes();
byte b1=(byte) c;
barr[n]=b1;
System.out.println(new String(barr));
}
catch (Exception e){
          System.out.println("exception occur");
	    }	   
    }  
}
