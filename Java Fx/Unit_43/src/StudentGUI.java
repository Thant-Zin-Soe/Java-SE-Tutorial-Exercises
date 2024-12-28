import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class StudentGUI extends JFrame implements ActionListener
{
	JTextField txtName,txtMark;
	JLabel lblName,lblMark;
	JButton btnInsert,btnShow;
	StudentArray arr=new StudentArray(20);
	StudentGUI()
	{
		JPanel p=new JPanel();
		JPanel pMain=new JPanel();
		p.setLayout(new GridLayout(3,2));
		lblName=new JLabel("student's name");
		lblMark=new JLabel("Mark");
		txtName=new JTextField(20);
		txtMark=new JTextField(20);
		btnInsert=new JButton("INSERT");
		btnShow=new JButton("SHOW");
		btnInsert.addActionListener(this);
		btnShow.addActionListener(this);
		p.add(lblName);p.add(txtName);
		p.add(lblMark);p.add(txtMark);
		p.add(btnInsert);p.add(btnShow);
		pMain.add(p);
		this.add(pMain);
		//this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnInsert)
		{
			String name=txtName.getText();
			int mark=Integer.parseInt(txtMark.getText());
			arr.insert(name,mark);
			txtName.setText("");
			txtMark.setText("");
			txtName.requestFocusInWindow();
		}
		else
		{
			String info="";
			for(int i=0;i<arr.getSize();i++)
			{
				String n=arr.getName(i);
				int m=arr.getMark(i);
				info+=n + "---" + m + "\n";
			}
			JOptionPane.showMessageDialog(null,info);
		}
	}
	public static void main(String[]args)
	{
		new StudentGUI();
	}
}