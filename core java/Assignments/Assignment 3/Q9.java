class Defaultvalues{
    boolean b1;
    byte bt;
    short st;
    int num;
    long ll;
    float fl;
    double dl;
    char ch;

    void getvalues(){
        System.out.println(b1);
        System.out.println(bt);
        System.out.println(st);
        System.out.println(num);
        System.out.println(ll);
        System.out.println(fl);
        System.out.println(dl);
        System.out.println(ch);
    }
}

public class Q9 {
    
    public static void main(String[] args) {
        
        Defaultvalues df = new Defaultvalues();

        df.getvalues();
    }
}
