public class Wheel2 implements Wheel{
    private String bearing;
    private int boltPattern;
    private String tyre;
    private char speedSymbol;
    private int loadIndex;
    private int rimDiametre;
    private String name="Enkei";
    Wheel2(){
    bearing="Plain bore";
    boltPattern=5;
    tyre="All-Terrain Tyres";
     speedSymbol = 'H';
    loadIndex=90;
    rimDiametre=19;
    }
    public int getTime()
    {
        return 5;
    }
    public String getDetails()
    {
        System.out.println("Bearing : " + bearing);
        System.out.println("Bolt Pattern : " + boltPattern);
        System.out.println("Tyre : " +tyre);
        System.out.println("Speed : " +speedSymbol);
        System.out.println("Load Index : " +loadIndex);
        System.out.println("Rim Diametre : " +rimDiametre);
        return "\n"+toString()+"\n"+
        "   Bearing : " + bearing+"\n"+
        "   Bolt Pattern : " + boltPattern+"\n"+
        "   Tyre : " +tyre+"\n"+
        "   Speed : " +speedSymbol+"\n"+
        "   Load Index : " +loadIndex+"\n"+
        "   Rim Diametre : " +rimDiametre;
        
    }
    public String toString()
    {
    	return this.name;
    }
}