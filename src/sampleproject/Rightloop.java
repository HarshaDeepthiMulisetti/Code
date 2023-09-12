package sampleproject;

public class Rightloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		String row="*";
		int i=1;
		do {
			System.out.println(row);
			row+="*";
			i++;
		}while(i<=n);
	}

}
