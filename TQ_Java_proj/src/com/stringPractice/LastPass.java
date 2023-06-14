package com.stringPractice;

public class LastPass {
//		4dro6 >> 			4 							dro 							6
//				(no. of uppercase symbols) (last 3 chars of pwd in reverse) (sum of all digits in pwd)
	public int uc_counter(String p)
	{
		int uc_count = 0;
//			counting total number of Uppercase characters in the Password string.
			for(int i=0; i<p.length(); i++)
			{
				if(p.charAt(i) >= 'A' && p.charAt(i) <= 'Z')
				{
					uc_count++;
				}
			}
		return uc_count;
	}
	
	public String last3charrev(String p)
	{
		String last3char = "";
//			reversing the last 3 characters of password string.
			for(int j=p.length()-1; j>p.length()-4; j--)
			{
				last3char += p.charAt(j);
			}
		return last3char;
	}
	
	public int digitsSum(String p)
	{
		int sumOfDigits = 0;
//		getting the sum of all the digits in the password string
			for(int k=0; k<p.length(); k++)
			{
				if(p.charAt(k) >= '0' && p.charAt(k) <= '9')
				{
					sumOfDigits += Character.getNumericValue(p.charAt(k)) ;
				}
			}
		return sumOfDigits;
	}
	
	public void lastpass(String []passlist, String hint)
	{
		boolean isCorrect = false;
		for(String p : passlist)
		{
			//			System.out.println(hint +"\nUppercase Count= "+ uc_count +"\nLast 3 char reverse= "+ last3char +"\nSum= "+ sumOfDigits);
//			checking all the conditions
			if(Character.getNumericValue(hint.charAt(0)) == this.uc_counter(p) && hint.substring(1, 4).equals(this.last3charrev(p))
					&& Character.getNumericValue(hint.charAt(4)) == this.digitsSum(p))
			{
				System.out.println("Correct Password is: "+ p);
				isCorrect = true;
				break;
			}
		}
		if(isCorrect == false)
		{
			System.out.println("There is no correct password in the list.");
		}
	}
	
	public static void main(String[] args) {
		
		String passlist[][] = {{"P@ssw0RD1", "20passW0RD20", "PASS6word"},
								{"theBestpassword","myPassword#3"},
								{"MyPassword2", "crazyPassword1#$%"},
								{"luckyPASSWORD#$$$", "luckyDay666"}};
		String hint[] = {"4dro6", "1dro0", "1%$#1", "6pass7"};
		
		LastPass lp = new LastPass();
		for(int i=0; i<passlist.length; i++)
		{
			lp.lastpass(passlist[i], hint[i]);
		}
		
//		[P@ssw0RD1, 20passW0RD20, PASS6word] 4dro6
//		output: PASS6word
//		
//		[theBestpassword, myPassword#3] 1dro0
//		output: theBestpassword
//		
//		[MyPassword2, crazyPassword1#$%] 1%$#1
//		output: crazyPassword1#$%
//		
//		[luckyPASSWORD#$$$, luckyDay666] 6pass7
//		output: 
	}
}
