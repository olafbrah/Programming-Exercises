package Challenges;
import java.math.*;

public class fibonacci { 
public static BigInteger fib(int n)  { 
 BigInteger f[] = new BigInteger[(n+1)];  
 int i; 
 f[0] = BigInteger.valueOf(0); 
 f[1] = BigInteger.valueOf(1); 
   
 for (i = 2; i <= n; i++) { 
    
     f[i] = f[i-1].add(f[i-2]); 
 } 
    
 return f[ n]; 
 } 
    
 public static void main (String args[]) { 
     int n = 3473;
     System.out.println(fib(n)); 
 } 
} 