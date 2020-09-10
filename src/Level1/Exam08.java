/*
	2020.09.10
	written by hongkyoung Kim
	language) java	
	
	Exam08) 문자열 다루기 기본
	
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
*/

package Level1;

public class Exam08
{
    public boolean solution(String s) 
    {
        boolean answer = true;
        
        if(s.length()!=4 && s.length()!=6)
        	answer = false;
        
        
        for(int i=0; i<s.length(); i++)
        {
        	if(s.charAt(i)<'0'||s.charAt(i)>'9')
        		answer = false;
        }
        	
        
        return answer;
    }

	public static void main(String[] args)
	{
		Exam08 obj = new Exam08();
		
		System.out.println(obj.solution("1234"));

	}

	
	// 다른 풀이01
	/*
	public boolean solution(String s) 
	{
		if(s.length() == 4 || s.length() == 6)
		{
			try
			{
				int x = Integer.parseInt(s);
				return true;
			} 
			catch(NumberFormatException e)
			{
				return false;
			}
		}
		else return false;
	}
	*/
	
	// 다른 풀이02
	/*
	public boolean solution(String s) 
	{
		return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
	}
	*/
}
