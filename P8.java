import java.io.*;
public class P8{
   public static void main(String[] args) {
       int n=5,i=1;
	P8 fact = new P8();
	while(i<=n)
	{
		fact.Fact(i);
		i++;
	}
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
