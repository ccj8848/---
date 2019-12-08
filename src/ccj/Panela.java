package ccj;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Panall extends Panel implements ActionListener {

	JLabel lb1 = new JLabel("请输入您的姓名：");
	JTextField txt1 = new JTextField(25);
	JLabel lb2 = new JLabel("请输入您的密码：");
	JPasswordField txt2 = new JPasswordField(25);

	Panall() {
		Panel p = new Panel();
		JFrame f = new JFrame("学生选课系统");
		f.add(p);
		f.setSize(350, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.add(lb1);
		f.add(txt1);
		f.add(lb2);
		f.add(txt2);
		JButton bn1 = new JButton("确定");
		f.add(bn1);
		bn1.addActionListener(this);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String user = new String();
		String passworld = new String();
		user = txt1.toString();
		passworld = txt2.toString();
		if (txt1.getText().equals("c") && txt2.getText().equals("1")) {
			Main windtow=new Main();
			windtow.setVisible(true);
		} else {
			System.out.print("您输入的密码错误");
		}
	}

}

public class Panela {
	public static void main(String[] args) {
		new Panall();
	}
}