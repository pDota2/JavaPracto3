import java.util.Scanner;
public class TriangleAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника a, b и c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (isRightTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (a == b && b == c) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (!isTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }
        scanner.close();
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
}
