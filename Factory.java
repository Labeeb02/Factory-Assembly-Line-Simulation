import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.text.Document;
public class Factory{
    static Scanner sc=new Scanner(System.in);
    private JComboBox textField;
    private JTextArea textArea;
    private JButton btnSubmit;
    private JLabel lblAssLine;
    private JComboBox chasis_choice;
    private JComboBox wheel_choice;
    private JComboBox engine_choice;
    private JComboBox interior_choice;
    private JComboBox frame_choice;
    private JComboBox color_choice;
    int check1=0,check2=1,count=1,n;
//    ArrayList<Integer> check=new ArrayList();
//    ArrayList<Wheel> wheel=new ArrayList<>();
    
    Chasis chasis=chasisSelector(1);
    Wheel wheel=wheelSelector(1);
    Engine engine=engineSelector(1);
    Interior interior=interiorSelector(1);
    Frame frame=frameSelector(1);
    Color color=colorSelector(1);
    
    public Factory(JTextArea textArea, JButton btnSubmit, JComboBox chasis_choice, JComboBox wheel_choice,
			JComboBox engine_choice, JComboBox interior_choice, JComboBox frame_choice, JComboBox color_choice,JComboBox textField,JLabel lblAssLine) {
    	this.textArea=textArea;
    	this.btnSubmit=btnSubmit;
    	this.chasis_choice=chasis_choice;
    	this.wheel_choice=wheel_choice;
    	this.engine_choice=engine_choice;
    	this.frame_choice=frame_choice;
    	this.color_choice=color_choice;
    	this.interior_choice=interior_choice;
    	this.textField=textField;
    	this.lblAssLine=lblAssLine;
    	this.Start();
	}
	public void Start() {
        
//        System.out.print("Enter No Of Assembly Lines - ");
//        int n=sc.nextInt();
		while(check1==0)
		{
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n=textField.getSelectedIndex()+1;
//				textField.setEditable(false);
				lblAssLine.setText(n+" Assembly Lines Chosen");
				check1=1;
			}
		});
		}
//		for(int i=0;i<n;i++)
//		{
//			check.add(1);
//		}
        ArrayList<Runnable> r=new ArrayList<Runnable>(n);
        ArrayList<Thread> t=new ArrayList<>(n);
        Print print=new Print();
        initialiseJComboBox();
//        System.out.println("Enter the Parts Details as Asked !");
        for(int i=0;i<n;i++)
        {
//            Chasis chasis=chasisSelector(1);
//            Wheel wheel=wheelSelector(1);
//            Engine engine=engineSelector(1);
//            Interior interior=interiorSelector(1);
//            Frame frame=frameSelector(1);
//            Color color=colorSelector(1);
//            this.partSelector();
        	textArea.append("\nInput Parts For Assembly Line "+(i+1)+"\n");
        	check2=0;
//        	check.set(i, 0);
//        	textArea.append("In Loop "+i+" Before Input "+check+" Updated Outside\n");
        	while(check2==0)
        	{
        		btnSubmit.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				wheel=wheelSelector(wheel_choice.getSelectedIndex()+1);
        				chasis=chasisSelector(chasis_choice.getSelectedIndex()+1);
        				engine=engineSelector(engine_choice.getSelectedIndex()+1);
        				interior=interiorSelector(interior_choice.getSelectedIndex()+1);
        				frame=frameSelector(frame_choice.getSelectedIndex()+1);
        				color=colorSelector(color_choice.getSelectedIndex()+1);
        				check2=1;
        				
        			}
        		});
        		btnSubmit = new JButton("Submit");
        		btnSubmit.setBounds(301, 253, 85, 21);
//        		check.set(i, check2);
//        		if(check.get(i)==1)
//        		textArea.append("In Loop "+i+" Input "+check.get(i)+" Updated Outside\n");
        	}
        	textArea.append("Assembly Line "+(i+1)+" Input Received\n");
        	Document d = textArea.getDocument();
            textArea.select(d.getLength(), d.getLength());
//        	textArea.append("In Loop "+i+" After Input "+check+" Updated Outside\n");
        	if(check2==1)
            {
//        		textArea.append("Assembly Line "+i+" Updated Inside\n");
        		Car c=new Car(chasis,wheel,engine,interior,frame,color);
        		r.add(new AssemblyLine(c,print,i+1,textArea,btnSubmit)); //cha,w,e,interior,f,col
            
            t.add(new Thread(r.get(i)));
            if(10-i>=1)
            t.get(i).setPriority(10-i);
            else
            t.get(i).setPriority(1);
            
            }
        } 
        textArea.append("\n00:00 All Assembly Line Production Started\n");
        Document d = textArea.getDocument();
        textArea.select(d.getLength(), d.getLength());
        
        for(int i=0;i<n;i++)
        {
            t.get(i).start();
        }
        try{
            for(int i=0;i<n;i++)
                t.get(i).join();
        }
        catch(InterruptedException e)
        {
        }
        
