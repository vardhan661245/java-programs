package practice;

public class encapsulation 
{
     private String name;
     private int acc;

      public void setname(String name)
      {
    	  this.name=name;
      }
      public void setacc(int acc)
      {
    	  this.acc=acc;
      }
      public  String getname()
      {
    	  return name;
      }
      public int getacc()
      {
    	  return acc;
      }

	public static void main(String[] args) 
	{
        encapsulation e=new encapsulation();
        e.setname("vishnu");
        e.setacc(1234);
        System.out.println(e.getname());
        System.out.println(e.getacc());
        
	}

}
