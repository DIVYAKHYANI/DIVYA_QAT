package test;
import java.util.*;

public class Stringreverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  a String: ");
		String s1 = sc.nextLine();//taking input string from user
		String[] s2 = s1.split(" ");//Splitting with respect to spaces b/w the words in the string
		
		System.out.println();
		
		for(int i=s2.length-1;i>=0;i--){//Iterating from the end to the first word
			
			System.out.print(s2[i]+" ");//printing the corresponding string
		}
		sc.close();

	}

}
