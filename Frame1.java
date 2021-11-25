public class Frame1 implements Frame{
    private String frameType;
    private int loadCapacity;
    private String material;
    private String name;
    Frame1(){
         frameType="Conventional frame";
        loadCapacity= 3;
         material="carbon-steel";
         name="Frame1";
    }
    
    public int getTime()
    {
        return 2;
    }
    public String getDetails()
    {
        System.out.println("Frame Type : "+ frameType);
        System.out.println("Load Capacity : " + loadCapacity);
        System.out.println("Material : " +material);
        return "\n"+toString()+"\n"+
        "   Framee Type : "+ frameType+"\n"+
        "   Load Capacity : " + loadCapacity+"\n"+
        "   Material : " +material;
    }
    public String toString()
    {
    	return this.name;
    }
}
