public class SwitchDice {
    public static void main(String[] args) {
        int dice = 1;

        switch(dice){
            case 1:
                System.out.println("Brekkie");
                break;
            case 2:
                System.out.println("Studie");
                break;
            case 3:
                System.out.println("Swim.");
                break;
            case 4:
                System.out.println("Fish");
                break;
            case 5:
                System.out.println("Call mama");
                break;
            case 6:
                System.out.println("baCK TO BED");
                break;
            default:
                System.out.println(dice + " is not useable value");
        }




    }
}
