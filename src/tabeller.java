public class tabeller {
    public static void main(String[] args) {
        for (int n=0; n<=20; n++)
        {
            int tealler = 0;
            int sum =0;
            for  (int j=0; j<n; j++){
                tealler = tealler+1;
                sum = sum+tealler;

            }
            System.out.println(sum);
        }
    }
}
