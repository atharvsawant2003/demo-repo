public class Percentage {
    int m1, m2, m3, m4;
    public Percentage(int s1, int s2, int s3, int s4) {
       m1 = s1;
       m2 = s2;
       m3 = s3;
       m4 = s4;
    }
    public float getPercentage() {
       return (float)(m1 + m2 + m3 + m4) / 4 ;
    }
    public static void main(String[] args) {
       Percentage obj = new Percentage(88, 80, 100, 91);
       System.out.println("Percentage marks of 4 subject: " + obj.getPercentage() + "%");
    }
 }
 