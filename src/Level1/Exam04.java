/*
	2020.09.09
	written by hongkyoung Kim
	language) java	
	
	Exam04) 서울에서 김서방 찾기
	
	String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 
	김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. 
	seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
*/

package Level1;

public class Exam04
{
    public String solution(String[] seoul) 
    {
        String answer = "";
        
        String kim = "Kim";
        
        for(int i=0; i<=seoul.length; i++)
        {
            if(seoul[i].equals(kim))
            {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	String[] s = {"Kim", "Ahn", "Kwon"};
    	
    	Exam04 obj = new Exam04();
    	
    	System.out.println(obj.solution(s));
    }
}
