package javaTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test1 {

	public static void main(String[] args) {
		int a;
		a=1;


		int b;
		b=2;

		int c;


		System.out.println("c="+ a + "+" + b);

		c=a+b;
		System.out.println("c="+ c + "+1");








		        try {
		            FileInputStream is = new FileInputStream("file.txt");
		            InputStreamReader in = new InputStreamReader(is, "SJIS");
		            int ch;
		            while ((ch = in.read()) != -1) {
		                System.out.print(Integer.toHexString(ch) + " ");
		            }
		            in.close();
		        } catch (IOException e) {
		            System.out.println(e);
		        }
		    }






		// TODO 自動生成されたメソッド・スタブ

	}


