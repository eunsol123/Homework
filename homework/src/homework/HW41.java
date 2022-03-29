package homework;

import java.util.*;

public class HW41 {

/*
 여행가 A는 N * N 크기의 정사각형 공간위에 서 있다. 이 공간은 1 * 1 크기의 정사각형으로 나누어져 있다.
 가정 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당한다.
 여행가 A는 상,하,좌,우 방향으로 이동할 수 있으며,시작 좌표는 항상 (1,1)이다.
 우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여 있다. 
 계획서에는 하나의 줄에 띄어쓰기를 기준으로 하여 L,R,U,D 중 하나의 문자가 반복적으로 적혀 있다.
 각 문자의 의미는 다음과 같다. 
 
 L : 왼쪽으로 한 칸 이동 
 R : 오른쪽으로 한 칸 이동
 U : 위로 한 칸 이동 
 D : 아래로 한 칸 이동
 
 이 때 여행가 A가 N*N 크기의 정사각형 공간을 벗어나는 움직임은 무시된다.
 예를 들어, (1,1)의 위치에서 L혹은 U를 만나면 무시된다.
  
입력 조건 : 첫째 줄에 공간의 크기를 나타내는 N이 주어진다(1<=N <=100)
둘째 줄에 여행가 A가 이동할 계획서 내용이 주어진다 (1<=이동횟수<=100)

출력 조건 : 첫째 줄에 여행가 A가 최종적으로 도착할 지점의 좌표(X,Y)를 공백으로 구분하여 출력한다.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N값 입력 받기
		int n = sc.nextInt(); 
		sc.nextLine(); // 버퍼 비우기
		
		// 공백을 통해 여행가 A가 이동할 계획서 내용을 입력 받기
		String[] plans = sc.nextLine().split(" "); //# R R R U D D
		int x = 1, y = 1; // 시작좌표 (1,1)
		
		// 'L', 'R', 'U', 'D' 의 각 방향별로 이동될 거리
		int[] gox = {0, 0, -1, 1}; // X좌표
		int[] goy = {-1, 1, 0, 0}; // Y좌표
		char[] moveTypes = {'L', 'R', 'U', 'D'};
		
		// 이동 계획을 하나씩 확인
		for (int i = 0; i < plans.length; i++) {
		char plan = plans[i].charAt(0);
		
		// 이동 후 좌표 구하기
		int nx = -1, ny = -1;
		for (int j = 0; j < 4; j++) {
		if (plan == moveTypes[j]) {
		nx = x + gox[j];
		ny = y + goy[j];
			}
		}
		
		// 공간을 벗어나는 경우 무시
		if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
		
		// 이동 수행
		x = nx;
		y = ny;
		}
		
		// 출력
		System.out.println(x + " " + y);
		
	}

}
