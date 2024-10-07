public class Max3 {
    public static void main(String[] args) {
        int m=max(max(3,7), 11);
        System.out.println("Max="+m);
    }

    static int max(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }
}
