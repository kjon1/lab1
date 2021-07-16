
public class MethodParams {
	
	public static void main(String[]args) {
		//create a class instance
		MethodParams mp = new MethodParams();
		
		//call your method here
		double d = mp.convertIntToDouble(44);
		
		//print
		System.out.println(d);
		
		//call second method here
		System.out.println(mp.sum(1.0,  2, 3));
		
	}
	
	//create your first method here
	public double convertIntToDouble(int num) {
		return (double)num;
		
	}
	
	//new sum method
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
