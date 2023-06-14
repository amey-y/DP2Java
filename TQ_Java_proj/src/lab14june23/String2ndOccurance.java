package lab14june23;

public class String2ndOccurance {
	
	public static void main(String[] args) {
		String s = "java programming";
		
		System.out.println("By using method: ");
		System.out.println(s.indexOf('a', (s.indexOf('a'))+1));
		
		System.out.println("---------------------------------------------");
		
		System.out.println("\nBy using Logic: ");
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a')
			{
				count++;
			}
			if(count == 2)
			{
				System.out.println(i);
				break;
			}
		}
		
	}

}
