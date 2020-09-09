/*
	2020.09.09
	written by hongkyoung Kim
	language) java	
	
	Exam02) 약수의 합
	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
*/

package Level1;

public class Exam02
{
    public int solution(int n) 
    {
        int answer = 0;
        
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                answer+=i;
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	Exam02 obj = new Exam02();
    	
    	int answer = obj.solution(5);
    	
    	System.out.println(answer);
    }
}
