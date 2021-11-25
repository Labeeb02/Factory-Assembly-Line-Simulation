public class Chasis3 implements Chasis{
    private String breakingSystem;
    private String clutchType;
    private String batteryType;
    private String enginePosition; 
    private String name="Monocoque";
    Chasis3(){
         breakingSystem="Drum_Breakes";
         clutchType="Centrifugal_clutch";
         batteryType="Starting, Lighting, and Ignition (SLI) Battery";
         enginePosition="Rear mid-engine "; 
    }
    
    public int getTime()
    {
        return 4;
    }
    public String getDetails()
    {
        System.out.println(this);
        System.out.print("    Breaking System : "+breakingSystem);
        System.out.print("; Clutch Type     : "+clutchType);
        System.out.print("; Battery Type    : "+batteryType);
        System.out.println("; Engine Position : "+enginePosition);
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
