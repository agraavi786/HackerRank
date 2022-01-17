package hacker;

import java.util.Scanner;

public class RepeatedString {
	
	

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString1(String s, long n) {
    // Write your code here
       long c=0,c1=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a') {
                c++;
            }
        }
        for(int j=0;j<n%s.length();j++){
            if(s.charAt(j)=='a'){
                c1++;
            }
        }
        
        //System.out.println(c);
        c=c*n/s.length()+c1;
        //System.out.println(c);
        return c;
    }



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    long n=sc.nextLong();
	    RepeatedString r=new RepeatedString();
	    System.out.println(r.repeatedString1(s, n));
	    

	}

}
