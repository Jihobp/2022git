class Student{  //클래스 선언
    constructor(name,gender,beonho)
    {
        this.name=name
        this.gender=gender
        this.beonho=beonho
    }
    // toString(){Student.prototype.toString=function(){  
    //     return `${this.name} 학생은 ${this.gender}학생이며, `+
    //     `${this.beonho}번이다.`
    // }}   >>메모리 낭비라 바깥으로 뺐다.
}

//toString 함수 정의
Student.prototype.toString=function(){  
    return `${this.name} 학생은 ${this.gender}학생이며, `+
    `${this.beonho}번이다.`
}

//배열 선언
let student = [] 
