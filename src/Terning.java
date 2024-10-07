public class Terning {
    public static void main(String[] args) {

    }

    private int værdi;

    public Terning()
    {
        værdi=(int)(Math.random()*6+1);
    }

    public void kast()
    {
        double tilfældigTal = Math.random();
        værdi = (int) (tilfældigTal * 6+1);
    }
    public int getVærdi()
    {
        return værdi;
    }
    public void setVærdi(int nyVærdi)
    {
        værdi=nyVærdi;
    }

    public String toString() {
        String svar = ""+værdi;
        return svar;

    }

}
