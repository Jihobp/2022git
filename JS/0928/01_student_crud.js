function Student(name, age, number)
{
    this.name = name
    this.age = age
    this.number = number
}
//() => {} 이건 this가 안된다. = () => xx
Student.prototype.regist = function() {
    alert(this.number+' '+this.name+'학생 등록 완료')
}

Student.prototype.toString = function(){            //
    return this.name+' '+this.number+' '+this.age
}
window.onload = () =>{ //왜 적었을까?  script 태그가 헤더 안에 있음. 그래서 body 안에 있는걸 불러오기위함. 
    let my_name = document.querySelector('#name') //my_name이라는 변수가 id가 name이라는 태그를 가리킨당. 
    let my_age = document.querySelector('#age')
    let my_num = document.querySelector('#num')

    let my_create = document.getElementById('create')
    let my_read = document.getElementById('read')
    let my_update = document.getElementById('update')
    let my_delete = document.getElementById('delete')

    let my_console_log = 
        document.getElementById('console_log')

    
    let my_students = []

    // 학생 등록 + 중복 학생 nono 함수
    my_create.onclick = function() {    //mycreate 버튼을 눌러서
        for (const iterator of my_students){ //my_students 길이만큼 반복문을 돌다가, 만약 my_students 안에 번호가 1번인 학생이 있는데 ,
            if(iterator.number == my_num.value) //my_)num 은 input태그다. input 태그에도 1,  ,y_students에도 1번인 학생이면 중복이니까 함수를 끝내 버린다.
            {
                alert('중복 학생 존재')
                return
            }
        }
        //중복인 학생이 없다면?
        let tempStudent = new Student(my_name.value,
            my_age.value, my_num.value)
        my_students.push(tempStudent) //tempStudent를 불러와서 my_students 안에 푸시한당?
        tempStudent.regist()    //해당 학생의 정보를 띄움.
        
        //내가 정의한 toString 출력 
        console.log(my_students.toString())
        //배열 자체를 출력
        console.log(my_students) //(my_students.toString()) 지웠당. 
        
    }

    //학생조회 함수
    function findStudent()
    {   //🐉sr.findIndex : 객체 형태의 배열에서 특정 조건에 맞는 객체가 몇 번에 있는지 찾기. //객체
        //🐉sr.indexOf : 숫자나 문자열 형태의 배열에서 찾고자 하는 값의 위치를 찾음. //문자 숫자
        //💚findIndex : 객체 형태의 배열에서 특정 조건에 맞는 객체가 몇 번에 있는지 찾기.
        //ex) my_num에 적힌 값이랑 number 값이 같은 거 찾기

        //💚indexOf : 숫자나 문자열 형태의 배열에서 찾고자 하는 값의 위치(=인덱스) 찾음
        //💕이 둘의 공통점은 찾고자 하는 값이 없을 때 -1 을 반환
        const idx = my_students.findIndex(  //객체 인덱스랑 같은게 있냐 없나 찾는거. 
            function(item){         //🐉여기서 item = findIndex앞의  myStudents
                return item.number == my_num.value  
                //☝ '==' 연산자를 이용하여 서로 다른 유형의 두 변수의 [값] 비교
                //✌ '==='는 엄격한 비교를 하는 것으로 알려져 있다 ([값 & 자료형] -> true).
                //🕺 변수를 비교하거나 어떤 비교를 위해 항상 '===' 연산자를 사용 할 것을 권장한다.
                //💃 가능한 '==' 연산자를 사용하지 않도록 하고, 대신 직접 자료형을 변환하여(casting) 보다 코드 가독성을 높이도록 한다.
                //정답부터 말하자면, '=='와 '===' 연산자의 주된 차이점은, 예를 들어, 숫자를 숫자 리터럴과 비교하면, '=='는 그것을 허용하지만, '===' 두 변수의 형식은 동일하지 않은 경우, 값뿐만 아니라 두 변수의 유형도 확인하므로, 허용하지 않는 것이다. 
                //즉, '==='는 'false'으로 반환하고, '=='는 'true'로 반환다.
            }
        )
        if(idx!=-1)
        {
            alert(`${my_students[idx].number}번 학생은 ${my_students[idx].name}`)
        }
    }
    
    my_read.onclick = findStudent

    //학생 정보 수정 . 

    my_update.addEventListener('click', () => {
        const idx = my_students.findIndex(
            function(item){
                return item.number==my_num.value
            }
        )
        if(idx != -1){
            my_students[idx].name = my_name.value
            my_students[idx].age = my_age.value
        }
    })

    my_delete.addEventListener('click', function(){
        for(let i=0; i<my_students.length;i++){
            if(my_num.value==my_students[i].number)
            {
                my_students.splice(i,1) //i번째꺼 1개 제거 
                alert('학생 삭제 완료')
                return 
            }
        }

        alert('해당 번호의 학생 없음')
    })

    //학생 전체 선택
    let allSelect = function(){
        for(const iterator of my_students){
            console.log(iterator.toString())
        }
    }
    my_console_log.addEventListener('click', allSelect)

}