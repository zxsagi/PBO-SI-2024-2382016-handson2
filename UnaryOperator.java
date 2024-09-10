public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        //pre-increment
        //sout(++x);
        System.out.println(++x);
        //post-increment
        System.out.println(x++);

        int y = 10;
        //pre-decrement
        System.out.println(--y);
        //post-decrement
        System.out.println(y--);

        //logical NOT
        boolean isTrue = true;
        System.out.println(!isTrue);

    }
}
