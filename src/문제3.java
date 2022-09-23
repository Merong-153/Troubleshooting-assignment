public class 문제3 {
//  while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.

    public static void main(String[] args) {
        doDice();
    }
    static int dice() {
        return (int) (Math.random() * 6) + 1;
    }
    static void doDice() {
        int x, y;
        do {
            x = dice();
            y = dice();
            System.out.println(x + "," + y);
        } while (x + y != 5);
    }
}

//이 문제는 상당히 도움을 많이 받았다
//스스로 짜기엔 조금 힘든점이 몇가지 있어서 도움을 요청했고
//잘 알려주신것 같다