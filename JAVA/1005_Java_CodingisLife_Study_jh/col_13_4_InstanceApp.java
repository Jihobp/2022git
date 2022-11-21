import java.io.FileNotFoundException; //PRintWriter 클래스가 java.io 패키지에 소속되어있고, exception 예외사항 처리도 해준다.
import java.io.IOException;
import java.io.PrintWriter; //PrintWriter 클래스는 java.io 패키지에 소속되어 있는것이다. 
public class col_13_4_InstanceApp {
	//class는 변수들과 메소드의 집합이다. 클래스란 서로 연관된 변수들과 메소드들을 모아서 이름을 붙인 것
	// 검색 질문으로 어떤 클래스를 쓰는지 알고, 그다음 api 다큐멘테이션을 통해 알아내야한다.
	//PrintWriter 클래스 이용.

	//무월 = 생성자, 만월=메소드, 클래스=메소드와 변수의 집합.
	//


	//https://youtu.be/NoXg98bgjT4?list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR
	public static void main(String[] args) throws IOException {
	
		//PrintWriter 클래스 타입, p1은 객체명, 인스턴스는 new PrinterWriter() . 
		//new+생성자는 인스턴스.  생성자는 PrintWriter().
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");	//p1이란 인스턴스에서 write해서 "hello 1 " 넣고
		p1.close();		//p1 작업끝났으면 close 해서 남도 수정할 수 있게함.

		//p1은 변수이자 인스턴스. ?P1이란 변수에  new PrintWriter("result1.txt");
		//클래스를 넣음으로 P1으로 PrintWriter클래스의 매소드 변수 기능을 쉽게 사용해서
//		/아 클래스가 인스턴스화 된다는 것의 의미는 클래스 안에 있는 상속자가 new 라는 명령문으로 변수에 들어 가게 되는 것임. 
		//생성자가 고로 없으면 클래스를 인스턴스화 할 수 없음.
		//생성자가 없으면 일회용. ex)Math. but printWriter 는 다회용.


		//Constructo , instance   **셍성자가 있으면 클래스를 마음껏 복제할수있다.
		// 즉 인스턴스가능하단말= 쉽게말하면  클래스를 펑션화시키는거임.???
		//예를들어 파이 같은 경우는 컨스트럭터가 없어서 인스턴스가 불가능하다. 무한사용이 불가능한말임. 일회용 클래스라는말임

		//instance는 펑션처럼 언제든지 필요할때 사용할 수 있다. 반복해야하는 코드는 instance으로 해서 사용하면 좋다.
		//일회성 코드는 구지instance할 필요가 없다.
		//반복 해야해 p1 = new 반복해야해  (( 반복하기 쉽다 p1.write(“”)하면끝))

		//p1.반복
		//System.out.println("반복안해도됨"); 예를들어 일회용
		//>>System.out.println(Math.PI);  ((반복하려면매우길다 p1 하나로 안끝남)



		//★★★★★★★★★★★★★★★★★
		//클래스는 우리가 선언해둔 폴더, 파일
		//파일을 new + 생성자로 변수에 저장해두면 객체.
		//new + 생성자 = 인스턴스
		//클래스가 메모리 할당되면 객체.  (써야하니까)
		//클래스>객체>인스턴스


		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 1");	
		p2.close();		
		//클래스를 만든사람이 인스턴스로 활용하길 원한다면, 생성자를 가져있고, 
		//new 뒤에 PrintWriter("result2.text")함수가 생성자가 된다 .
		//new를 생성자 앞에 붙이면 걔가 복제되서 instacne 가되고,
		//그 instance에 어떤값이 올수있느냐를 규제하기위해서,
		//앞에 classWriter라는 클래스 이름을 적는다.



		//	1. PrintWritter("result1.txt"); 저장하고 싶은 PrintWitter의 파일이름이 result1.text
		//	2. new PrintWritter("result1.txt") PrintWritter의 복제본, 아바타를 만들고 싶은거, 
		//	p1 = new PrintWritter("result1.txt"); 복제본을 p1이라는 변수에 담았고, 
		// 변수에 담겨있는 무엇을 PrintWritter의 클래스의 instance.
		//	3. PrintWritter p1 = new PrintWritter("result1.txt"); p1에 아무거나 들어가면 안되서, 
		//	p1에는 반드시 printWritter의 클래스의 instance만 들어가야해서, 데이터타입으로 PrintWritter를 지정, p1앞에 붙여줌
		
		// PrinterWriter는 패키지에 가져와야하는 작업을 해야한다.
		//java.io.PrintWriter 를 가져옴
		//그래도 red line ㅠㅠ파일을 읽다보면, 파일이 없으면 문제가 되는데 그걸 예외사항-> 예외사항처리는 아직 너무 어렵다. 
		//에러 클릭해서 >>> add Throws Declaration? 클릭 ㅇㅅㅇ > IOException 클릭
		
		//*자바 문서를 볼 때 클래스에 생성자 항목이 있으면 인스턴스를 활용하는 것이고 없으면 일회성으로 사용하게 됩니다. 
		//*인스턴스가 있으면 반복되는 작업들을 간편한 코드 한 줄로 끝낼 수 있습니다.
		
		System.out.println(Math.PI);//클래스에 변수이름 씀
		System.out.println(Math.floor(1.6));//클래스에 메소드 씀 
		//but 위에 PrintWriter는 'new'를 거쳐, 복사한 결과를 p1에 담았다. 
		//	???????????????? WHY??????????????????????????????????????????????????????????????????
	
		//인스탄스를 안쓰면 어떤 불편함이 있나.
		//result1.txt에 hello1을 기록하고싶다?
		p1.write("Hello 1");
		//ㄴ> 이거랑 이거가 같다. printWriter("result1.txt").write("Hello1");
		//효율을 위해 새로운(new) PrintWirte를 만들고 변수를 담아 계속 사용한다는거.
		//자료가 많이 필요하지않은 클래스는 바로 점을 붙여서 사용할 수 있지만 사용할 
		//자료가 많은 클래스는 앞에 new를 붙여서 복제해준 후 새로운 변수로 지정해서 사용(?)한다 
		//이때 변수앞에 어떤 클래스가 올 수 있는지 제한 하기 위해 제한하는 클래스이름을 붙인다.
		/*
		 * 밑에건 PrintWriter라는 하나의 클래스(변수함수저장)를, write메소드=함수가 서로 돌려막기-돌려쓰기 하고 있다.
		 * 하지만 위에 저건, PrintWriter는 new를 통해서 인스턴스를 만들었고, 그 인스턴스는 내부적으로 각자의 상태를 갖고 있다.
		 * 상태는, p1은 result1.text, p2는 result2.txt라는 내부적인 상태를 내장 하고 있기때문에,
		 * p1은 result1, p2는 result2에 대한것.
		 * Math.는 일회용같은 작업물, 3.14 를 불러온다, 아주 짧은 맥락. but, 우리가 어떤 파일을 수정한다? 그 파일에 대한 여러가지 작업들이 후속으로 쭈루룩,
		 * 여러개의 파일을 작업해야하는데.. ?
		 * 하나의 클래스를 작업하는 것보다, 하나의 클래스를, 앞에 new를 붙여서 복제해서, 각각의 다른 상태를 갖고 있는 인스턴스르 ㄹ만들어서 걔를 사용하는게 효율정.
		 * 클래스 필요 없으면 위에같은	Math.PI, 일회용이 아니라 긴 맥락의 작업을 해야하면 class를 복제한 instance를 만들어서
		 * 그것을 사용자에게 사용하게 하는것이 효율적.
		 * 	PrintWriter.는 constructer - 생성자가 있다. 생성자를 이용해서 instance를 만드는 것이 허용된다.
		 * ex) PrintWriter(String fileName) 생성자 사용. 클릭하면 어떻게 쓰는지 나온댜 ㅇㅅㅇ, 
		 * Parameters: 입력값으로 들어오는 값은 어떤거?   Throws: 생길 수 있는 예외는? 
		 *  Math., System는 constructor - 생성자가 없다. 일회용. 
		 *  
		 * PrintWriter.write("result1.txt", "Hello 1") > 어디에 무엇을 저장할가?
			PrintWriter.write("result1.txt", "Hello 1")
			PrintWriter.write("result1.txt", "Hello 1")
				이코드가 위에
				PrintWriter p1 = new PrintWriter("result1.txt");
				p1.write("Hello 1");	//p1이란 인스턴스에서 write해서 "hello 1 " 넣고
				p1.close();		//p1 작업끝났으면 close 해서 남도 수정할 수 있게함.
				와 같은 역할을 한다? 
				
				
				
				
				*1. 자바 문서를 볼 때 클래스에 생성자 항목이 있으면 인스턴스를 활용하는 것이고 없으면 일회성으로 사용하게 됩니다. 
				*인스턴스가 있으면 반복되는 작업들을 간편한 코드 한 줄로 끝낼 수 있습니다.
				*Class에 new를 붙여 복제하여, 다른 상태의 자식, 분신을 만들어 여러번 가공할 수 있게 하는게 인스턴스
				*2. .자료가 많이 필요하지않은 클래스는 바로 점을 붙여서 사용할 수 있지만 사용할 자료가 많은 클래스는 앞에 new를 붙여서 복제해준 후 새로운 변수로 지정해서 사용(?)한다 
				*이때 변수앞에 어떤 클래스가 올 수 있는지 제한 하기 위해 제한하는 클래스이름을 붙인다.
				*3. Instance 란 내가 사용하고자 하는 Class로 하나의 형식으로 지정한 후 그 Class를 적음으로 매번 새롭게 일일히 적어서 비효율적으로 쓰는게 아닌 계속 반복하여 사용할수 있게 하는 것이다.
				*4. 클래스란 관련된 변수와 메소드를 담고 있는 공간이고 이름이 있다. 클래스는 한번만 사용할 클래스가 있고 여러번 사용해야 할 클래스가 있다. 
				*만약에 파이를 계산해서 프린트를 하고 싶다면 파이를 계산해야 하는 상황은 그 클래스의 내용이 여러번 반복되야 할 필요가 없다. 
				*하지만 클래스의 내용이 계속 변화해야 한다면, 예를 들어 텍스트 파일 안에 쓰고 있는 글이 계속 변화한다면, 
				*하나의 클래스의 같은 메소드를 여러번 반복 하여 쓰는것은 비효율 적이고 보기에도 힘들다. 
				*그렇기 때문에 하나의 클래스를 복사하여 = instance 화 하여 변수에 집어 넣고 데이타 타입으로는 이게 클래스를 instance 화 한다는걸 자바에게 알려주기 위해 클래스이름을 붙여 주면. 
				*그 클래스 안에 들어갈 메소드를 어느 클래스를 향하고 있는 건지 
				*다시 말해 어떤 텍스트 파일을 향하고 있는 건지 자바에게 경로를 나눠 주게 되어.. 텍스트 파일 변경에 용이해진다.
				*
				*파이썬의 class와 instance개념과 상당히 유사하네요...! 저도 코딩을 전공중인 학생인데,  파이썬과 연관 지어서 이해해보려고 노력중입니다. 
				*class라는 것을 여러분 너무 어렵게 생각하지마시고, 예를들어 int,float,string도 class입니다. 
				*method는 그안에 있는 내장함수에요. 예를들어서 string의 언어 중 한개를 바꾸고 싶은 replace함수. 
				*string은 클래스고, 그 아래 replace라는 메소드(함수)가 있는 메커니즘입니다 !/
				*
				*제가 이해한 인스턴스(Instance)라는 것은
특정한 클래스(Class)의 상태를 내장하고 있는 지정변수(Variable)입니다
즉, Instance는 클래스의 특정한 상태를 내포하고 있는 값이며
해당하는 값을 고정/변동하여 사용할 때 지정하는 이름과도 같다고 생각이 듭니다

​감사합니다, 이고잉님.. ㅠ 국비학원에서 이해가 안되는 부분들을 여기서 다 채우고 있네요..
저는 개념이 정리가 안되면 잘 이해를 못하는 타입인데 이 영상들로 이해가 전부 되어가고 있습니다
비전공자들 반드시 이고잉님 강의로 천천히 시작하시면 다 되리라 믿습니다..
이고잉님 강의로 시작하면 너무 재밌고 쉬운 코딩이 되리라 믿어의심치 않습니다.. 감사합니다!!! ㅠㅠ
				*-
				*PrintWriter는 class(설계도)라고 한다.
PrintWriter앞에 new를 붙히게 되면 이 클래스(설계도)를 기반으로 해서 만들어진 객체가 리턴이 된다. 
만약에 PrintWriter
라는 클래스에 예를 들어 (result1.txt, result2.txt) 어떤 값을 넣고 앞에 new를 붙히게 되면 
그 (result1.txt, result2.txt)값으로 대상으로 하는 인스턴스(객체의 구체적인 복제품(?))가 만들어진다. 
우리는 그런 복제품(인스턴스)을 p1과 p2라는 변수에 담아서 인스턴스의 매소드(예를 들어 write, close)를 호출하게 되면 
(result1.txt, result2.txt)값으로 대상으로 하는 일을 수행 할 수 있다.

결국에는 p1과 p2는 같은 클래스(설계도)에서 만들어진 구체적인 객체의 제품이기 때문에
내부적으로 같은 로직의 매소드(write, close)가 존재한다. 하지만 매소드가 어떤 대상으로 일을 수행하느냐가 다른 점이다.
예전에 PHP 객체 수업과 같이 보면서 정리해봤는데 이렇게 생각하면 될까요? 
공부하다가 궁금한게 있습니다. 
PrintWriter 객체를 만들고 나서 result1.txt, result2.txt와 같이 서로 다른 값을 꼭 입력 해줘야만 인스턴스를 만들 수 있나요? 
여기서 말하는 인스턴스가 서로 다른 값(상태)이 입력 되어 있는 객체라고 생각하면 되나요? 


1. 파일이 없을 때 exception 이 뜬다, 근데 계속 말씀하시는 텍스트 파일인가요? 저 클래스를 사용하면 테스트 파일이 만들어 지는데 왜 텍스트 파일이 없다고 나와요? 
2. p1.close(); 클로즈 안해주면 다른 사람이 그 텍트트 파일 (result1) 을 변경 못하는 건가요?



그러니까 클래스란 서류에 포스트잇 붙여두고 분류해둬서 필요할 때 꺼내쓰는 게 인스턴스인 거구만요 
p1이라는 거는 그냥 이름인 거고 타입은 양변다 같아야 하며, new는 포스트잇을 붙이는 생성자


간단한 예를 들자면, 클래스는 추상적인 개념입니다. 
예를 들어 우리가 자동차 혹은 개를 생각을 해본다면 머릿속에 그려지는 추상적인 개의 모습이 있을 거에요. 
다리는 4개가 달려있고,  귀가 있고, 털이 있고 등등. 
이 틀 혹은 공통적인 요소를 가지고 있는 뼈대 (개 클래스) 를 가지고 각각의 다른 개들을 찍어냈을 때에 얘네들을 인스턴스라고 합니다 !
 흔히들 클래스를 붕어빵 틀에 비유를 많이 하시는데요, 
'붕어빵' 이라는 같은 틀을 가지고 있지만 슈크림맛, 단팥빵, 재료등 다른 맛들을 찍어낼 수 있지요 !

이해를 돕자면
펭귄 클래스를 만듭니다.
뽀로로를 펭귄 클래스의 인스턴스로 생성합니다.
펭귄이 가져야 할 것들, 특성 들을 가지고 있습니다.

여기서 또 다른 펭귄인 뽀순이가 등장합니다..
뽀순이도 펭귄이기에 펭귄의 특성들을 가지고 있죠.

뽀로로와 뽀순이는 다른 펭귄입니다.
하지만 둘 다 펭귄이죠.
클래스가 펭귄 같은 것이고
인스턴스가 뽀로로 같은 것입니다.

	* 우리가 만든 모든 클래스는 이미 object를 상속 받고있다.
	* 별 생각없이 public static void main을 상속 받는다.
		*/
	}

}
