package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker bc = new BraceChecker("(Hello) (from] [java}");
        bc.check();
    }
}
