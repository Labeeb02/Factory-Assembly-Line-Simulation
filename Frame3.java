public class Frame3 implements Frame{
    private String frameType;
    private int loadCapacity;
    private String material;
    private String name="Frame3";
    Frame3(){
        frameType="Semi-integral frame";
        loadCapacity=2;
        material="Alluminium alloy";
    }
    
    public int getTime()
    {
        return 5;
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