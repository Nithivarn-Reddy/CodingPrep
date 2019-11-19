public class ReverseInt {
    static final int add(int a, int b) {
        long r = (long)a + b;
        try{
        if (r >>> 32 != 0) {
            throw new ArithmeticException();
        }}
        catch(ArithmeticException e){
            return 0;
        }
        return (int)r;
    }
    public static int rev(int num){
        int rev_n=0;
        if(num<0) {
            while (num < 0) {
                rev_n = add(rev_n * 10,num % 10);
                num = num / 10;
            }}
        else{
            while (num >0) {
                rev_n = add(rev_n * 10,num % 10);
                num = num / 10;
            }}
        return rev_n;
    }
    public static void main(String args[]){
        int num= 2147483647;
        int a=rev(num);
        System.out.println(a);
    }}
