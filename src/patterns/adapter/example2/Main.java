package patterns.adapter.example2;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello2");
        p.printWeak();
        p.printStrong();
    }
}
