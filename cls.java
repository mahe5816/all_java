/*class A {
    int x,y,z;
    void setx(int x) {
        this.x=x;
    }
    void getx() {
        System.out.println(x);
    }
    void setz(int x) {
        this.z=x;
    }
    void getz() {
        System.out.println("from a"+z);
    }
    A() {
        System.out.println(16);
    }

}
class b extends A {
    void sety(int y) {
        this.y=y;
    }
    void gety() {
        System.out.println(y);
    }
   void setz(int x) {
      System.out.println("from b"+x);
    }
    b() {
        System.out.println("I am from B");
    }
}
public class cls {
public static void main(String[] args) {
    b b1=new b();
    b1.sety(5);
    b1.gety();
    b1.setz(15);
    b1.getz();
    A a=new A();

    
    }
} */
class A {
    void getx(int x) {
        System.out.println("from a"+x);
    }
    void gety(int x) {
        System.out.println("From a"+x);
    }
    void getm(int x) {
        System.out.println("From a"+x);
    }
    A(){
        this(5); 
        System.out.println("From a");
    }
    A(int a){
        
        System.out.println("From a"+a);
    }
    void getz(int x) {
        System.out.println("from a"+x);
    }
}
class b extends A {
    void getz(int x) {
        System.out.println("from b"+x);
    }
    void getx(int x) {
        super.getx(x);
        System.out.println("from b"+x);
    }
    void gety(int x) {
        System.out.println("From b"+x);
    }
    b() {
        this(10);
        System.out.println("From b");
    }
    b(int x) {
        System.out.println(x);
    }

}
class cls {
    public static void main(String[] args) {
       /*  b b1=new b();
        b1.getx(10);
        b1.getm(10);
        A a1=new A();
        a1.getx(5);/* /* */
        A a1=new b();
        a1.getz(10);


    }
}