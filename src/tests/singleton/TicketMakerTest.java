package tests.singleton;

public class TicketMakerTest {
    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + ticketMaker.getNextTicketNumber());
        }
        System.out.println("End");
    }
}
