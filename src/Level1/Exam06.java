/*
	2020.09.09
	written by hongkyoung Kim
	language) java	
	
	Exam06) 2016
	
	2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
	두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
	요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 
	예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
*/

package Level1;

public class Exam06
{
    public String solution(int a, int b) 
    {
        String answer = "";
        
        int totalDay = 0;
        int dateNum = 0;

        String[] yoil = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i=1; i<a; i++)
            totalDay += month[i-1];
        
        dateNum = totalDay + b;
        
        answer = yoil[dateNum%7];

        return answer;
    }
    
    public static void main(String[] args)
    {
    	Exam06 obj = new Exam06();
    	
    	System.out.println(obj.solution(1, 1));
    }
}
