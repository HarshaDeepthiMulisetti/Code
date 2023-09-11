package sampleproject;

public class Leftloop {

	public static void main(String[] args) {
int i, j, k,n = 6;       
for (i=0; i<n; i++)   
{   
for (j=2*(n-i); j>=0; j--)         
{  
System.out.print(" ");   
}   
for ( k = 0; k<=i; k++ )   
{   
   
System.out.print("* ");   
}   
System.out.println();   
}   
}

}
