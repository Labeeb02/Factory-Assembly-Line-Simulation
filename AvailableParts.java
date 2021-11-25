import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AvailableParts extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AvailableParts frame = new AvailableParts();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AvailableParts() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 674, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
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
        Engine e5=new Engine5();
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
        Frame f5=new Frame5();
		
        JTextArea textArea = new JTextArea();
		textArea.setBounds(1, 1, 617, 208);
		contentPane.add(textArea);
		textArea.append("-----------------------------Chasis-----------------------------");;
		textArea.append(ch1.getDetails());
		textArea.append(ch2.getDetails());
		textArea.append(ch3.getDetails());
		textArea.append(ch4.getDetails());
		
		textArea.append("\n\n-----------------------------Wheel-----------------------------");
		textArea.append(w1.getDetails());
		textArea.append(w2.getDetails());
		textArea.append(w3.getDetails());
		textArea.append(w4.getDetails());
		
		textArea.append("\n\n-----------------------------Engine-----------------------------");
		textArea.append(e1.getDetails());
		textArea.append(e2.getDetails());
		textArea.append(e3.getDetails());
		textArea.append(e4.getDetails());
		textArea.append(e5.getDetails());
		
		textArea.append("\n\n-----------------------------Interior-----------------------------");
		textArea.append(i1.getDetails());
		textArea.append(i2.getDetails());
		textArea.append(i3.getDetails());
		textArea.append(i4.getDetails());
		
		textArea.append("\n\n-----------------------------Frame-----------------------------");
		textArea.append(f1.getDetails());
		textArea.append(f2.getDetails());
		textArea.append(f3.getDetails());
		textArea.append(f4.getDetails());
		textArea.append(f5.getDetails());
		
		textArea.append("\n\n-----------------------------Color-----------------------------");
		textArea.append(co1.getDetails());
		textArea.append(co2.getDetails());
		textArea.append(co3.getDetails());
		textArea.append(co4.getDetails());
		
		textArea.append("\n\n-----------------------------End-----------------------------");
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 10, 640, 435);
//		textArea.append("Hello\n\n\n\\n\n\nHeloo\n\nsf\n\nsdf\n\n\ns");
		contentPane.add(scrollPane);
        
//		JFrame jf=this;
//		JButton btnClose = new JButton("Close");
//		btnClose.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
//			}
//		});
//		btnClose.setBounds(269, 407, 123, 38);
//		contentPane.add(btnClose);
		
	}
}
