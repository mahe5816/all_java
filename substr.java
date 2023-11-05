import java.util.*;
public class substr {
    public static void main(String[] args) {
        String s="pwwkkeeww";
        int maxx=0;
        StringBuilder sd=new StringBuilder();
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(sb.indexOf(String.valueOf(s.charAt(j)))!=-1){
                    break;
                }
                else{
                    sb.append(String.valueOf(s.charAt(j)));
                    if(sb.length()>maxx){
                      maxx=sb.length();
                      sd=sb;
                     }
                }
            }
        }
        System.out.print(maxx+" "+sd);
    }
}
