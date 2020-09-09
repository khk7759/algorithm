/*
	주제 : Hash
	2020.09.08
	written by hongkyoung Kim
	language) java
	
	Exam01) 완주하지 못한 선수
	
	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
	단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
	완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
*/

package Level1;

import java.util.Arrays;
import java.util.HashMap;

class Exam01 
{
	// 풀이 01
	// getOrDefault api 활용
    public String solution(String[] participant, String[] completion) 
    {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) 
        {
            if (hm.get(key) != 0)
                answer = key;
        }
        
        return answer;
    }
	// 풀이 02
	/*
    public String solution(String[] participant, String[] completion) 
    {
        String answer = "";
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length)
        {
            if(!completion[i].equals(participant[i]))
            {
                temp = participant[i];
                break;
            }
            else
            {
                i++;
            }
        }
        
        if(!temp.equals(""))
        {
            answer = temp;
        }
        else
        {
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
	*/
    
    public static void main(String[] args)
    {
        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = {"stanko", "ana", "mislav"};
        
        Exam01 obj = new Exam01();
        
        System.out.println(obj.solution(p, c));   	
    }
}
