package codingtest;

public class test {

    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                answer += Character.toUpperCase(s.charAt(i));
            } else {
                answer += s.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       
    	test t = new test();
    	String ss = t.solution("try hello world");
    	System.out.println(ss);
    }
}
