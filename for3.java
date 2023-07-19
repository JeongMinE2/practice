package Example;

// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.(for문 이용)
// int[] array = { 1, 5, 3, 8, 2 };

public class for3 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int max = array[0];

        for (int i = 0; i < array.length; i++) {        // 배열의 길이만큼 for문 돌려서 배열값 나열
            if (array[i] > max) {                       // 배열 값이 max 보다 크면
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
