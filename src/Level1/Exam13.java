/* 
	2020.09.17
	written by hongkyoung Kim
	language) java	
	
	Exam13) 핸드폰 번호 가리기
	
	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 
	전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
*/

package Level1;

public class Exam13
{
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split(""); // 매개변수 번호를 하나씩 나눈다.
        //answer = Integer.toString(phone_number.length());
        
        for(int i=0; i<arr.length-4; i++) // arr에서 뒷 4자리를 제외한 나머지 
        	arr[i] = "*"; // 핸드폰 번호를 각각 *로 바꾼다.
        	
        for(int j=0; j<arr.length; j++) // 바뀐 전화번호 배열을
        	answer += arr[j]; // answer 에 붙여넣기 한다.
        
        return answer; // 붙여넣기한 answer 문자열을 return 한다.
    }
    
    public static void main(String[] args) {
    	Exam13 obj = new Exam13();
    	
    	System.out.println(obj.solution("01028077759"));
    }
    
    // 다른 풀이01
    // 정규식으로 풀기
    /*
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
    */
    
    // 다른 풀이02
    // substring 함수
    /*
    public String solution(String phone_number) {
        String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++)
			answer += "*";

		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
    }
    */
    
    // 다른 풀이03
    /*
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
     */
}

