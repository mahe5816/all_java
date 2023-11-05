import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class nvf {
        static String st(String m) throws IOException{
            char c;
            String mm="[a-zA-Z0-9]";
            String r1="",r2="";
            for(int i=0;i<m.length();i++) {
            c=m.charAt(i);
            if(String.valueOf(c).matches(mm)) 
                r1=r1+c;
                else
                r2=r2+c;
            }
            return r1+r2;
        }
        public static void main(String[] args) {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            try {
            String s=br.readLine();
           // String h=st("vdsfjv");
                int i=Integer.parseInt(br.readLine());
                System.out.println(i+5);
            System.out.println(st(s));
            }
            catch(Exception e){
                System.out.println(e);
            }

    }
}
