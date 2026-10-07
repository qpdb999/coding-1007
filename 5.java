import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("문자열을 입력하십시오");
		  
		String a = sc.nextLine();
		
		StringBuffer b = new StringBuffer(a); //a을 String메소드를 적용해 b에 저장
		
		System.out.println(b + "을(를) 뒤집으면 " + b.reverse() + "입니다.");
		
		
		System.out.println("문자열을 입력하십시오");
		
		String str = sc.nextLine();
		
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오");
		
		int num = sc.nextInt();
		
		StringBuffer b = new StringBuffer(str);
		
		System.out.println(b.insert(num, "a") + "(이)가 되었습니다");
		
		System.out.println("정수를 2개 입력하십시오");
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = Math.min(num, num2);	//static 메서드
		
		System.out.println(num + "와(과)" + num2 + "중 작은 쪽은 " + a + "입니다");*/
		
		//도제 시험 유출 구구단 가로세로줄 /t 사용

        System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 9) {
    		for (int i = 1; i <= 9; i++) {
       		 System.out.print(num * i + "\t");
    }
		} else {
    		System.out.println("잘못 입력되었습니다");
		}
		
		
		//도제 시험 유출 계산기 기능

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("연산자를 입력하세요 (1: +, 2: -, 3: *, 4: /): ");
        int op = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if (op == 1) {
            System.out.println("결과: " + (num1 + num2));
        }
        else if (op == 2) {
            System.out.println("결과: " + (num1 - num2));
        }
        else if (op == 3) {
            System.out.println("결과: " + (num1 * num2));
        }
        else if (op == 4) {
            System.out.println("결과: " + (num1 / num2));
        }
        else {
            System.out.println("잘못 입력되었습니다");
        }
    }
}