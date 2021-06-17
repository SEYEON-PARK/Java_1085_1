/*
한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 x, y, w, h가 주어진다.

첫째 줄에 문제의 정답을 출력한다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

public class Main{ // Main 클래스 정의
    public static void main(String [] args){ // main 메소드
        Scanner i=new Scanner(System.in); // 스캐너 i 생성
        int x, y, w, h; // 변수 생성
        x=i.nextInt(); // 사용자로부터 정수 입력받기
        y=i.nextInt(); //
        w=i.nextInt();
        h=i.nextInt();
        
        int one, two, result=x; // 변수 생성 및 초기화
        one=w-x; // one에 w-x 대입
        two=h-y; // two에 h-y 대입
        
        int a[]={x, y, one, two}; // 배열 a에 x, y, one, two 저장
        
        for(int k=0;k<4;k++){ // k가 0부터 4보다 작을 때까지 1씩 증가하며 반복
            if(a[k]<result) // 만약, a[k]가 result보다 작다면
                result=a[k]; // result에 a[k]
        }
        
        System.out.println(result);
        
    }
}
