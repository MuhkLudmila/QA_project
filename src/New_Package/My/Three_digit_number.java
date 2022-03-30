package New_Package.My;

public class Three_digit_number {
    public static void main(String[] args) {
        int n = (int)(Math.random()*900+100),a,b,c;
        a = n/100;
        b = (n%100)/10;
        c = n%10;
        if(a>=b&&a>=c) {
            System.out.println("V chisle "+n+" naiboljchaya sifra "+a);
        } else if(b>=a&&b>=c) {
            System.out.println("V chisle "+n+" naiboljchaya sifra "+b);
        } else {
            System.out.println("V chisle "+n+" naiboljchaya sifra "+c);
        }
    }
}
