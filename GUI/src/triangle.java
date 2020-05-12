import java.util.*;
import java.lang.*;
import java.io.*;
class triangle{
   // This method will return ArrayList containing nth row    
	public static ArrayList<Integer> nthRow(int n)
   {
       ArrayList<Integer> res = new ArrayList<Integer>();
       // Adding 1 as first element of every row is 1
       res.add(1);       for (int i = 1; i <= n; i++) {
           res.add(i, (res.get(i - 1) * (n - i + 1)) / (i));
       }
       return res;
   }
   public static void main(String[] args) throws java.lang.Exception
   {
       int n = 6;
       System.out.println(nthRow(n));
   }
}