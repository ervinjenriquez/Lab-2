import java.util.Arrays;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {22, 34, 21, 35, 12, 4, 2, 3, 99, 81};
		
		System.out.println(Arrays.toString(array));
		System.out.print("array in reverse: ");
		Reverse(array);
		
		System.out.print("The array with the numbers plus 100: ");
		computePlus100(array);
		
		getMax(array);
	}
	public static void Reverse(int[] array) {
		
		int[] array1 = new int[10];
		
		array1[0] = array[9];
		array1[1] = array[8];
		array1[2] = array[7];
		array1[3] = array[6];
		array1[4] = array[5];
		array1[5] = array[4];
		array1[6] = array[3];
		array1[7] = array[2];
		array1[8] = array[1];
		array1[9] = array[0];
		System.out.println(Arrays.toString(array1));
	}
	public static void computePlus100(int[] array) {
		
		int[] array1 = new int[10];
		
		array1[0] = array[9]+100;
		array1[1] = array[8]+100;
		array1[2] = array[7]+100;
		array1[3] = array[6]+100;
		array1[4] = array[5]+100;
		array1[5] = array[4]+100;
		array1[6] = array[3]+100;
		array1[7] = array[2]+100;
		array1[8] = array[1]+100;
		array1[9] = array[0]+100;
		System.out.println(Arrays.toString(array1));
	}
	
	public static void getMax(int[] array) {
		
		int[] Maximum = new int[1];
		int max = Maximum[0];
		
		for (int i=0; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println("The largest number is " + max);
	}
}
