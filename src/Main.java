import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to poker! How much would you like to bet?");
        int bet = scan.nextInt();
        Deck deck = new Deck();
        Hand myHand = new Hand(deck);
        Hand oppHand = new Hand(deck);
        System.out.println("Here are your cards");
        myHand.display();
        System.out.println("Would you like to bet, call or raise?");
        String input = scan.nextLine();
        oppHand.display();
        Hand communityCards = new Hand(deck);
        Hand communityCards2 = new Hand(deck);
        Hand communityCards3 = new Hand(deck);
        communityCards.display();
        communityCards2.display();
        communityCards3.display();
    }
}
