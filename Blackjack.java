import java.util.*;

class Cards{

    String rank;
    int value;

    Cards(String x, int y){
        rank = x;
        value = y;
    }
}

class Blackjack{
    
    public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Cards card[] = new Cards[13];
        card[0] = new Cards("Ace", 1);
        card[1] = new Cards("2", 2);
        card[2] = new Cards("3", 3);
        card[3] = new Cards("4", 4);
        card[4] = new Cards("5", 5);
        card[5] = new Cards("6", 6);
        card[6] = new Cards("7", 7);
        card[7] = new Cards("8", 8);
        card[8] = new Cards("9", 9);
        card[9] = new Cards("10", 10);
        card[10] = new Cards("Jack", 10);
        card[11] = new Cards("Queen", 10);
        card[12] = new Cards("King", 10);

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        
        int random_r = (int)(Math.random() * 13);
        int random_s = (int)(Math.random() * 4);
        
        int random_r2 = (int)(Math.random() * 13);
        int random_s2 = (int)(Math.random() * 4);
        
        System.out.println("Welcome to a game of Blackjack! Drawing you 2 cards now!");
        wait(2000);

        System.out.println("Card 1: " + card[random_r].rank + " of " + suits[random_s]);
        System.out.println("Card 2: " + card[random_r2].rank + " of " + suits[random_s2]);
    
        int overallValue = card[random_r].value + card[random_r2].value;

        System.out.println("You're currently sitting at: " + overallValue + " of 21!");
        
        System.out.println("Would you like to HIT or STAY?");
        String choice = input.nextLine();
        
        
        int random_r3 = (int)(Math.random() * 13);
        int random_s3 = (int)(Math.random() * 4);
        
        if(choice.equals("HIT")){
            System.out.println("Drawing your 3rd card!");
            wait(2000);
            System.out.println("Card 3: " + card[random_r3].rank + " of " + suits[random_s3]);
            overallValue = overallValue + card[random_r3].value;  
            
        } 
        else if(choice.equals("STAY")){
            System.out.println("You've chosen to stay at: " + overallValue);
        }

        if(overallValue <= 21){
            System.out.println("You're currently sitting at: " + overallValue + " of 21. Would you like to HIT or STAY?");
           
        } 
        else if(overallValue > 21){
            System.out.println("You've bankrupt and are sitting at " + overallValue + "!" + " You've lost!");
            
        }
        
        String choice2 = input.nextLine();
        int random_r4 = (int)(Math.random() * 13);
        int random_s4 = (int)(Math.random() * 4);

        if(choice2.equals("HIT")){
            System.out.println("Drawing your 4th card!");
            wait(2000);
            System.out.println("Card 4: " + card[random_r4].rank + " of " + suits[random_s4]);
            overallValue = overallValue + card[random_r4].value;  
            
        } 
        else if(choice2.equals("STAY")){
            System.out.println("You've chosen to stay at: " + overallValue);
        }

        if(overallValue <= 21){
            System.out.println("You're currently sitting at: " + overallValue + " of 21. Would you like to HIT or STAY?");
           
        } 
        else if(overallValue > 21){
            System.out.println("You've bankrupt and are sitting at " + overallValue + "!" + " You've lost!");
            
        }
    
        
    
    }
}