package member;

import java.util.Scanner;

import member.model.Member;

public class Member_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("회원 수 > ");
		int co = sc.nextInt();

		Member[] reg = new Member[co];

		boolean run = true;
		while (run) {
			System.out.println("==========코리아아이티 그룹웨어===========");
			System.out.println("1.회원가입 2.회원목록 3.종료");
			System.out.println("-----------------------------------------");
			System.out.print("Enter your Choice Number > ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("회원가입");
				for (int i = 0; i < reg.length; i++) {
					reg[i] = new Member();

					System.out.print("아이디 입력 > ");
					String uid = sc.next();
					reg[i].setUserid(uid);

					System.out.print("비밀번호 입력 > ");
					String pwd = sc.next();
					reg[i].setPasswd(pwd);

					System.out.print("이름 입력 > ");
					String n = sc.next();
					reg[i].setUname(n);

					System.out.print("나이 입력 > ");
					int a = sc.nextInt();
					reg[i].setAge(a);

					System.out.print("급여 입력 > ");
					double s = sc.nextDouble();
					reg[i].setSalary(s);
					System.out.println();
				}
				System.out.println();
				break;
			case 2:
				System.out.println("회원목록");
				System.out.println("====회원목록을 출력합니다.====");
				for (Member r : reg) {
					System.out.println(r.disp());
				}
				System.out.println();
				break;
			default:
				System.out.println("종료");
				System.exit(0);
			}
		}
	}
}
