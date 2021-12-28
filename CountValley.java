import java.util.Scanner;

public class CountValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String s1=sc.nextLine();
        
        String s=sc.nextLine();
        int l=0;
        int v=0;
        for(int i=0;i<n;i++) {
        	if(s.charAt(i)=='U') {
        		l++;
        		
        	}
        	else if(s.charAt(i)=='D') {
        		if(l==0) {
        			v++;
        		}
        		l--;
        	}
        }
        System.out.println(v);
        
        
        

	}

}

