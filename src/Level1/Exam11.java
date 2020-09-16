/* 
	2020.09.17
	written by hongkyoung Kim
	language) java	
	
	Exam11) 평균값 구하기
	
	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
*/


package Level1;

public class Exam11
{
    public double solution(int[] arr) 
    {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++)
        	answer += arr[i];
        
        answer /= arr.length;
        
        return answer;
    }
    
	public static void main(String[] args)
	{
		Exam11 obj = new Exam11();
		
		int[] arr = {1, 3, 5, 7, 9};
		
		System.out.println(obj.solution(arr));

	}

}

// 다른 풀이01
// 근데 알고리즘이니 라이브러리 최대한 쓰지말고 푸는게,,, 맞는듯
/*
import java.util.Arrays;

public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
       
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
*/
