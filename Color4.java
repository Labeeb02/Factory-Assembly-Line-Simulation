public class Color4 implements Color{
    private String hoodPattern;
    private String hoodPatternColor;
    private String paint;
    private String paintType;  
    private String name="DM 982";
    Color4(){
        hoodPattern="";
        hoodPatternColor="Blue";
        paint="Blue";
        paintType="Urethane";
    }
    public int getTime()
    {
        return 6;
    }
    public String getDetails()
    {
        System.out.println(this);
        System.out.print("    Hood Pattern : "+hoodPattern);
        System.out.print("; Hood Pattern Color : "+hoodPatternColor);
        System.out.print("; Paint : "+paint);
        System.out.println("; Paint Type : "+paintType);
        return "\n"+toString()+"\n"+
        "   Hood Pattern Color : "+hoodPatternColor+"\n"+
        "   Paint : "+paint+"\n"+
        "   Paint Type : "+paintType;
    }
    public String toString()
    {
    	return this.name;
    }
}
