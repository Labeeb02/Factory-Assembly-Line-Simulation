public class Engine1 implements Engine{
    private int powerOutput;
    private int speedLimit;
    private int airFuelRatio;
    private int noOfPistons;
    private int noOfValves;
    private String material;
    private String name="Alfa Romeo";
    Engine1(){
        powerOutput=600;
        speedLimit=150;
        airFuelRatio=14;
        noOfPistons=6;
        noOfValves=4;
        material="steel";
    }
    public int getTime()
    {
        return 5;
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
