
import java.util.Scanner;

//if-else�ṹ����ѭ��Ƕ��
//��ϰ�������������Ƚϴ�С
class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������һ����");
        double num1 = scan.nextDouble();
        System.out.println("������ڶ�����");
        double num2 = scan.nextDouble();
        System.out.println("�������������");
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
