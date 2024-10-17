//package Cal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Lv2Calculator {
//    public static void main(String[] args) {
//       // Calculator calculator = new Calculator();
//        int num1 = 0;
//        int num2 = 0;
//        String operator = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 숫자를 입력하세요 : ");
//        num1 = sc.nextInt();
//        System.out.println("두번째 숫자를 입력하세요 : ");
//        num2 = sc.nextInt();
//        System.out.println("사칙연산을 입력하세요 : ");
//        operator = sc.next();
//        System.out.println(calculate(num1, num2, operator));
//        System.out.println("더 계산하시겠습니가? (exit 입력 시 종료");
//
//        List<Double>results = new ArrayList<>();
//        results.add(calculate(num1,num2,operator));
//
//    }
//
//
//    public static Double calculate(int a, int b, String oper) {
//        int result = 0;
//        while(true){
//            switch (oper) {
//                case "+":
//                    result = (a + b);
//                    break;
//                case "-":
//                    result = (a - b);
//                    break;
//                case "*":
//                    result = (a * b);
//                    break;
//                case "/":
//                    result = (a / b);
//                    break;
//            }
//            break;
//        }
//        return (double)result;
//
//    }
//}