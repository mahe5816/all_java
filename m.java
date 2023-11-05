

class m {
    public static void main(String[] args) {
        mahe h=new mahe();
        h.dis();
        System.out.println(""+h.i);
        System.out.println(""+h.j);
       // System.out.println(args[0]);
            
    }
}
class mahe {
    int i,j;
    mahe() {
        i=10;
        j=20;
    }
    mahe(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    void dis() {
         System.out.println("i ="+i);
         System.out.println("j ="+j);
    }
}