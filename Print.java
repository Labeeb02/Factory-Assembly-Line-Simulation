import javax.swing.*;
public class Print {
    public void PrintTime(int t,JTextArea textArea)
    {
        if (t/60<10) {
        	//System.out.print("0");
        textArea.append("0");
        }
        //System.out.print(t/60 + ":");
        textArea.append(t/60 + ":");
        if(t%60<10){
            //System.out.print("0");
            textArea.append("0");
        }
        //System.out.print(t%60);  
        textArea.append(t%60+"");
        // try{
        //     Thread.sleep(pt*100);
        // }     
        // catch(InterruptedException e)
        // {
        // }
    }
//    public void PrintTime(int t)
//    {
//        if (t/60<10) {
//        //System.out.print("0");
//        }
//        //System.out.print(t/60 + ":");
//        if(t%60<10){
//            //System.out.print("0");
//        }
//        //System.out.print(t%60);   
//        // try{
//        //     Thread.sleep(pt*100);
//        // }     
//        // catch(InterruptedException e)
//        // {
//        // }
//    }
}
