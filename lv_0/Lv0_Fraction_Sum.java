package code_test;

public class Lv0_Fraction_Sum {
	
	/* 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 
	 * 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다. 
	 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 
	 * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int denum3 = (denum1 * num2) + (denum2 * num1);
        int num3 = num1 * num2;
        int factor = 0;
        
        for(int i = 1; i <= num3; i ++){
            if(num3 % i == 0 && denum3 % i == 0){
                factor = i;
            }
        }
        
        answer[0] = denum3 / factor;
        answer[1] = num3 / factor;
        
        return answer;
    }

}
