import java.util.Scanner;

// 문제파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// (0 < A, B < 10)

// 유추파악
// A와 B를 Scanner를 사용하여 입력받은다음 계산한 값에서 3을 뺀다

// 주요 단어 영문이름 선정
// input_A : 입력 A
// input_b : 입력 B
// sum : 더한 결과값

// 테스트케이스
// 예제 입력 1 
// 5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2
// 예제 출력 1 
// 2
// 5
// 7
// 17
// 7

// 프로그래밍 순서
// 입력 - 처리 - 출력




public class AplusBminus3{
    public void AplusBminus3Function(){
        Scanner sc = new Scanner(System.in);
        System.out.println("두 숫자를 입력하세요 : ");
        int input_A = sc.nextInt();
        int input_B = sc.nextInt();
        int sum = input_A + input_B;
        System.out.println(sum-3);
    }

    public static void main(String[] args) {
        new AplusBminus3().AplusBminus3Function();
        
    }
}