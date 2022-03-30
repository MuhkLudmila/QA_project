package New_Package.My;

public class Closest_to_10 {
    public static void main(String[] args) {
        double m,n,a,b,d;
        m = 9.9;
        n = 11;
        d = 10;
        a = Math.abs(m-d);
        b = Math.abs(n-d);
        if(a<b) {
            System.out.println(m+" blizje");
        } else if(a>b) {
            System.out.println(n+" blizje");
        } else {
            System.out.println("Rastoyanije ot "+m+" do 10 = rasstoyanijy ot "+n+" do 10");
        }
    }
}