import java.util.Random;

public class platellerkrone {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(2);
        System.out.println(tal);

        if (tal == 0) {
            System.out.println("Plat");
            System.out.println("Tillykke du har vundet");
        }
        else{
            System.out.println("Krone");
        System.out.println("Desværre du har tabt");
    }
    }
}
