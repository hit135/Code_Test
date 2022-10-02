package codetest;

public class lv0 {
	
	// 변수값 뺄셈 함수 solution 만들기
	
	
	public int solution(int num1, int num2) {
			int answer = 0;
			answer = num1 - num2;
			return answer;
		}

	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		lv0 sol = new lv0();
		int c = sol.solution(a,b);
		
		System.out.println(c);
		
		// 함수는 클래스 안에서 만들고
		// 메인은 출력만 하는건가..
		// 처음에 메인 스트링에 함수값을 만들었다가 오류가 났었다.
		// 함수 수업 들을 때 확인 필요!
		
		

	}

}
