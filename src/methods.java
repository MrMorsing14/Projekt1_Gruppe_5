import java.util.Random;

public class methods {
    public static void hils(String navn)
    {
        Random gen = new Random();
        int tal = gen.nextInt(4000);

        Random random =  new Random();
        int randomindex = random.nextInt(4);
        char randomletter = (char) ('A' + randomindex);

        System.out.println();
        System.out.println("Dear "+navn+ " !");
        System.out.println("We are happy to recieve your registration.");
        System.out.println("Your start number is: "+tal+" ");
        System.out.println("You start in start group: "+randomletter+" ");
        System.out.println("Please check in 10 minutes before start.");
    }
    public static void main(String[] args)
    {
        hils("Peter Adams");
        hils("Omar Farooq");
        hils("Lotte Nybo");
    }
}
