
import java.util.Scanner;

//if-else结构可以循环嵌套
//练习：输入三个数比较大小
class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double num1 = scan.nextDouble();
        System.out.println("请输入第二个数");
        double num2 = scan.nextDouble();
        System.out.println("请输入第三个数");
        double num3 = scan.nextDouble();

        if (num1 >= num2) { // 5 4 8
            if (num3 >= num2) {
                System.out.println(num2 + "<" + num1 + "<" + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "<" + num2 + "<" + num1);
            } else {
                System.out.println(num2 + "<" + num3 + "<" + num1);
            }

        } else {
            if (num3 >= num2) {
                System.out.println(num1 + "<" + num2 + "<" + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.println(num1 + "<" + num3 + "<" + num2);
            }
        }
    }
}
