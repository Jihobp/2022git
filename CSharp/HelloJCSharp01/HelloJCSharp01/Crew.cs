namespace HelloJCSharp01
{
    //인터페이스는 정신, 클래스는 육체!!!
    public class Crew : Coach
    {
        public int num; //선수번호

        public Crew(string name, int age, int num) : base(name, age)
        {
            this.name = name;
            this.age = age;
            this.num = num;
        }






        /*void update(String msg);
        void unsubscribe(Crew crew);
        void notifyCrew(String msg);*/
    }
}
