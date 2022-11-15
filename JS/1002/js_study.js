
    // <!-- var date = new Date(); //올드함 ㅇㅅㅇ -->
    // <!-- vat date 중복선언 되서 꼬이면 ㄴㄴ .   let을 써야함. -->
    // <!-- js 호이스팅ㅇㅅㅇ 밑에서 선언했던걸 위에서 불러오는게 된당.  c랑 다르당. -->
    console.log(date.toISOSTring)
    // <!-- isoString 많으 씀. -->

    var date = new Date()
    var a =`
    ${ date.getFullYEar()}년
    ${ date. getMonth()+1 }월
    //0부터 11월까지.  
    ${date.getDate()}일 입니다.$
    `
    console.log(a);


    //date 함수 출력
    date.setDate(date.getDate()+7)
    console.log(date)



    //10월 31일 출력
    var date = new Date(2022, 9, 31)
    date.setMonth(date.getMonth() +1)
    console.log(date)

    //1o월 
    


