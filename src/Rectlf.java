//R4_2
//準備
/*
public class Rectlf extends MyFrame2{
	public void run() {
		int x=30;
		setColor(0,128,0);
		int i;
		for(i=0; i<9; i++) {
			if(i==4) {
				fillRect(x,100,10,100);
			} else {
				fillRect(x,80,10,100);
			}
			x+=20;
		}
	}
}
*/

public class Rectlf extends MyFrame2{
	public void run() {
		int x=30;
		setColor(0,128,0);
		int i;
		for(i=0; i<10; i++) {
			if(i%2==0) {
				fillRect(x,100,10,100);
			} else {
				fillRect(x,80,10,100);
			}
			x+=20;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new Rectlf();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}