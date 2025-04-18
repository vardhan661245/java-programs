package practice;
interface sbi
{
	public void deposit();
	public void withdraw();
}
interface bank
{
	public void registered();
	public void amount();
}

public class abstraction implements sbi,bank 
{

	

	@Override
	public void registered() {
       System.out.println("the registration success");		
	}

	@Override
	public void amount() {
System.out.println("10,000");		
	}

	@Override
	public void deposit() {
          System.out.println("5,000 was deposited");		
	}

	@Override
	public void withdraw() {
System.out.println("withdraw");		
	}
	public static void main(String[] args) {
      abstraction a =new abstraction();
      a.amount();
      a.deposit();
      a.registered();
      a.withdraw();
	}

}
