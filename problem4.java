
public class problem4 {
    public static void main(String[] args) {
        long a = 0;
        long b = 600851475143L;
        for (long c = 3; c < b; c += 2) {
            while (b % c == 0) {
                a = c;
                b = b / c;
            }
        }
        System.out.println((b == 1)?a:b);
    }
}