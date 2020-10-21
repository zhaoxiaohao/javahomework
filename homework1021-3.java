package homework1;//统计一位数个数
import java.util.Random;

public class counts  {         
			  public static void main(String[] args) {        
				  int[] counts = new int[10];        
				  Random random = new Random();        
				  for(int i=0;i<100;i++){           
					  counts[random.nextInt(10)]++;      
					  }                
				  for(int i=0;i<10;i++){           
					  System.out.println(i + "出现次数："+counts[i]);        
					  }    
				  } 
			  }
