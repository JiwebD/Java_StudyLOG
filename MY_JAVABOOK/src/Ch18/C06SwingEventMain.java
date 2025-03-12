package Ch18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C06GUI extends JFrame implements ActionListener{
	JButton btn1;		
	JButton btn2;
	JButton btn3;
	JButton input;
	
	C06GUI(String title){
		
		//Frame
		super(title);
		setBounds(100,100,500,670);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//Component
		//textarea
		JTextArea area1 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(20,20,250,500);
		//textfield
		JTextField txt1 = new JTextField();
		txt1.setBounds(20,540,250,40);
		//button
		btn1 = new JButton("파일로저장");
		btn1.setBounds(290,20,175,60);
		
		btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(290,100,175,60);
		
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(290,180,175,60);
		
		input = new JButton("입력");
		input.setBounds(290,540,175,40);
		
		//event listener add
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		
		//Panel(Component)
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		//Frame(panel)
		add(panel);
		
		//Frame
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭!");
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장 클릭");
		}
		else if(e.getSource()==btn2) {
			System.out.println("1:1요청 클릭");
		}
		else if(e.getSource()==btn3) {
			System.out.println("대화기록보기");
		}
		else if(e.getSource()==input) {
			System.out.println("입력");
		}
		
	}
	
}

public class C06SwingEventMain {

	public static void main(String[] args) {
		
		new C06GUI("Chatting UI");
		
		
	}

}
