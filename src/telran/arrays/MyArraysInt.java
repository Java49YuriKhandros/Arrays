package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int[] addNumber (int[] array, int num) {
		
		//adds num at the array's end
		//returns new array with added number
		//using standard method Arrays.copyOf
		int[] res = Arrays.copyOf(array, array.length + 1);
		res[array.length] = num;
		return res;
	}
	public static int[] removeNumber (int[] array, int index) {
		
		//removes element and given index for right index value [0 - array.length-1] and return new array with no the removed one
		//return the source array for a wrong index value (less then 0 or greater then array.length-1)
		//using the standard method System.arraycopy 
		int [] res = array;
		if (index > -1 && index < array.length) {
			res = new int [array.length - 1];
			System.arraycopy(array, 0, res, 0, index);
			System.arraycopy(array, index + 1, res, index, res.length-index);
		}		
		return res;
	}
	public static int [] insertNumber (int[] array, int index, int num) {
		 
		//inserts a given num at a given index for right value of the index [0 - array.length] 
		//and returns new array with the inserted number
		
		//return the source array for a wrong index value (less then 0 or greater then array.length)
		//using the standard method System.arraycopy 
		int [] res = array;
		if (index > -1 && index < array.length) {
			res = new int [array.length + 1];
			System.arraycopy(array, 0, res, 0, index);
			System.arraycopy(array, index, res, index+1, array.length-index);
			res[index]=num;
		}				
		return res;
	}
	public static int[] insertNumberSorted(int[] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if (index < 0) {
			index = -index - 1;
		}
		return insertNumber(array, index, num);
	}
}
