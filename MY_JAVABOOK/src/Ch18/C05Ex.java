package Ch18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI extends JFrame{
	GUI(String title){
		
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
		JButton btn1 = new JButton("파일로저장");
		btn1.setBounds(290,20,175,60);
		JButton btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(290,100,175,60);
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(290,180,175,60);
		JButton input = new JButton("입력");
		input.setBounds(290,540,175,40);
		
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
}

public class C05Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Component 참조변수명
		//textarea = area1
		//textarea's scroll = scroll1
		//파일로저장 : btn1
		//1:1요청 : btn2
		//대화기록보기 : btn3
		//입력 : input
		//textfield : txt1
		
		new GUI("Chatting Server");
		
	}

}
