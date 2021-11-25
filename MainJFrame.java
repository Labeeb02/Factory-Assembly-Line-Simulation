import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class MainJFrame extends JFrame {

	private JPanel contentPane;
//	private JTextField textField; this was like this from start
//	private JTextArea textArea;
//	private JButton btnSubmit;
//	private JComboBox chasis_choice;
//	private JComboBox wheel_choice;
//	private JComboBox engine_choice;
//	private JComboBox interior_choice;
//	private JComboBox frame_choice;
//	private JComboBox color_choice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JComboBox textField=new JComboBox();
		JTextArea textArea=new JTextArea();;
		JButton btnSubmit=new JButton("Submit");
		JLabel lblAssLine = new JLabel("");
		JComboBox chasis_choice=new JComboBox();
		JComboBox wheel_choice=new JComboBox();
		JComboBox engine_choice=new JComboBox();
		JComboBox interior_choice=new JComboBox();
		JComboBox frame_choice=new JComboBox();
		JComboBox color_choice=new JComboBox();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame(textArea,btnSubmit,chasis_choice,wheel_choice,engine_choice,interior_choice,frame_choice,color_choice,textField,lblAssLine);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Factory f=new Factory(textArea,btnSubmit,chasis_choice,wheel_choice,engine_choice,interior_choice,frame_choice,color_choice,textField,lblAssLine);
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame(JTextArea textArea, JButton btnSubmit, JComboBox chasis_choice, JComboBox wheel_choice,
			JComboBox engine_choice, JComboBox interior_choice, JComboBox frame_choice, JComboBox color_choice,JComboBox textField,JLabel lblAssLine) {//JLabel lblAssLine
		
//		Wheel w1=new Wheel1();
//        Wheel w2=new Wheel2();
//        Wheel w3=new Wheel3();
//        Wheel w4=new Wheel4();
//        Chasis ch1=new Chasis1();
//        Chasis ch2=new Chasis2();
//        Chasis ch3=new Chasis3();
//        Chasis ch4=new Chasis4();
//        Engine e1=new Engine1();
//        Engine e2=new Engine2();
//        Engine e3=new Engine3();
//        Engine e4=new Engine4();
//        Color co1=new Color1();
//        Color co2=new Color2();
//        Color co3=new Color3();
//        Color co4=new Color4();
//        Interior i1=new Interior1();
//        Interior i2=new Interior2();
//        Interior i3=new Interior3();
//        Interior i4=new Interior4();
//        Frame f1=new Frame1();
//        Frame f2=new Frame2();
//        Frame f3=new Frame3();
//        Frame f4=new Frame4();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		textArea = new JTextArea();
		textArea.setBounds(1, 1, 617, 208);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(28, 284, 619, 183);
//		textArea.append("Hello\n\n\n\\n\n\nHeloo\n\nsf\n\nsdf\n\n\ns");
		contentPane.add(scrollPane);
		
		textArea.append("Enter No Of Assembly Lines\n");
		
//		chasis_choice = new JComboBox();
		chasis_choice.setBounds(20, 139, 100, 21);
//		chasis_choice.addItem(ch1.toString());
//		chasis_choice.addItem(ch2.toString());
//		chasis_choice.addItem(ch3.toString());
//		chasis_choice.addItem(ch4.toString());
		contentPane.add(chasis_choice);
		
		JLabel lblchasis = new JLabel("Chasis :");
		lblchasis.setBounds(20, 109, 100, 21);
		contentPane.add(lblchasis);
		
//		wheel_choice = new JComboBox();
		wheel_choice.setBounds(135, 139, 100, 21);
//		wheel_choice.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				textArea.append(wheel_choice.getSelectedItem().toString()+"\n");
//			}
//		});
//		wheel_choice.addItem(w1.toString());
//		wheel_choice.addItem(w2.toString());
//		wheel_choice.addItem(w3.toString());
//		wheel_choice.addItem(w4.toString());
//		textArea.append(wheel_choice.getSelectedItem().toString());
		contentPane.add(wheel_choice);
		
		JLabel lblwheel = new JLabel("Wheel :");
		lblwheel.setBounds(135, 109, 100, 21);
		contentPane.add(lblwheel);
		
//		engine_choice = new JComboBox();
		engine_choice.setBounds(246, 139, 100, 21);
		contentPane.add(engine_choice);
		
		JLabel lblengine = new JLabel("Engine :");
		lblengine.setBounds(246, 109, 100, 21);
		contentPane.add(lblengine);
		
//		interior_choice = new JComboBox();
		interior_choice.setBounds(354, 139, 100, 21);
		contentPane.add(interior_choice);
		
		JLabel lblinterior = new JLabel("Interior :");
		lblinterior.setBounds(354, 109, 100, 21);
		contentPane.add(lblinterior);
		
//		frame_choice = new JComboBox();
		frame_choice.setBounds(463, 139, 100, 21);
		contentPane.add(frame_choice);
		
		JLabel lblframe = new JLabel("Frame :");
		lblframe.setBounds(463, 109, 100, 21);
		contentPane.add(lblframe);
		
//		color_choice = new JComboBox();
		color_choice.setBounds(572, 139, 100, 21);
		contentPane.add(color_choice);
		
		JLabel lblcolor = new JLabel("Color :");
		lblcolor.setBounds(572, 109, 100, 21);
		contentPane.add(lblcolor);
		
		JLabel lblAssembly = new JLabel("Enter Number Of Assembly Lines :");
		lblAssembly.setBounds(20, 25, 327, 36);
		lblAssembly.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblAssembly);
		
//		textField = new JTextField();
//		textField.setBounds(307, 32, 50, 25);
//		contentPane.add(textField);
//		textField.setColumns(10);
		textField.setBounds(307, 32, 50, 25);
		contentPane.add(textField);
		for(int i=1;i<=1024;i++)
		{
			textField.addItem(Integer.toString(i));
		}
//		textField.addItem("1");
//		textField.addItem("2");
//		textField.addItem("3");
//		textField.addItem("4");
//		textField.addItem("5");
//		textField.addItem("6");
//		textField.addItem("7");
//		textField.addItem("8");
//		textField.addItem("9");
//		textField.addItem("10");
//		
		
//		btnSubmit = new JButton("Submit No Of Assembly Lines");
		
		btnSubmit.setBounds(170, 253, 350, 21);
		contentPane.add(btnSubmit);
		
		JButton btnMenu = new JButton("Available Parts");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AvailableParts frame = new AvailableParts();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnMenu.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnMenu.setBounds(647, 35, 149, 26);
		contentPane.add(btnMenu);
		
//		JLabel lblAssLine = new JLabel("");
		lblAssLine.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAssLine.setBounds(398, 10, 239, 76);
		contentPane.add(lblAssLine);
		
		
		
		
		
		
	}
}
