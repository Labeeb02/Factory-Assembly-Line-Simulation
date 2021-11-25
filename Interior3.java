public class Interior3 implements Interior{
    private int comfortValue;
    private String leatherType;
    private String color;
    private String steeringWheelPosition;
    private int maxPassengers;
    private boolean sunRoof;
    private String name="Headliner";
    Interior3(){
        comfortValue=4;
        leatherType="Full-grain Leather";
        color="Brown";
        steeringWheelPosition="left";
        maxPassengers=6;
        sunRoof=true;
    }
    
    public int getTime(){
        return 3;
    }
    public String getDetails()
    {
        System.out.println("Comfort : "+comfortValue);
        System.out.println("Leather Type : "+leatherType);
        System.out.println("Color : "+color);
        System.out.println("Steering Position"+steeringWheelPosition);
        System.out.println("Max Passengers : " +maxPassengers);
        if(sunRoof){
        	return "\n"+toString()+"\n"+
        	        "   Comfort : "+comfortValue+"\n"+
        	        "   Leather Type : "+leatherType+"\n"+
        	        "   Color : "+color+"\n"+
        	        "   Steering Wheel Position"+steeringWheelPosition+"\n"+
        	        "   Max Passengers : " +maxPassengers+"\n"+
        	        "   Sunroof : Present";
        }
        else{
        	return "\n"+toString()+"\n"+
        	        "   Comfort : "+comfortValue+"\n"+
        	        "   Leather Type : "+leatherType+"\n"+
        	        "   Color : "+color+"\n"+
        	        "   Steering Wheel Position"+steeringWheelPosition+"\n"+
        	        "   Max Passengers : " +maxPassengers+"\n"+
        	        "   Sunroof : Not Present";
        }
        
    }
    public String toString()
    {
    	return this.name;
    }
}

