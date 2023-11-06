package freshwork_interview;

import java.util.Scanner;

public class MakeStringAsAnValidPalindrome {

	
	  public static void main(String args[])
	  {
	    Scanner sc = new Scanner(System.in);
		  String a = sc.nextLine();
		  String ans = convertToPalindrome(a);
	    System.out.println(ans);
	  }
		
		public static String convertToPalindrome(String a){
		
			char let  = a.charAt(a.length()-1);
			int index = a.indexOf(let);
			String ans = "";
			
			for(int i=a.length()-1;i>=0;i--){
				if(i<index){
			ans=ans+a.charAt(i)+"";
				}
			}
		return ans;
		
		}
	
}


class Palindrome
{
    public static char[] append(String s)
    {
        int l =s.length();
        int j=l-1,count=0;
        for(int i =0;i<l;i++)
        {
            while(s.charAt(i)!=s.charAt(j))
            {
                i++;
                count++;
            }
            j--;   
        }
        StringBuffer str=new StringBuffer(s.substring(0,count));
        String st=str.toString();
        char[] pali = st.toCharArray();
        return pali;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=append(s);
        for (int i = ch.length-1; i >= 0 ; i--)
        {
            System.out.print(ch[i]);
        }
    }
}


class PalindromeCreater {

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (str == null || "".equals(str.trim()) || str.length() < 1) {
			System.out.println("Invalid Input");
			return;
		}

	
		int index = -1;

		char last = str.charAt(str.length() - 1);

		index = str.lastIndexOf(last, str.length() - 2);

		if (index == -1) {
			index = str.length() - 1;
		} else {
			index = str.lastIndexOf(last, str.length() - 2);

		}
		System.out.println(index);

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}