public class Chasis1 implements Chasis{
    
    private String breakingSystem;
    private String clutchType;
    private String batteryType;
    private String enginePosition; 
    private String name="Ladder";
    Chasis1(){
         breakingSystem="Disc_Brakes";
         clutchType="Friction_Clutch";
         batteryType="Wet Cell Batteries";
         enginePosition="Front-engine"; 
    
    }

    public int getTime()
    {
        return 7;
    }
    public String getDetails()
    {
//        System.out.println(this);
//        System.out.print("    Breaking System : "+breakingSystem);
//        System.out.print("; Clutch Type     : "+clutchType);
//        System.out.print("; Battery Type    : "+batteryType);
//        System.out.println("; Engine Position : "+enginePosition);
        return "\n"+toString()+"\n"+
        	"   Breaking System : "+breakingSystem+"\n"+
        	"   Clutch Type     : "+clutchType+"\n"+
        	"   Battery Type    : "+batteryType+"\n"+
        	"   Engine Position : "+enginePosition;
    }
    public String toString()
    {
    	return this.name;
    }
}
