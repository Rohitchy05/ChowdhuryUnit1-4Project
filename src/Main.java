public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand myHand = new Hand(deck);
        myHand.display();
    }
}
