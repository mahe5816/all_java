 class fx {
    int x,y,z;
    void lx() {
        System.out.println("From A");
    }
    void lit() {
        System.out.println("hehe");
    }
    fx() {
        System.out.println("yoyo honeysingh");
    }
    void mi(){
        System.out.println("from b meme");
    }
}
 class min extends fx {
    void lx() {
        System.out.println("FRom B");
    }
   // void mi() {
     //   System.out.println("meme");
    //}
    min() {
        super();
        System.out.println("hgfggfgh");
    }
}
public class overide {
    public static void main(String[] args) {
        fx a=new min();
        a.lx();
        a.lit();  
        a.mi();
            
    }
}
