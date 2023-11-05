import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class file {
    public static void main(String[] args) {
        try{
            int i=0;
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Mahendra Reddy\\Desktop\\New folder (4)\\output.txt"));
        String m[]=new String[30];
        String s;
        while((s=br.readLine())!=null){
            m[i]=s;
            i++;
        }
        for(i=0;i<m.length;i++)
        System.out.println(m[i]);
        br.close();
        }
        catch(IOException e){
            System.out.println(e);   
        }
        
    }
}
/*
file writer
BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Mahendra Reddy\\Desktop\\New folder (4)\\output.txt") );
        bw.write("mahe\n");
        bw.write("Hemu\n"); */
