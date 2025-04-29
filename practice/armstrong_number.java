package practice;

public class armstrong_number {

	public static void main(String[] args) {
            int num=153;
            int temp=num;
            int r=0;
            int sum=0;
            while(num>0)
            {
            	r=num%10;
            	num=num/10;
            	sum=sum+r*r*r;
            }
            if(temp==sum)
            {
            	System.out.println("armstrong");
            }
            else
            {
            	System.out.println("not armstrong");
            }
	}

}
