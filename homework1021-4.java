package homework1;//找到最小数字下标
import java.util.Scanner;

public class minnum {
	 
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("请输入十个整数:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				System.out.println("最小的数是：" + min);
				System.out.println("该数的下标是：" + i);
			}
		}
		
	}
 
}
