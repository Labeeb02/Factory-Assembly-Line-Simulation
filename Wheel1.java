public class Wheel1 implements Wheel {
    private String bearing;
    private int boltPattern;
    private String tyre;
    private char speedSymbol;
    private int loadIndex;
    private int rimDiametre;
    private String name = "Borbet";

    Wheel1(){
        bearing="Ball bearing";
        boltPattern= 6;
        tyre="Performance Tyres";
        speedSymbol='U';
        loadIndex=95;
        rimDiametre=15;
    }

    public int getTime() {
        return 2;
    }

    public String getDetails() {
        System.out.println("Bearing : " + bearing);
        System.out.println("Bolt Pattern : " + boltPattern);
        System.out.println("Tyre : " + tyre);
        System.out.println("Speed : " + speedSymbol);
        System.out.println("Load Index : " + loadIndex);
        System.out.println("Rim Diametre : " + rimDiametre);
        return "\n" + toString() + "\n" + "   Bearing : " + bearing + "\n" + "   Bolt Pattern : " + boltPattern + "\n"
                + "   Tyre : " + tyre + "\n" + "   Speed : " + speedSymbol + "\n" + "   Load Index : " + loadIndex + "\n"
                + "   Rim Diametre : " + rimDiametre;

    }

    public String toString() {
        return this.name;
    }
}