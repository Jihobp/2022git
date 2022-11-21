//java ver.
window.addEventListener('load',(
    function(){
        //모든 코드를 한번에 변경
        //ctrl +f2

        const name = this.document.querySelectorAll('.name')
        const gender = this.document.querySelectorAll('.gender')
        const beonho = this.document.querySelectorAll('.beonho')

        const print = document.querySelectorAll('print')
        const reset = document.querySelectorAll('reset')
        const printOrderBy = document.querySelectorAll('printOrderBy')
        const information = this.document.querySelectorAll('.information')

        function resetInfo(information){
            //information 안에 있는 걸 다 날리는 것
            information.innerHTML=''
        }

        //🎈forEach
        reset.forEach(function(students){
            ('click',function(){
                resetInfo()
                students = [] //student.js에 있는 배열
            })
        }
        

        print.forEach(function(newStudentInfo){
            ('click', function(){
                //🎈val = value =input 태그의 value
                const student = new Student(name.val(),
                gender.val(), Number(beonho.val()))
    
                let newStudentInfo = $('<h1></h1>')
                newStudentInfo.text(student.toString())
                if(student.gender=='남'){
                    newStudentInfo
                    .css('background-color', 'springgreen')
                    .css('color', 'blue')
                }
                else{
                    newStudentInfo
                    .css('background-color', 'black')
                    .css('color', 'pink')
                }
                information.append(newStudentInfo)
            })


        }
        

        printOrderBy.on('click', function(){
            
            //중복 체크 로직을 적기
            const idx = students.findIndex( //students 안에있는 값 하나하나를 item 이라고 한다. 뭐라적어도 상관없긴한데.. 
                        //item = .findIndex 앞의 students
                function(item){
                    return item.beonho === Number(beonho.val())
                }
            )
            if(idx!=-1) //이미 해당 번호가 있는 경우 // 없으면 -1을 반환한다. !=-1은 있는거. 
            {
                alert('중복!')
                return
            }
            resetInfo() //화면 리셋 //g화면을 다지우고 students의 배열길이만큼 프린트 합니다. 
            //새로운 값 추가
            students.push(new Student(name.val(), gender.val(),
            Number(beonho.val())))  //.val은 제이쿼리, 밑에껀 js코드 ㅇㅅㅇㅇ
            //정렬(객체 정렬할 때도 sort를 씀)
            students.sort(function(a,b) {
                return a.beonho - b.beonho
            })

            //정렬된 것을 print
            for(let i = 0; i<students.length; i++)
            {   
                //let newStuentInfo = $('<h1></h1>')
                const newStudentInfo = document.createElement('h1')
                
                newStuentInfo.text(students[i].toString())
                if(students[i].gender=='남')
                {
                    newStuentInfo
                    .css('background-color','springgreen')
                    .css('color', 'blue')
                } else {
                    newStuentInfo
                    .css('background-color','black')
                    .css('color', 'pink')
                }
                information.append(newStuentInfo)
              }
        })
    }
)
)