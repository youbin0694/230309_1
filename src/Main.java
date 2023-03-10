import java.util.Scanner;

/**
 * 양수/음수/0 판별하는 클래스
 * 
 * @author yblee
 * @since 2023.03.10
 * 
 */
public class Main {
    // 
    public static int inputValue;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        isPositive(inputValue);
        if (inputValue == 1) {
            System.out.println("positive");
        } else if (inputValue == -1) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        scan.close();
    }

    /**
     * 양수/음수/0 판별하는 함수
     * 
     * @param num 양수/음수/0 판별 위해 입력으로 받은 값
     * 
     * @author yblee
     * @since 2023.03.10
     * 
     */
    public static void isPositive(int num) {
        inputValue = num > 0 ? 1 : num < 0 ? -1 : 0;
    }
}