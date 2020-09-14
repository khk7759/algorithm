/*
	※ go lang의 경우 for이나 if 등과 같은 문법을 사용하고 
	{}를 개행하게 되면 개별적인 문장이라 생각하여 진행하려고 한다.
	근데 그렇게 되면 오류가 생김... 
	그러니까 미래를 대비한 습관을 들이기 위해 이제 개행을 하지 않기로 한다...
	 
	2020.09.14
	written by hongkyoung Kim
	language) java	
	
	Exam10) 124 나라의 숫자
	
	124 나라가 있습니다. 
	124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
	
	1. 124 나라에는 자연수만 존재합니다.
	2. 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
	
	자연수 n이 매개변수로 주어질 때, 
	n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.
*/

package Level1;

public class Exam10
{
    public String solution(int n) 
    {
        String answer = "";
        
        
        return answer; 
    }	
	
	public static void main(String[] main)
	{
		Exam10 obj = new Exam10();
		
		System.out.println(obj.solution(6));
	}
	/*
	// 내 코드) 프로그래머스상 효율성 실패 코드...
    public String solution(int n) // n이 6
    {
        String answer = "";
        
        int world; // 124 나라의 숫자 변수
        
        while(n>0) { // n이 0보다 작을 때까지 반복문 돌리기! n = 6, n = 1
        	
        	world = n%3; // world는 0, world = 1
        	n = n/3; // n은 2, n = 0
        	
        	if(world==0) { // 0이니까
        		n-=1; // n은 1
        		world=4; // world는 4
        	}
        	
        	answer = world + answer; // answer는 4 // 1 + 4 -> 14
        }
        
        return answer; // 14 출력
    }	
	
	public static void main(String[] main)
	{
		Exam10 obj = new Exam10();
		
		System.out.println(obj.solution(6));
	}
	*/
}
