function genLotto() {
    let lotto = []
    //난수 생성 코드
    for (let i = 0; i < 7; i++) {
        let num = Math.floor(Math.random() * 45) + 1
        let isDuplicate = false
        for (let j = 0; j < i; j++) {
            if (num == lotto[j]) {
                isDuplicate = true  //중복되면 true고  
                i--         //i++해준거 i-- 후 (i=1 - > i=0번째로)
                break       //빠져나가고 다시 반복해준다.
            }
        }
        if (isDuplicate == false)   //중복 안될 시, 
            lotto.push(num)         //lotto push 하고 num을 그 안에 저장한다.
    }

    //정렬 코드(가장 쉬운 정렬인 버브ㅓㄹ 정렬)
    for(let i = 0; i<lotto.length; i++)
    {
        for(let j = 0; j<lotto.length-1-i; j++) //j번째랑, j+1 옆에 있는 곳을 비교해야한다.
        {                                       //이미 비교한 i번째는 필요없다. 
                                                //끝에 배열은 비교해줄 필요가 없으니까, -1. 
            if(lotto[j]>lotto[j+1])
            {
                let temp = lotto[j]
                lotto[j] = lotto[j+1]
                lotto[j+1] =temp
            } 
        }
    }
    return lotto;
}