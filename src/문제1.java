public class 문제1 {
    //    다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
    public static void main(String[] args) {

        int var1=5;
        int var2=2;
        double var3=var1/var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);
    }
}
//이 문제를 처츰 봤을때 double형에 값을 넣었으니
//당연히 var3이 2.5가 출력 되는줄 알았고
//var4 계산에서 int형을 사용했기 때문에

//int var4=(int)(var3*var2)

//var3의 값인 2.5에서 0.5가 떨어져나가 2가되고
//var2의 값인 2와 곱해서 4가 출력되는줄 알았다
//
//그래서 var3을 출력을 해봤는데 결과는...
//
//2.0 이 출력이 됐다
//
//그렇게 코드를 이리저리 만져보며 2.5가 나오게 만들어보았다

//int var1=5;
//double var2=2;
//double var3=var1/var2;
//int var4=(int)(var3*var2);
//System.out.println(var4);

//    결과가 이 코드이다

//int var2=2;
//--------------
//double var2=2;

//    답은 var1 혹은 var2의 int형을 double로 바꿔주는 것이었다
//하지만 저렇게 바꿨을때 출력값이 2.5가 나오는건 알고있어도
//왜 저렇게 되는지 정확한 이유가 궁금해 이유를 찾아다녔다
//사이트에서는 찾지 못했지만 팀원한테 이유를 물어보니 답을 알수 있었다
//
//내가 이해하기론 var3에 값을 넣기전에 var1과 var2는 int 와 int의계산이기 때문에
//소수점 밑으로는 버려지는 것이고 소수점이 버려진 2 의 상태에서 double형으로
//들어가 2.0이 출력되는 것이엇다
//
//내 이해가 맞는건진 모르겠다
//맞겠지 뭐