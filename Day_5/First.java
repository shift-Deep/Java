package java_ATCS;
import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		//initializing the array
		int arr[] = {1,2,3,4,5};
		char arr1[]= {'a','b','c'};
		int s = 0;
		//printing array elements using foreach loop
		for(int n : arr) {
			System.out.println(n);
			s = s+n;
		}
	//average of array
	System.out.println("Average is = "+s/arr.length);
	//converting array to string
	String st="";
	for(char l : arr1) {
		
		st = st+l;
	}
	
	System.out.println(st);
	First f = new First();
	//classname 
	System.out.println(arr.getClass());
	
	//Adding two matrix
	int matrix1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int matrix2[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int result[][]= new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j = 0;j<3;j++) {
			result[i][j] = matrix1[i][j]+matrix2[i][j];
		}
	}
	for(int i=0;i<3;i++) {
		for(int j = 0;j<3;j++) {
			System.out.println(result[i][j]);
		}
	}
	
	//min number in array
	int min = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
	}
	System.out.println(min);
	
	}

}
