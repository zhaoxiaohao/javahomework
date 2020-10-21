package homework1;//反转一个数字
import java.util.Scanner;

public class reverse{
	   public static void main(String[] args){
		   System.out.println("请输入一段数据");
		   Scanner sc= new Scanner(System.in);
	      
	        String string =sc.next();
	 
	  
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("数字反转前:"+string);
	     System.out.println("数字反转后:"+reverse);
	   }
	}
