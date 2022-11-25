alert("hi");
//js's function! 
//html is Glue. 
//open index.html on a browser. browser will execute the file,
//and html brings css, and brings js. 
//2 engines. js, css.



//2.1-2.6
//always const;
//sometimes let;
//never var; 코드가 뭐할질 알수없다. 

console.log(54545454);
//console.에 loging: 콘솔에 이 ()안의 값을 출력하고 있다.
console.log('lalalalala')

//프로그래머들은 게으르고 단축시켜야한다. you need to be a lazy developer.
//overall. 전반적으로, as i said, i don't want to replace. i want to be even more lazy.
//Variable. : basically, save or hold the value. 값을 저장하거나 유지하는 일을 한다.

//1. const = constant==상수  :  변하지 않는. 
const a = 5; //a equals 5 :  a holds 5
const b = "2"; //Text !!!! who has number 2.

//Camelcase == js에서 스페이스가 때문에 스페이스다음 올문자를 대문자 e.g  
const veryLongVariableName=0; 
//snake_case == python에선 very_long_variable_name=0; 
const myName = "nico";

console.log(a+b);
console.log(a*b);
console.log(a/b);
console.log("hello"+myName);


//2.3 let =  you could update variable.
//기본적으론 const, 필요할때만 let. 
let a2 = 5; //a equals 5 :  a holds 5
let b2 = "2"; //Text !!!! who has number 2.

myName2 = "nicolas"; //const 는 업데이트 못한다!!! 


console.log(a2+b2);
console.log(a2*b2);
console.log(a2/b2);
console.log("your new name is "+myName2);

//규칙을 안다면 이 코드가 나중에 뭘 할지 알 수 있다. 
//e.g const)변하지 않음! 


//2.3 var = back than...you could update anytime, anywhere.
// but we could not proteced by any language. 


//2.4 Booleans = true/false
const anIFat = true; //"true"xxxxx <- 이건 문자!!!
console.log(anIFat);

const amIFat=null;
//null. 타입 == there is nothing there. this null is nothingless.
//절대 자연적으로 발생안함. variable안에 값이 없다는걸 알려주기 위해 씀.
//true/flase == there is something.
let something; // 만들긴 했지만, 값을 주진 않았다.
console.log(something, amIFat);
//undefined. 타입 : 컴퓨터 메모리 안에는 존재하지만 값이 없다. 
//something variable exist, and the value is nothing.
//variable 이 있지만, 그 안에 값이 없다는걸 알려준다. 


//3일짜
//()는 버튼, 함수를 실행한다, 중괄호 braket 안에 있는거 실행.
//argument:::  function 을 실행하는 동안 어떤정보를 sayHello()에 보낼 수 있는 방법.
//sayHello라는 데이터가, nameOfPerson 이라는 variable로 가게 된다는걸 안다. 
function sayHello(nameOfPerson, age){
    //console.log("Hello my name is C");
    console.log(nameOfPerson);
    console.log("Hello my name is "+ nameOfPerson + " and I'm "+age);
}
alert(); //빈칸 듬
console.log(); //빈칸
sayHello();
console.log("hello");
sayHello("nico", 10); //이 펑션은 데이터를 받아서 넣어줘야함.  c를 nico, dal, lynn 이출력되어야함. 
sayHello("dal", 23); 
sayHello("lynn", 21); 
//바깥세상에서 뭔가를 받는 방법;function
//첫번쨰 argumnet로 어떤 데이터가 들어오면, 
//nameOFPerson 이라는 variable 이름을 쓰는 것. 
//argument는 하나만 쓰는게 아니라, 하나더 받을 수 있다. name 이란 string, age란 int.
//name 이랑 age는 function 안의 바디 안에만 존재함 

