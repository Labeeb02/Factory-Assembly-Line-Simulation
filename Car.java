public class Car{
    Chasis chasis;
    Wheel wheel;
    Engine engine;
    Interior interior;
    Frame frame;
    Color color;
//    int check=0;

    Car(Chasis chasis,Wheel wheel,Engine engine,Interior interior,Frame frame,Color color){
        this.chasis=chasis;
        this.wheel=wheel;
        this.engine=engine;
        this.interior=interior;
        this.frame=frame;
        this.color=color;

    }
//    public void getDetailsWheel(){
//        wheel.getDetails();
//    }
//    public void getDetailsEngine(){
//        engine.getDetails();
//    }
//    public void getDetailsInterior(){
//        interior.getDetails();
//    }
//    public void getDetailsFrame(){
//        frame.getDetails();
//    }
//    public void getDetailsColor(){
//        color.getDetails();
//    }
//    public void getDetailsChasis(){
//        chasis.getDetails();
//    }
    public int getTimeWheel(){
//        check++;
        return wheel.getTime();
    }
    public int getTimeChasis(){
//        check++;
        return chasis.getTime();
    }public int getTimeEngine(){
//        check++;
        return engine.getTime();
    }public int getTimeInterior(){
//        check++;
        return interior.getTime();
    }public int getTimeFrame(){
//        check++;
        return frame.getTime();
    }public int getTimeColor(){
//        check++;
        return color.getTime();
    }
//    public boolean Finished(){
//        if(check==6)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        } 
//    }
}
