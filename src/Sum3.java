public class Sum3 {
    public static void main(String[] args) {
        int ialt;
        ialt=sum(1,2,3);

        int a=7;
        int b=3;
        int c=5;
        ialt=sum(a,b,c);
        System.out.println(ialt);
    }

    static int sum(int x, int y, int z){
        int result=x+y+z;
        return result;


    }
}
