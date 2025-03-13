package Ch19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class C07GUI extends JFrame implements ActionListener,KeyListener,MouseListener{
	//button
	JButton btn1;		
	JButton btn2;
	JButton btn3;
	JButton input;
	//txtfield
	JTextField txt1;
	//textArea
	JTextArea area1;
	Writer out = null;
	
	C07GUI(String title){
		
		//Frame
		super(title);
		setBounds(100,100,500,670);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//Component
		//textarea
		area1 = new JTextArea();
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(20,20,250,500);
		//textfield
		txt1 = new JTextField();
		txt1.setBounds(20,540,250,40);
		//button
		btn1 = new JButton("저장하기");
		btn1.setBounds(290,20,175,60);
		
		btn2 = new JButton("불러오기");
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
		txt1.addKeyListener(this);
		area1.addMouseListener(this);
		
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
			System.out.println("저장하기");
			String contents = area1.getText();
			
			//파일탐색기 저장
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("파일 저장 위치를 선택하세요");
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			
			File defaultDirPath = new File("C:\\IOTEST");
			if(defaultDirPath.exists());
				fileChooser.setCurrentDirectory(defaultDirPath);
			
			int selectedVal = fileChooser.showSaveDialog(null);
			System.out.println("selectedVal : " + selectedVal);
			
			if(selectedVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				System.out.println("selectedFile : " + selectedFile);
				
				//파일확장자 추가
				String filePath = selectedFile.toString();
				if(!selectedFile.toString().endsWith(".txt")) {
					filePath = selectedFile.toString()+".txt";
				}
				System.out.println("filePath : " + filePath);
				
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
//			String filename = LocalDateTime.now().format(formatter);
				
				
				try {
					out = new FileWriter(filePath);
					out.write(contents);
					out.flush();
				}catch(Exception el) {
					el.printStackTrace();
				}finally {
					try {out.close();} catch(IOException el) {el.printStackTrace();}
				}
				
			}
			
			
			
			
			
			
		}
		else if(e.getSource()==btn2) {
			System.out.println("불러오기");
			//파일탐색기 열기
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("파일을 선택하세요");
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			
			File defaultDirPath = new File("C:\\IOTEST");
			if(defaultDirPath.exists());
				fileChooser.setCurrentDirectory(defaultDirPath);
			
			int selectedVal = fileChooser.showSaveDialog(null);
			System.out.println("selectedVal : " + selectedVal);
			if(selectedVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				System.out.println("selectedFile : " + selectedFile);
				
				try {
					Reader fin = new FileReader(selectedFile.toString());
					StringBuffer buffer = new StringBuffer();
					while(true) {
						int data = fin.read();
						if(data==-1)
							break;
						buffer.append((char)data);
					}
					area1.setText("");
					area1.append(buffer.toString());
					fin.close();
				}catch(Exception el) {
					el.printStackTrace();
				}
			}
		}
		else if(e.getSource()==btn3) {
			System.out.println("대화기록보기");
		}
		else if(e.getSource()==input) {
			System.out.println("입력");
		}
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped..."+e.getKeyChar());
//		System.out.println("keyTyped..."+e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed..."+e.getKeyChar());
//		System.out.println("keyPressed..."+e.getKeyCode());
		if(e.getSource()==txt1) {
			if(e.getKeyCode()==10) {
				String message = txt1.getText();
				System.out.println(message);
				area1.append(message+"\n");
				txt1.setText("");
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased..."+e.getKeyChar());
//		System.out.println("keyReleased..."+e.getKeyChar());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			
//			System.out.println("mouseClicked..." + e.getPoint());
			int offset = area1.viewToModel(e.getPoint());
//			System.out.println("mouseClicked...offset"+offset);
			
			int row = area1.getLineOfOffset(offset);
//			System.out.println("mouseClicked...row : "+row);
			int startOffset = area1.getLineStartOffset(row);
			int endOffset = area1.getLineEndOffset(row);
//			System.out.printf("%d %n" , startOffset,endOffset);
			String str = area1.getText(startOffset,endOffset-startOffset);
			System.out.println(str);
			
		} catch (BadLocationException el) {
			el.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class C08SwingEventMain {

	public static void main(String[] args) {
		
		new C07GUI("Chatting UI");
		
		
	}

}
