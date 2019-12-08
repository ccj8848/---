package ccj;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;

public class Main extends JFrame implements ActionListener{

    private JPanel Pane;
    private JTextField TX1,TX2,TX3;
    private JRadioButton rb1,rb2;
    private JCheckBox jc1,jc2,jc3;
    private JComboBox<String>box1,box2,box3;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    Main frame=new Main();     
                    frame.setVisible(true);                                 
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
      Main frame=new Main();
     frame.setVisible(true);
    }

    public Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        setSize(850,400);                                   
        setLocationRelativeTo(null);                        
        Pane=new JPanel();                           
        Pane.setBorder(new EmptyBorder(2, 2, 5, 5));
        Pane.setLayout(new BorderLayout(0, 0));      
        setContentPane(Pane);
        JPanel panel=new JPanel(new GridLayout(2, 7,5,10)); 
        panel.setBorder(new TitledBorder(null,"",TitledBorder.LEADING ,TitledBorder.TOP,null,null));
        Pane.add(panel,BorderLayout.CENTER);          
        JPanel panel1=new JPanel();
        panel.add(panel1);
        JLabel label=new JLabel("姓名");
        panel1.add(label);
        TX1=new JTextField();
        panel1.add(TX1);
        TX1.setColumns(10);
        JLabel label_2=new JLabel("学号");
        panel1.add(label_2);
        TX2=new JTextField();
        TX2.setColumns(10);
        panel1.add(TX2);
        rb1=new JRadioButton("男");
        panel1.add(rb1);
        rb1.setSelected(true);                               
        rb2=new JRadioButton("女");
        panel1.add(rb2);
        ButtonGroup bts=new ButtonGroup();                  
        bts.add(rb1);
        bts.add(rb2);
        JPanel panel2=new JPanel();
        panel.add(panel2);
        jc1=new JCheckBox("计算机网路");
        panel2.add(jc1);
        box1=new JComboBox<String >();
        box1.setModel(new DefaultComboBoxModel<String>(new String[]{"玛丽","马力","马丽"}));
        panel2.add(box1);
        JPanel panel_3=new JPanel();
        jc2=new JCheckBox("体育");
        panel2.add(jc2);
        box2=new JComboBox<String >();
        box2.setModel(new DefaultComboBoxModel<String >(new String[]{"Piter","皮特"}));
        panel2.add(box2);
        jc3=new JCheckBox("c");
        panel2.add(jc3);
        box3=new JComboBox<String >();
        box3.setModel(new DefaultComboBoxModel<String>(new String[]{"哈利","哈里"}));
        panel2.add(box3);
        JPanel panel3=new JPanel();
        panel.add(panel3);
        JButton jbOk=new JButton("确定");
        panel3.add(jbOk);
        jbOk.addActionListener(this);
        JButton jbRest=new JButton("重填");
        panel3.add(jbRest);
        JButton jbRst=new JButton("退课");
        panel3.add(jbRst);
        JPanel panel4=new JPanel();
        panel.add(panel4);
        JLabel labe=new JLabel("选课信息");
        labe.setHorizontalAlignment(SwingConstants.LEFT);
        panel4.add(labe);
        TX3=new JTextField();
        TX3.setColumns(30);
        panel4.add(TX3);

        jbOk.addActionListener(new ActionListener() {           
            public void actionPerformed(ActionEvent e) {
                StringBuilder info=new StringBuilder();
                String name=TX1.getText();
                String num=TX2.getText();
                String sex;
                if(rb1.isSelected()){
                    sex="男";
                }else {
                    sex="女";
                }
                info.append("所选课程");
                if(jc1.isSelected()){
                    String c=jc1.getText();
                    String t=box1.getSelectedItem().toString();
                    info.append(":"+c+"\n授课老师："+t+"\n");
                }
                if(jc2.isSelected()){
                    String c=jc2.getText();
                    String t=box2.getSelectedItem().toString();
                    info.append(","+c+"\n授课老师："+t+"\n");
                }
                if(jc3.isSelected()){
                    String c=jc3.getText();
                    String t=box3.getSelectedItem().toString();
                    info.append(","+c+"\n授课老师："+t);
                }
                TX3.setText(name+sex+num+info.toString());                 
            }
        });

	        jbRest.addActionListener(new ActionListener() {
	
	            public void actionPerformed(ActionEvent e) {
	
	                TX1.setText("");
	                TX2.setText("");
	                rb1.setSelected(true);
	                jc1.setSelected(false);
	                box1.setSelectedIndex(0);
	                jc2.setSelected(false);
	                box2.setSelectedIndex(0);
	                TX3.setText("");
	            }
	        });
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		File a = new File("e:\\work.txt");  
        try {  
            a.createNewFile(); 
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
  
        String str = TX3.getText();  
        byte bt[] = new byte[1024];  
        bt = str.getBytes();  
        try {  
            FileOutputStream in = new FileOutputStream(a);  
            try {  
                in.write(bt, 0, bt.length);  
                in.close();  
            } catch (IOException e1) {  
                e1.printStackTrace();  
            }  
        } catch (FileNotFoundException e1) {  
            e1.printStackTrace();  
        }  
        try {  
            FileInputStream out = new FileInputStream(a);  
            InputStreamReader isr = new InputStreamReader(out);  
            int ch = 0;  
            while ((ch = isr.read()) != -1) {  
                System.out.print((char) ch);  
            }  
        } catch (Exception e1) {  
        }  
    }  
		
	}


