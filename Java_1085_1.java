/*
한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 x, y, w, h가 주어진다.

첫째 줄에 문제의 정답을 출력한다.
*/

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner i=new Scanner(System.in);
        int x, y, w, h;
        x=i.nextInt();
        y=i.nextInt();
        w=i.nextInt();
        h=i.nextInt();
        
        int one, two, result=x;
        one=w-x;
        two=h-y;
        
        int a[]={x, y, one, two};
        
        for(int k=0;k<4;k++){
            if(a[k]<result)
                result=a[k];
        }
        
        System.out.println(result);
        
    }
}
