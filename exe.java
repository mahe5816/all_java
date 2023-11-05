import javax.print.event.PrintEvent;

import java.rmi.NotBoundException;
import java.util.*;
public class exe {
  
    public static void avg(int m) throws numberException{
        if(m>100){
            throw new numberException("Number is grater than 100<"+m);
            }
        System.out.println("Valid number"+m);
        }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        try{
           avg(num);
           System.out.println(100);
        }
        catch(Exception e) {
            System .out.println(e);
        }
    }
} 
class numberException extends Exception {
    String ss;
        numberException(String m) {
            super(m);
            }
        }
      

        
/*class mhException extends Exception {
   int a;
    mhException(int n) {
        a=n;
    }
    public String toString() {
        return ("hihi"+a);
    }
*/