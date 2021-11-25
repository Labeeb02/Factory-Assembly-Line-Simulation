public class Frame4 implements Frame{
    private String frameType;
    private int loadCapacity;
    private String material;
    private String name="Frame4";
    Frame4(){
        frameType="Integral frame";
        loadCapacity=1;
        material="Alluminium alloy";
    }
    
    public int getTime()
    {
        return 1;
    }
    public String getDetails()
    {
        System.out.println("Frame Type : "+ frameType);
        System.out.println("Load Capacity : " + loadCapacity);
        System.out.println("Material : " +material);
        return "\n"+toString()+"\n"+
        "   Frame Type : "+ frameType+"\n"+
        "   Load Capacity : " + loadCapacity+"\n"+
        "   Material : " +material;
    }
    public String toString()
    {
    	return this.name;
    }
}