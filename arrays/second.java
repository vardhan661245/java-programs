package arrays;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,4,3,2,4};
		
		int ele=3;
		
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				System.out.println("Elemenst found");
				break;
			}
		}

	}

}
