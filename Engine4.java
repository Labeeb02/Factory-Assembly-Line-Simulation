public class Engine4 implements Engine{
    private int powerOutput;
    private int speedLimit;
    private int airFuelRatio;
    private int noOfPistons;
    private int noOfValves;
    private String material;
    private String name="Honda";
    Engine4(){
        powerOutput=650;
        speedLimit=220;
        airFuelRatio=18;
        noOfPistons=5;
        noOfValves=6;
        material="steel";
    }
    
    public int getTime()
    {
        return 8;
    }
    public String getDetails()
    {
    	System.out.println(this);
        System.out.println("	Power Output : "+powerOutput);
        System.out.println("; Speed Limit : "+speedLimit);
        System.out.println("; Air Fuel Ratio : "+airFuelRatio);
        System.out.println("; No Of Pistons : "+noOfPistons);
        System.out.println("; No Of Valves : "+noOfValves);
        System.out.println("; Material : "+material);
        return "\n"+toString()+"\n"+
        "   Power Output : "+powerOutput+"\n"+
        "   Speed Limit : "+speedLimit+"\n"+
        "   Air Fuel Ratio : "+airFuelRatio+"\n"+
        "   No Of Pistons : "+noOfPistons+"\n"+
        "   No Of Valves : "+noOfValves+"\n"+
        "   Material : "+material;
    }
    public String toString()
    {
    	return this.name;
    }
}