//        btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JButton source = (JButton) e.getSource();
//                source.setEnabled(false);
//
//			}
//		});
        
        sc.close();
    }
	public void initialiseJComboBox(){
        Wheel w1=new Wheel1();
        Wheel w2=new Wheel2();
        Wheel w3=new Wheel3();
        Wheel w4=new Wheel4();
        Chasis ch1=new Chasis1();
        Chasis ch2=new Chasis2();
        Chasis ch3=new Chasis3();
        Chasis ch4=new Chasis4();
        Engine e1=new Engine1();
        Engine e2=new Engine2();
        Engine e3=new Engine3();
        Engine e4=new Engine4();
        Color co1=new Color1();
        Color co2=new Color2();
        Color co3=new Color3();
        Color co4=new Color4();
        Interior i1=new Interior1();
        Interior i2=new Interior2();
        Interior i3=new Interior3();
        Interior i4=new Interior4();
        Frame f1=new Frame1();
        Frame f2=new Frame2();
        Frame f3=new Frame3();
        Frame f4=new Frame4();
        
        
        wheel_choice.addItem(w1.toString());
		wheel_choice.addItem(w2.toString());
		wheel_choice.addItem(w3.toString());
		wheel_choice.addItem(w4.toString());
		engine_choice.addItem(e1.toString());
		engine_choice.addItem(e2.toString());
		engine_choice.addItem(e3.toString());
		engine_choice.addItem(e4.toString());
		interior_choice.addItem(i1.toString());
		interior_choice.addItem(i2.toString());
		interior_choice.addItem(i3.toString());
		interior_choice.addItem(i4.toString());
		frame_choice.addItem(f1.toString());
		frame_choice.addItem(f2.toString());
		frame_choice.addItem(f3.toString());
		frame_choice.addItem(f4.toString());
		color_choice.addItem(co1.toString());
		color_choice.addItem(co2.toString());
		color_choice.addItem(co3.toString());
		color_choice.addItem(co4.toString());
		chasis_choice.addItem(ch1.toString());
		chasis_choice.addItem(ch2.toString());
		chasis_choice.addItem(ch3.toString());
		chasis_choice.addItem(ch4.toString());
		
		
//        System.out.println("    Available Parts List Is Shown Below :");
//        System.out.println("List Of Available Chasis :");
//        ch1.getDetails();
//        ch2.getDetails();
//        ch3.getDetails();
//        ch4.getDetails();
//        System.out.println();
//        System.out.println("List Of Wheels :");
//        w1.getDetails();
//        w2.getDetails();
//        w3.getDetails();
//        w4.getDetails();
//        System.out.println();
//        System.out.println("List Of Engine :");
//        e1.getDetails();
//        e2.getDetails();
//        e3.getDetails();
//        e4.getDetails();
//        System.out.println();
//        System.out.println("List Of Interior :");
//        i1.getDetails();
//        i2.getDetails();
//        i3.getDetails();
//        i4.getDetails();
//        System.out.println();
//        System.out.println("List Of Frame :");
//        f1.getDetails();
//        f2.getDetails();
//        f3.getDetails();
//        f4.getDetails();
//        System.out.println();
//        System.out.println("List Of Color :");
//        co1.getDetails();
//        co2.getDetails();
//        co3.getDetails();
//        co4.getDetails();
//        System.out.println();
        
    }
    public Wheel wheelSelector(int i){
//        System.out.println("Enter the Wheel Index -- ");
//        int i=sc.nextInt();
        Wheel w;
        if(i==1)
        {
            w=new Wheel1();
        }
        else if(i==2)
        {
            w=new Wheel2();
        }
        else if(i==3)
        {
            w=new Wheel3();
        }
        else if(i==4)
        {
            w=new Wheel4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Wheel Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=wheelSelector(i);
        }
        return w;
    }
    public Chasis chasisSelector(int i){
//        System.out.println("Enter the Chasis Index -- ");
//        int i=sc.nextInt();
        Chasis w;
        if(i==1)
        {
            w=new Chasis1();
        }
        else if(i==2)
        {
            w=new Chasis2();
        }
        else if(i==3)
        {
            w=new Chasis3();
        }
        else if(i==4)
        {
            w=new Chasis4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Chasis Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=chasisSelector(i);
        }
        return w;
    }
    public Color colorSelector(int i){
//        System.out.println("Enter the Color Index -- ");
//        int i=sc.nextInt();
        Color w;
        if(i==1)
        {
            w=new Color1();
        }
        else if(i==2)
        {
            w=new Color2();
        }
        else if(i==3)
        {
            w=new Color3();
        }
        else if(i==4)
        {
            w=new Color4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Color Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=colorSelector(i);
        }
        return w;
    }
    public Frame frameSelector(int i){
//        System.out.println("Enter the Frame Index -- ");
//        int i=sc.nextInt();
        Frame w;
        if(i==1)
        {
            w=new Frame1();
        }
        else if(i==2)
        {
            w=new Frame2();
        }
        else if(i==3)
        {
            w=new Frame3();
        }
        else if(i==4)
        {
            w=new Frame4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Frame Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=frameSelector(i);
        }
        return w;
    }
    public Engine engineSelector(int i){
//        System.out.println("Enter the Engine Index -- ");
//        int i=sc.nextInt();
        Engine w;
        if(i==1)
        {
            w=new Engine1();
        }
        else if(i==2)
        {
            w=new Engine2();
        }
        else if(i==3)
        {
            w=new Engine3();
        }
        else if(i==4)
        {
            w=new Engine4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Engine Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=engineSelector(i);
        }
        return w;
    }
    public Interior interiorSelector(int i){
//        System.out.println("Enter the Interior Index -- ");
//        int i=sc.nextInt();
        Interior w;
        if(i==1)
        {
            w=new Interior1();
        }
        else if(i==2)
        {
            w=new Interior2();
        }
        else if(i==3)
        {
            w=new Interior3();
        }
        else if(i==4)
        {
            w=new Interior4();
        }
        else
        {
            //run a for loop here asking for repeated inputs untila right input is recieved
            System.out.println("This Interior Is Not Available\nHere are a list of available Lists -- ");
            initialiseJComboBox();
            w=interiorSelector(i);
        }
        return w;
    }
    public void partSelector() {
    	btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
    }
}
