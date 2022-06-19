//Link: https://nados.io/question/decimal-to-any-base?zen=true

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int i = 1, a = 0, d;
       while (n > 0)
       {
           d = n % b;
           a = a + d * i;
           i *= 10;
           n /= b;   
       }
       return a;
   }
  }