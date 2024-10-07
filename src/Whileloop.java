public class Whileloop {
    public static void main(String[] args) {
        //While loop kan køres et uendligt antal gange, da man først kommer ud når betingelsen er udført
        int alder = 13;

        while (alder < 18){
            System.out.println("du er " + alder + " år. Vent til du bliver ældre");
            alder = alder+1;
            System.out.println("tilykke med fødselsdagen");
        }
        System.out.println("Nu er du " + alder + " år og mynding");
    }
}
