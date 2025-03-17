package Ch00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
//        int n = Integer.parseInt(br.readLine());
        
        
        StringTokenizer st ;
        
        int i = 0;
		while(i>=0) {
        	i++;
        	st = new StringTokenizer(br.readLine(), " ");
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	
        	bw.write((A+B)+"\n");
        	
        	if(A==0 && B==0) {
        		break;
        	}
        }
		br.close();
		bw.close();
        
        
        
    }
}

