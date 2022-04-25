package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S4_1755 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // M값 입력 받기
		int N = sc.nextInt(); // N값 입력 받기

		String arr[] = new String[N - M + 1]; // 영어로 변환한 배열
		String result[] = new String[N - M + 1]; // 정렬 후 숫자로 다시 변환한 배열
		// 배열 초기화 (Null값 안만들기위해)
		for (int i = 0; i < N - M + 1; i++) {
			arr[i] = "";
			result[i] = "";
		}

		int idx = 0; // 배열 인덱스 초기화
		for (int i = M; i <= N; i++) {

			String temp = i + ""; // 숫자를 String으로 변환 ex) 1-> "1"

			for (int j = 0; j < temp.length(); j++) { // 자리 수 만큼 반복

				char x = temp.charAt(j); // 자리수 하나씩 검사
				switch (x) { // 조건식
				case '0': // 0이라면
					arr[idx] += "zero"; // zero로 바꾸기
					break;
				case '1': // 1이라면
					arr[idx] += "one"; // one으로 바꾸기
					break;
				case '2': // 2라면
					arr[idx] += "two"; // two로 바꾸기
					break;
				case '3': // 3이라면
					arr[idx] += "three"; // three로 바꾸기
					break;
				case '4': // 4라면
					arr[idx] += "four"; // four로 바꾸기
					break;
				case '5': // 5이라면
					arr[idx] += "five"; // five로 바꾸기
					break;
				case '6': // 6이라면
					arr[idx] += "six"; // six로 바꾸기
					break;
				case '7': // 7이라면
					arr[idx] += "seven"; // seven으로 바꾸기
					break;
				case '8': // 8이라면
					arr[idx] += "eight"; // eight으로 바꾸기
					break;
				case '9': // 9라면
					arr[idx] += "nine"; // nine으로 바꾸기
					break;
				default:
					break;
				}

				arr[idx] += " "; // 자리수마다 공백 추가
			}

			idx++; // 인덱스 값 1씩 증가
		}

		Arrays.sort(arr); // 사전순으로 정렬

		for (int i = 0; i < N - M + 1; i++) {

			String temp = arr[i]; // 현재 검사중인 값 담기
			String[] temp2 = temp.split(" "); // 공백에 따라 자리수 나눠서 배열에 저장

			for (int j = 0; j < temp2.length; j++) { // 자리수 만큼 반복
				if (temp2[j].equals("zero"))
					result[i] += 0; // zero면 0으로 변환
				else if (temp2[j].equals("one"))
					result[i] += 1; // one이면 1으로 변환
				else if (temp2[j].equals("two"))
					result[i] += 2; // two이면 2으로 변환
				else if (temp2[j].equals("three"))
					result[i] += 3; // three면 3으로 변환
				else if (temp2[j].equals("four"))
					result[i] += 4; // four이면 4으로 변환
				else if (temp2[j].equals("five"))
					result[i] += 5; // five면 5으로 변환
				else if (temp2[j].equals("six"))
					result[i] += 6; // six면 6으로 변환
				else if (temp2[j].equals("seven"))
					result[i] += 7; // seven이면 7으로 변환
				else if (temp2[j].equals("eight"))
					result[i] += 8; // eight이면 8으로 변환
				else if (temp2[j].equals("nine"))
					result[i] += 9; // nine이면 9으로 변환
			}

		}

		// 조건에 맞게 출력
		for (int i = 0; i < N - M + 1; i++) {
			System.out.print(result[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println(); // 10개 마다 줄바꿈 처리
		}

	}
}
