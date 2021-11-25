public class Engine2 implements Engine{
    private int powerOutput;
    private int speedLimit;
    private int airFuelRatio;
    private int noOfPistons;
    private int noOfValves;
    private String material;
    private String name="Citroen";
    Engine2(){
        powerOutput=500;
        speedLimit=180;
        airFuelRatio=15;
        noOfPistons=7;
        noOfValves=3;
        material="steel";
    }
    
    public int getTime()
    {
        return 6;
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
