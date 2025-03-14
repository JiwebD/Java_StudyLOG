package Ch19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C10JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// jsoup 라이브러리
		// 	  maven repository검색 jsoup 검색 -> 젤 위에꺼 들어가기 -> files칸에 jar다운로드 
		//	  자바에서 쓸 수 있는 라이브러리모음사이트
		//	프로젝트 안에 다운받은 jsoup 넣어주면 Add JAL... (내부에있는거 추가)
		//	프로젝트 밖에 있는거 추가할려면 Add External JAL... (외부에있는거 추가)
		//	my_javabook우클릭 프로퍼티스 -> 라이브러리 -> class path누르고 add해주기.
		
		
		//URL 연결
		Connection conn = Jsoup.connect("https://www.op.gg/champions");
		
		//DOM객체 받기
		Document document = conn.get();
//		System.out.println(document);
		
		Elements elements = document.getElementsByTag("img");
//		System.out.println(elements);
		
		for(Element el : elements) {
			
			try {
//			System.out.println(el);
			String img_url = el.getElementsByAttribute("src").attr("src");
			System.out.println(img_url);
			
			URL url = (new URI(img_url)).toURL();
			InputStream in = url.openStream();
			BufferedInputStream buffIn = new BufferedInputStream(in);	// 버퍼 공간 추가
			
			OutputStream out = null;
			
			if(img_url.contains(".png"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".png");
			else if(img_url.contains(".svg"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".svg");
			else if(img_url.contains(".webp"))
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".webp");
			else
				out = new FileOutputStream("C:\\IOTEST\\"+UUID.randomUUID()+".jpg");
			
			
			while(true) {
				int data = buffIn.read();
				if(data==-1)
					break;
				out.write((byte)data);
				out.flush();
			}
			out.close();
			buffIn.close();
			in.close();
			} catch (Exception e) {
				
			}
			
		}
	}

}
