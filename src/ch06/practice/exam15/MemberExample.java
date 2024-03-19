package ch06.practice.exam15;

public class MemberExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.login("hong","12345");
		memberService.logout("hong");
	}

}
