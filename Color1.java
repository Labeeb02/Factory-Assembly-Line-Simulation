public class Color1 implements Color{
    private String hoodPattern;
    private String hoodPatternColor;
    private String paint;
    private String paintType;  
    private String name="CM 134"; 
    Color1(){
        hoodPattern="";
        hoodPatternColor="Black";
        paint="Red";
        paintType="Enamel";
    }
    
    public int getTime()
    {
        return 4;
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
