// Link : https://nados.io/question/any-base-to-decimal?zen=true
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int a = n , count = 0;
      if (n == 0)
      {
         return 0;
      }
      while (n > 0)
      {
         n = n/10;
         count ++ ;

      }
      n = a;
      double sum = 0.00; 
      for (int i= 0; i < count; i++)
      {
         int d = n % 10;
         sum = sum + (Math.pow(b,i) *d);
         n = n / 10  ;   
      }
      int j = (int)sum;
      return j;
   }
  }