public class Chasis4 implements Chasis{
    private String breakingSystem;
    private String clutchType;
    private String batteryType;
    private String enginePosition; 
    private String name="Tubular";
    Chasis4(){
         breakingSystem="Drum_Breakes";
         clutchType="Centrifugal_clutch";
         batteryType="Valve-Regulated Lead-Acid (VRLA) Battery";
         enginePosition="Front-engine"; 
    }

    public int getTime()
    {
        return 8;
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
