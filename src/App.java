import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // dsad asdasdasd asdsadasdasd
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0){
            positive();
        }
        else if(num<0){
            negative();
        }
        else{
            zero();
        }
    }

    public static void positive() {
        System.out.println("positive");
    }

    public static void negative() {
        System.out.println("negative");
    }

    public static void zero() {
        System.out.println("zero");
    }