/*
	2020.09.09
	written by hongkyoung Kim
	language) java	
	
	Exam05) 두 정수 사이의 합
	
	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
*/

package Level1;

public class Exam05
{
	public long solution(int a, int b)
	{
		long answer = 0;
		
		
		if(a<=b)
		{
			for(int i=a; i<=b; i++)
				answer += i;
		}
		else
		{
			for(int i=b; i<=a; i++)
				answer += i;
		}
		
		return answer;
	}
	
	public static void main(String[] args)
	{
		Exam05 obj = new Exam05();
		
		System.out.println(obj.solution(1,100));
	}
	
	// 다른 풀이01
	/*
    public long solution(int a, int b) 
    {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) 
    {
        return (b - a + 1) * (a + b) / 2;
    }
    */
	
	// 다른 풀이02
	/*
	public long solution(int a, int b) 
	{
		long answer = 0;
		for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
			answer += i;
	
		return answer;
	}
	*/
}
