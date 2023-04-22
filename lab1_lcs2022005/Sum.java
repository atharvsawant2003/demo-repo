public class Sum {
    int num1, num2;
    public Sum(int a, int b) {
       num1 = a;
       num2 = b;
    }
    public int getSum() {
       return num1 + num2;
    }
    public static void main(String[] args) {
       Sum obj = new Sum(6, 7);
       System.out.println("Sum of numbers "+obj.num1+ " and " +obj.num2+ " : " + obj.getSum());
    }
 }
 