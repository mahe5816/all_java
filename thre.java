class my extends Thread {
    mahe mm;
     my(mahe m) {
        mm=m;
     }
    public void run() { 
        mm.display(5,"mahe");
    }
}
class uu extends Thread {
    mahe mm;
    uu(mahe m) {
        mm=m;
    }
    public void run() {
    mm.display(10,"mani");
   }
}
class mahe {
     void display(int x,String name) {
        int i;
        for(i=0;i<=x;i++)
        System.out.println(i+"jbvjf"+name);
    }
}
public class thre {
    public static void main(String[] args) {
        System.out.println("Main started");
        mahe m=new mahe();
        my x=new my(m);
        uu y=new uu(m);
        x.start();
        y.start();
      //  y.start();
       /*  my m=new my();
        m.start();
        for(int i=0;i<10;i++)
        System.out.println("HH"+i+"main");
        System.out.println("Main Finished");*/
    }
}
