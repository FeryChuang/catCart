package hoemwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

public class addCat extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField weight;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField dry;
	private JTextField can;
	private JTextField bag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCat frame = new addCat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addCat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 232, 198));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_1.setBackground(new Color(255, 232, 198));
		panel_1.setBounds(10, 10, 155, 280);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("貓咪的名字");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(17, 66, 79, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("貓咪的體重(kg)");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(17, 122, 96, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("貓咪的狀態");
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(17, 178, 79, 15);
		panel_1.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBackground(new Color(255, 232, 198));
		name.setBounds(17, 91, 96, 21);
		panel_1.add(name);
		name.setColumns(10);
		
		weight = new JTextField();
		weight.setBackground(new Color(255, 232, 198));
		weight.setBounds(17, 147, 96, 21);
		panel_1.add(weight);
		weight.setColumns(10);
		
		JRadioButton kCat = new JRadioButton("幼貓");
		kCat.setBackground(new Color(255, 232, 198));
		kCat.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		buttonGroup.add(kCat);
		kCat.setBounds(84, 199, 65, 23);
		panel_1.add(kCat);
		
		JRadioButton aCat = new JRadioButton("成貓");
		aCat.setBackground(new Color(255, 232, 198));
		aCat.setSelected(true);
		aCat.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		buttonGroup.add(aCat);
		aCat.setBounds(17, 199, 65, 23);
		panel_1.add(aCat);
		
		JRadioButton pCat = new JRadioButton("孕貓");
		pCat.setBackground(new Color(255, 232, 198));
		pCat.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		buttonGroup.add(pCat);
		pCat.setBounds(84, 224, 65, 23);
		panel_1.add(pCat);
		
		JRadioButton oCat = new JRadioButton("老貓");
		oCat.setBackground(new Color(255, 232, 198));
		oCat.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		buttonGroup.add(oCat);
		oCat.setBounds(17, 224, 65, 23);
		panel_1.add(oCat);
		
		JLabel lblNewLabel_7 = new JLabel("熱量計算機");
		lblNewLabel_7.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_7.setBounds(25, 10, 100, 40);
		panel_1.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_2.setBackground(new Color(255, 232, 198));
		panel_2.setBounds(164, 10, 260, 280);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("乾飼料  $1380");
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(20, 68, 96, 15);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("點心罐 $60/罐 3罐1組");
		lblNewLabel_5.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(20, 136, 160, 15);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("主食餐包 $45/包 6包1組");
		lblNewLabel_6.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(20, 204, 184, 15);
		panel_2.add(lblNewLabel_6);
		/*
		dry = new JTextField();
		dry.setBackground(new Color(255, 232, 198));
		dry.setBounds(20, 35, 96, 21);
		panel_2.add(dry);
		dry.setColumns(10);
		
		can = new JTextField();
		can.setBackground(new Color(255, 232, 198));
		can.setBounds(20, 103, 96, 21);
		panel_2.add(can);
		can.setColumns(10);
		
		bag = new JTextField();
		bag.setBackground(new Color(255, 232, 198));
		bag.setBounds(20, 171, 96, 21);
		panel_2.add(bag);
		bag.setColumns(10);
		*/
		JSpinner bag2 = new JSpinner();
		bag2.setForeground(new Color(255, 232, 198));
		bag2.setBackground(new Color(255, 232, 198));
		bag2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(6)));
		bag2.setBounds(20, 229, 62, 22);
		panel_2.add(bag2);
		
		JSpinner can2 = new JSpinner();
		can2.setForeground(new Color(255, 232, 198));
		can2.setBackground(new Color(255, 232, 198));
		can2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(3)));
		can2.setBounds(20, 161, 62, 22);
		panel_2.add(can2);
		
		JLabel lblNewLabel_5_1 = new JLabel("每24罐加贈1罐");
		lblNewLabel_5_1.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(90, 164, 138, 15);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("每12包加贈1包");
		lblNewLabel_5_2.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_5_2.setBounds(90, 232, 138, 15);
		panel_2.add(lblNewLabel_5_2);
		
		JSpinner dry2 = new JSpinner();
		dry2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		dry2.setForeground(new Color(255, 232, 198));
		dry2.setBackground(new Color(255, 232, 198));
		dry2.setBounds(20, 93, 62, 22);
		panel_2.add(dry2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("2包(含)以上優惠價9折");
		lblNewLabel_5_1_1.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		lblNewLabel_5_1_1.setBounds(90, 96, 160, 15);
		panel_2.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel = new JLabel("貓咪購物車");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 10, 100, 41);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 232, 198));
		panel_3.setBounds(10, 300, 414, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 232, 198));
		panel_4.setBounds(10, 355, 414, 296);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBackground(new Color(255, 232, 198));
		output.setBounds(10, 10, 394, 276);
		panel_4.add(output);
		
		JButton btnNewButton = new JButton("送出!");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (name.getText().equals("")&&weight.getText().equals("")&&dry2.getValue().equals(0)&&can2.getValue().equals(0)&&bag2.getValue().equals(0)) {
					output.setText("(=Φ ω Φ=)✦\n請輸入名字與體重或直接下單");
				}else if(dry2.getValue().equals(0)&&can2.getValue().equals(0)&&bag2.getValue().equals(0)) {
					String Name=name.getText();
					double W=Double.parseDouble(weight.getText());
					double A=0;
					if(kCat.isSelected()||pCat.isSelected()){
						A=2;
					}else if(aCat.isSelected()){
						A=1;
					}else if(oCat.isSelected()){
						A=1.4;
					}
					
					cat c1=new cat(Name,W, A);
					
					output.setText(c1.onlyName());
				}else if(name.getText().equals("")||weight.getText().equals("")) {	
					int D=(int)dry2.getValue();
					int C=(int)can2.getValue();
					int B=(int)bag2.getValue();
					cat c1=new cat(D, C, B);
					output.setText(c1.onlyBuy());
				
				}else {
				String Name=name.getText();
				double W=Double.parseDouble(weight.getText());
				int D=(int)dry2.getValue();
				int C=(int)can2.getValue();
				int B=(int)bag2.getValue();
				
				
				double A=0;
				if(kCat.isSelected()||pCat.isSelected()){
					A=2;
				}else if(aCat.isSelected()){
					A=1;
				}else if(oCat.isSelected()){
					A=1.4;
				}
				
				cat c1=new cat(Name,W, A, D, C, B);
				
				output.setText(c1.output());
			}}
		});
		btnNewButton.setBounds(248, 10, 69, 29);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重來!");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				weight.setText("");
				output.setText("");
				dry2.setValue(0);
				can2.setValue(0);
				bag2.setValue(0);
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btnNewButton_1.setBounds(335, 10, 69, 29);
		panel_3.add(btnNewButton_1);
	}
}
