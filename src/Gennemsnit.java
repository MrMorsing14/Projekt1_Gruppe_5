public class Gennemsnit {
    public static void main(String[] args) {
        double ialt;
        ialt=gennemsnit(13,30,25);

        int a=35;
        int b=77;
        int c=1;
        ialt=gennemsnit(a,b,c);
        System.out.println(ialt/3);

    }
        static double gennemsnit (int x, int y, int z){
        double result=(double)x+(double)y+(double)z;
                return result;

        }
}
