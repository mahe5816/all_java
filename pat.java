public class pat {
    public static void main(String[] args) {
        int n=10,i,j,k,l;
        for(i=0;i<n;i++){
                if(i==0||i==n-1)
                for(j=0;j<n;j++)
                System.out.print("*");
                else{
                System.out.print("*");
                for(k=0;k<n-2;k++)
                System.out.print(" ");
                System.out.print("*");
                }
                System.out.println();
        }
    }
}
