public class Interior4 implements Interior{
    private int comfortValue;
    private String leatherType;
    private String color;
    private String steeringWheelPosition;
    private int maxPassengers;
    private boolean sunRoof;
    private String name="Ornament";
    Interior4(){
        comfortValue=5;
        leatherType="Full-grain Leather";
        color="Black";
        steeringWheelPosition="Left";
        maxPassengers=5;
        sunRoof=false;
    }
    public int getTime(){
        return 5;
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

