public class Main {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            Poker test = new Poker();
            if (test.flush()) {
                StdOut.println("Flush: " + test);
            }
            if (test.fullHouse()) {
                StdOut.println("Full House: " + test);
            }
        }
    }
}
