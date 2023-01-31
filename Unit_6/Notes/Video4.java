public class Video4 {		
	public static double [] rightShift(double [] arr, int shift){
		double [] newArr = new double[arr.length];
		int index = shift;
		for(int i = 0; i < arr.length; i++){
			if(index > arr.length){
				index -= arr.length;
			}
			newArr[index] = arr[i];
			index++;
		}
		return newArr;
	}

	public static double[] leftShift(double [] arr, int shift){
		double [] newArr = new double[arr.length];
		int index = shift;
		for(int i = 0; i < arr.length; i++){
			if(index > arr.length){
				index -= arr.length;
			}

			newArr[i] = arr[index];
			index++;
		}
		return newArr;
	}
		
	public static double average(double [] arr){
		double sum = 0;
		for(double a : arr){
			sum += a;
		}
		return sum / arr.length;
	}
	public static double min1(double [] arr){
		double max = Integer.MIN_VALUE;
		for(double a : arr){
			if(a > max){
				max = a;
			}
		}
		return max;
	}

	public static double max1(double [] arr){
		double min = Integer.MAX_VALUE;
		for(double a : arr){
			if(a < min){
				min = a;
			}
		}	
		return min;
	}

	public static void main(String [] args){
		double [] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Min: " + min1(arr));
		System.out.println("Max: " + max1(arr)); 
		System.out.println("Average : " + average(arr));
		double [] rightShift = rightShift(arr, 1);
		for(double x : rightShift) System.out.print(x + " ");
		double [] leftShift = leftShift(arr, 1);
		System.out.println();      
		for(double x : leftShift) System.out.print(x + " "); 
	}
}
