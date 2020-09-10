/*
	2020.09.09
	written by hongkyoung Kim
	language) java	
	
	Exam07) 가운데 글자 가져오기
	
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
*/

package Level1;

public class Exam07
{
    public String solution(String s) 
    {
        String answer = "";
        
        if(s.length()%2==0)
        {
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        else
        {
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }
        
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	Exam07 obj = new Exam07();
    	System.out.println(obj.solution("helooo"));
    }
    
    // 다른 풀이01
    /*
    String getMiddle(String word)
    {
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
    */
    
    // 다른 풀이02
    /*
    String getMiddle(String word)
    {
    	return word != null ? word.substring((word.length()-1)/2,(word.length()+2)/2) : "";
    }
    */
}
