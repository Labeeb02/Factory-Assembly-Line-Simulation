import javax.swing.*;
import javax.swing.text.Document;
public class AssemblyLine implements Runnable {
    int id;
    Car car;
    int t;
    Print print;
    JTextArea textArea;
    JButton btnSubmit;
    AssemblyLine(Car car,Print print,int id,JTextArea textArea,JButton btnSubmit){
         this.car=car;
            t=0;
            this.print=print;
            this.id=id;
            this.textArea=textArea;
            this.btnSubmit=btnSubmit;
    }

    @Override
    public void run() {
        
        try{
            int pt=0;
            pt=car.getTimeChasis();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Chasis Production Finished at "+id);
            textArea.append("  Chasis Production Finished at Assembly Line "+id+"\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
            pt=car.getTimeWheel();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Wheel Production Finishedat at "+id);
            textArea.append("  Wheel Attachment Finished at Assembly Line "+id+"\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
            pt=car.getTimeEngine();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Engine Insertion Finished at "+id);
    
            textArea.append("  Engine Insertion Finished at Assembly Line "+id+"\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
            pt=car.getTimeInterior();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Interior Production Finished at "+id);
            textArea.append("  Interior Attachment Finished at Assembly Line "+id+"\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
            pt=car.getTimeFrame();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Frame Production Finished at "+id);
            textArea.append("  Frame Attachment Finished at Assembly Line "+id+"\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
            pt=car.getTimeColor();
            Thread.sleep(pt*1000);
            t+=pt;
            synchronized(print){
            print.PrintTime(t,textArea);
            //System.out.println("  Color Production Finished at "+id);
            textArea.append("  Color Wrapping Finished at Assembly Line "+id+"\n");
            print.PrintTime(t,textArea);
            textArea.append("-------------  Car Production Finished at Assembly Line "+id+"-------------\n");
            Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
            }
        }
        catch(InterruptedException e)
        {}
//        if(car.Finished())
//        {
//            synchronized(print){
//            print.PrintTime(t,textArea);
//            //System.out.println("  Car Production Finished at "+id);
//            textArea.append("  Car Production Finished at "+id+"\n");
//            }
//        }
        
    }
}