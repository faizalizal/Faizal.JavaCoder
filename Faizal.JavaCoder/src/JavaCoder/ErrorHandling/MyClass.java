package JavaCoder.ErrorHandling;

import java.util.Arrays;


public class MyClass {
	public void index(){
		String[] data = new String[3];
		System.out.print("Isi Array : ");
		data[0] = "Hallo";
		data[1] = "World";
		data[2] = "Xsis";
		try {
			data[3] = "Mitra";
			data[4] = "Utama";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(data));
		
	}
	public static void main(String[] args) {
		MyClass a = new MyClass();
		a.index();
	}
}
