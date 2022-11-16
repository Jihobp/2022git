package javastudy14_1012;

public class J1012_Finally {

	public static void main(String[] args) {
		//Finally:마침내
		//try catch 구간에서
		//catch 에서 무슨 짓을 하든 간에 finally 부분은 
		//!!!꼭!!!!!!!@#@!#@!#실행한다.
		int a=0, b=0, c=0, d=0;
		try {
			a=10;
			c=a/b;	//숫자는 0으로 나눌 수 없으므로 여기서 튕김.
		} catch (Exception e) {
			System.out.println("잘못됨");
			return;	//프로그램 종료
		}finally {	//데이터 연동시에 많으 쓰임
			//DB 연결하는 과정에서나 쿼리문 날릴 때 예외생기면
			//finally 연결하는 과정에서나 쿼리문 날릴때 예외 생기면
			//그래서 문제 생기면 바로 DB부터 무조건 끊을 수 있도록 한다.
			//catch에 걸려도 이 부분은 무조건!! 실행함.
			System.out.println("이 부분 싨행 안될 수도 잇따.");
		}
		System.out.println("여긴 안됨ㅎ ㅎㅎㅎ ㅎ춥당ㅎㅎㅎㅎㅎ");
		
	}

}
