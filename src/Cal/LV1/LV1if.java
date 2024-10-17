//package Cal.LV1;
//
//import java.util.Scanner;
//
//public class LV1if {
//    public static void main(String[] args) {
//        int one = 0;
//        int two = 0;
//
//        String basic = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("첫번째 값을 입력해주세요 : ");
//        one = sc.nextInt();
//
//        System.out.println("두번째 값을 입력해주세요. : ");
//        two = sc.nextInt();
//        System.out.println("사칙연산부호를 선택하세요(+,-,*,/) : ");
//        basic = sc.next();
//        if(basic.equals("+")){
//            System.out.println(one+"+"+two+"="+(one+two));
//        }
//        else if(basic.equals("-")){
//            System.out.println(one+"-"+two+"="+(one-two));
//        }else if(basic.equals("*")){
//            System.out.println(one+"*"+two+"="+(one*two));
//        }else if(basic.equals("/")){
//            System.out.println(one+"/"+two+"="+(one/two));
//        }else{
//            System.out.println("불분명한 연산자입니다.");
//        }
//    }
//}
