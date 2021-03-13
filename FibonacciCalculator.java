import java.util.*;
public class FibonacciCalculator {
	
	
	public int calculate(int index) {
        int t1 = 0,t2=1,sum=0;
        
			System.out.print("Fibonacci values " + index + ": ");
			while (t1 <= index)
			{
				
				if (t1==0)
				System.out.print(t1 + ", ");
				sum = t1 + t2;
				t1 = t2;
				t2 = sum;
				
				System.out.print(t1 + ", ");

				//if (index == 0 || index == 1) {
				//return 1;
                //}

         
			}
		return t2;	

    }
	
	
	
    public static void main(String[] args) {


        FibonacciCalculator fibcal = new FibonacciCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int index= Integer.parseInt(sc.nextLine());
		fibcal.calculate(index);
    }
}