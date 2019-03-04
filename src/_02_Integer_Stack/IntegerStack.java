package _02_Integer_Stack;

public class IntegerStack {
	//1. create a private array of integers
	private int[] arr;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		arr = new int[0];
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		
			
		//A. create a new array that is one element larger than the member array
		int[] arr2 = new int[arr.length+1];
		//B. set the last element of the new array equal to the integer passed into the method
		arr2[arr2.length] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr2[i];
		//D. set the member array equal to the new array.
			arr = arr2;
		}
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int v = arr[arr.length];
		//B. create a new array that is one element smaller than the member array
		int[] arr3 = new int[arr.length-1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for (int i = 0; i < arr3.length; i++) {
			arr[i] = arr3[i];
		}
		//D. set the member array equal to the new array
		arr = arr3;
		//E. return the variable you created in step A
		return v;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		int[] arr4 = new int[0];
		arr = arr4;
	}
	
	//6. Complete the size method to return 
	//   the length of the member array
	public int size() {
		return arr.length;
	}
}
