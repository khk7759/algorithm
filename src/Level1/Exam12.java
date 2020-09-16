/* 
	2020.09.17
	written by hongkyoung Kim
	language) java	
	
	Exam12) 짝수와 홀수
	
	정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
*/

package Level1;

public class Exam12
{
    public String solution(int num) {
        String answer = "";
        
        answer = num%2==0 ? "Even" : "Odd";
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Exam12 obj = new Exam12();
    	
    	System.out.println(obj.solution(3));
    }
}
