import java.util.*;
public class bj_2420_safari {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //1번풀이
        long n = s.nextInt();   //long n = s.nextLong();
        long m = s.nextInt();
        
        long safari;
        safari = Math.abs(n-m);
        System.out.println(safari);
        //System.out.println(Math.abs(n - m));
        //long으로 받고 Math.abs()로 두 수 차의 절댓값을 출력
        
        //2번풀이 알고리즘
//        long n = s.nextLong();
//        long m = s.nextLong();
//        
//        long safari;
//        
//        if(n>m){
//            safari = n-m;
//        }
//        else{ //m>n
//            safari=-n+m;
//        }
//        
//        System.out.println(safari);
    }
}