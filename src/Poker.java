public class Poker {
    private static final int HANDSIZE = 5;
    private String[] hand;

    public Poker() {
        hand = new String[HANDSIZE];
        for (int i = 0; i < HANDSIZE; i++) {
            hand[i] = StdIn.readString();
        }
        java.util.Arrays.sort(hand);
    }

    public boolean flush() {
        char suit = hand[0].charAt(1);
        for (int i = 1; i < HANDSIZE; i++) {
            if (suit != hand[i].charAt(1)) {
                return false;
            }
        }
        return true;
    }

    public boolean fullHouse() {
        char rank1 = hand[0].charAt(0);
        int sumRank1 = 1;
        char rank2 = hand[HANDSIZE - 1].charAt(0);
        int sumRank2 = 1;
        for (int i = 1; i < HANDSIZE - 1; i++) {
            if (hand[i].charAt(0) == rank1) {
                sumRank1++;
            }
            if (hand[i].charAt(0) == rank2) {
                sumRank2++;
            }
        }
        if (sumRank1 == 3 && sumRank2 == 2) {
            return true;
        }
        if (sumRank1 == 2 && sumRank2 == 3) {
            return true;
        }
        return false;
    }
    public String toString() {
        String wholeHand = "";
        for (int i = 0; i < HANDSIZE; i++) {
            wholeHand = wholeHand + hand[i] + " ";
        }
        return wholeHand;
    }
}
