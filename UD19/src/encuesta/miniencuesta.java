package encuesta;

import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;

import javax.swing.*;

public class miniencuesta extends JFrame {

	public miniencuesta() {
		setSize(330, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 1));
		ButtonGroup btGroup = new ButtonGroup();
		JRadioButton rd1 = new JRadioButton ("Windows",true);
		rd1.setActionCommand("Windows");
		JRadioButton rd2 = new JRadioButton ("Linux",false);
		rd2.setActionCommand("Linux");
		JRadioButton rd3 = new JRadioButton ("Mac",false);
		rd3.setActionCommand("Mac");
		btGroup.add(rd1);
		btGroup.add(rd2);
		btGroup.add(rd3);
		p1.add(rd1);
		p1.add(rd2);
		p1.add(rd3);
		global.add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 1));
		JCheckBox c1 = new JCheckBox("Programador");
		c1.setName("Programador");
		JCheckBox c2 = new JCheckBox("Diseno grafico");
		c2.setName("Diseno grafico");
		JCheckBox c3 = new JCheckBox("Administracion");
		c3.setName("Administracion");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		global.add(p2,BorderLayout.CENTER);
		
		
		JPanel p3 = new JPanel();
		JSlider s1 = new JSlider();
		s1.setMinorTickSpacing(10);
		s1.setPaintTicks(true);
		s1.setPaintLabels(true);

		Hashtable position = new Hashtable();
		position.put(0, new JLabel("0"));
		position.put(10, new JLabel("1"));
		position.put(20, new JLabel("2"));
		position.put(30, new JLabel("3"));
		position.put(40, new JLabel("4"));
		position.put(50, new JLabel("5"));
		position.put(60, new JLabel("6"));
		position.put(70, new JLabel("7"));
		position.put(80, new JLabel("8"));
		position.put(90, new JLabel("9"));
		position.put(100, new JLabel("10"));
		s1.setLabelTable(position);
		JButton b1 = new JButton("Enviar");
		p3.add(s1);
		global.add(p3,BorderLayout.SOUTH);
		cp.add(b1,BorderLayout.SOUTH);
		cp.add(global,BorderLayout.CENTER);
		
		
		
		ActionListener a1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String radioValue = btGroup.getSelection().getActionCommand();
				String checkValue = " ";
				if(c1.isSelected()) {
					 checkValue += c1.getName() + " ";
				}
				if(c2.isSelected()) {
					checkValue += c2.getName() + " ";
				}
				if(c3.isSelected()) {
					checkValue += c3.getName() + " ";
				}
				int slideValue = s1.getValue()/10;
				String result = "Sistema Operativo:" + radioValue + " Especialidad:" + checkValue + " Horas:" + slideValue ;
				JOptionPane.showMessageDialog(null, result);
				
				
			}
				
		};
		
		b1.addActionListener(a1);
		
		
	}
	
	
	
	

}