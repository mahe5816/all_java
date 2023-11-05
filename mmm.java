public class mmm {
    static int rec(int n) {
        if(n==0||n==1)
        return 1;
        else
        return n*rec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(rec(3));
    }
}
