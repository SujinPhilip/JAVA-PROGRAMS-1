import java.io.*;
public class P6{
   public static void main(String[] args){
	int n=10;
		P6 fact = new P6();
		fact.Fact(n);
	}
	void Fact(int n){
		int i=1,b=1;
		while(i<=n)
		{
			b*=i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+b);
	}

}
		