public class Frame2 implements Frame{
    private String frameType;
    private int loadCapacity;
    private String material;
    private String name="Frame2";
    Frame2(){
        frameType="Conventional Frame";
        loadCapacity=2;
        material="steel";
    }
    
    public int getTime()
    {
        return 4;
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