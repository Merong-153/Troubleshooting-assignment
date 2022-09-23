public class 문제2 {
//    다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)
    public static void main(String[] args) {

        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
//답은 31이다
//연산자가 앞에 있을경우 이미 증감된 상태의 값을 불러오고
//뒤에 있을경우 증감되기 전의 값을 가지고 오기때문에
//z = 11 + 20 과 같은것이다
