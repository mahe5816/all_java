import java.util.*;
class k {
	final int num = 10; // final variable

	public void changeNumber() {
		System.out.println("The value of num is " + num);
	}
}

class mh {
	static int sum(int ...arr) {
		int sum=0;
		for(int i:arr)
		sum +=i;
		return sum;
	}
	static int suum(int m[]) {
		int sum=0;
		for(int i=0;i<m.length;i++) {
			 sum=sum+m[i];
		}
		return sum;
	}

	public static void main(String args[]) {
		k demo = new k();
		demo.changeNumber();
		int[] ari={5,6,7,8,9};
		//System.out.println("Sum is :"+sum(10));
		System.out.println("Sum is :"+sum(0,6,7,8,8));
		int m=suum(ari);
		System.out.println("Sum is "+m);
	//	Arrays.sort(ar);
	//	System.out.println("Sorte3d array is ;");
	//	for(int j=0;j<ar.length;j++)
	//	System.out.println(ar[j]);
	}
}
