/* 
	2020.09.17
	written by hongkyoung Kim
	language) java	
	
	Exam14) 자릿수 더하기
	
	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
*/

package Level1;

public class Exam14
{
    public int solution(int n) {
        int answer = 0;

        String strN = String.valueOf(n);
        String[] arrN = strN.split("");
        
        for(int i=0; i<arrN.length; i++)
        	answer += Integer.parseInt(arrN[i]);

        return answer;
    }
    
	public static void main(String[] args) {
		
		Exam14 obj = new Exam14();
		
		System.out.println(obj.solution(123));

	}
	
	// 다른 풀이01
	// 타입변환 없이 풀기
	// while true보다는 while문안에 조건으로 n<10을 넣었으니 
	// while 조건을 n>10 조건을 넣는게 좋아요. 
	// 디버깅 및 값 추적할때 while true같은 건 비추입니다. (참고로 n>0해도 해결됩니다)
	/*
	public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        return answer;
    }
    */
	
	// 다른 풀이02
	/*
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
    */
}
