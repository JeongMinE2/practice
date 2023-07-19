package Example;

// 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성해보세요.

public class for1 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        for (i=1; i<=100; i++) {
            if (i%3==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
