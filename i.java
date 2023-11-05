public class i {
    static void mm(int m) throws maheException{
            if(m>50) {
                throw new maheException("number grater than 50");
            }
    
    }
    public static void main(String[] args) {
        int m=100;
        try {
        mm(m);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

class maheException extends Exception {
    maheException(String m) {
        super(m);
    }
}
