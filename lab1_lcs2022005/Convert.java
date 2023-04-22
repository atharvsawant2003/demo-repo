public class Convert {
    double km;
    public Convert(double d) {
       km = d;
    }
    public double toMiles() {
       return km / 1.609;
    }
    public static void main(String[] args) {
       Convert obj = new Convert(25);
       System.out.println(obj.km + " kilometers = " + obj.toMiles() + " miles");
    }
 }
 