    package blackjack;
    import java.util.Scanner;
     /*
            This program is a program that lets up to 4 users plus a dealer
            play a game of black jack or otherwise known as 21.
             */
    public class BlackJack
    {
            static Player[] players = new Player[4];
            static int numberOfPlayer;
            static Player dealer  = new Player("Dealer");
            static Deck deck = new Deck();   // An array of 52 Cards, representing the deck.
            static int numberOfCardsUsed = 0;
            static int currentPosition; // Current position in the deck
                public static void main(String[] args)
            {
                 deck.CreateNewDeck();
                //deck.DisplayDeck();
                deck.ShuffleCards();
                //deck.DisplayDeck();
                Scanner sc = new Scanner(System.in);
                System.out.printf("\n  Enter total number of players   ");
                numberOfPlayer = sc.nextInt();
                for(int i = 0; i < numberOfPlayer; i++)
                {
                    String userName;
                    System.out.printf("\n\n  Enter name of Player "+Integer.toString(i + 1)+" : ");
                    sc = new Scanner(System.in);
                    userName = sc.nextLine();
                    players[i] = new Player(userName);
                    GivePlayerACard(players[i],deck.getCard(numberOfCardsUsed));
                }
                GivePlayerACard(dealer,deck.getCard(numberOfCardsUsed));
                DisplayTable();
                System.out.println("\n\n\nGive second card to each user");
                for(int i = 0; i < numberOfPlayer; i++)
                {
                GivePlayerACard(players[i],deck.getCard(numberOfCardsUsed));
                }
                GivePlayerACard(dealer,deck.getCard(numberOfCardsUsed));
                DisplayTable();
          for(int i = 0; i < numberOfPlayer; i++)
                {
                    do
                    {
                        int choice;
                        System.out.println("\n\n Player "+ Integer.toString(i + 1) + " choose your option");
                        System.out.println("1 -> Hit");
                        System.out.println("2 -> Stand");
                        System.out.println("3 -> Split");
                        System.out.println("4 -> Double-Down");
                        System.out.println("5 -> Surrender");
                        choice = sc.nextInt();
                        if(choice==1)
                        {
                          GivePlayerACard(players[i],deck.getCard(numberOfCardsUsed)); 
                          if(players[i].IsPlayerBust())
                          {
                              System.out.println(" \n\n Player "+ Integer.toString(i + 1) + " is Bust");
                              break;
                          }
                        }
                        else if(choice==2)
                        {
                           break; 
                        }
                        else if(choice==3)
                        {
                            System.out.println("\n\n Player "+ Integer.toString(i + 1) + " Sorry, Not in this program");
                        }
                        else if(choice==4)
                        {
                            System.out.println("\n\n Player "+ Integer.toString(i + 1) + " Sorry, Not in this program");
                        }
                        else if(choice==5)
                        {
                             System.out.println("\n\n Player "+ Integer.toString(i + 1) + " Sorry, Not in this program");
                        }
                    } while(true);
                }
            }  // end playBlackjack()
             public static void DisplayTable()
            {
                for(int i = 0; i < numberOfPlayer; i++)
                {
                    players[i].DisplayPlayer();
                }
                dealer.DisplayPlayer();
            }
            public static void GivePlayerACard(Player player,Card card)
            {
                    player.Cards[player.numberOfCards] = deck.getCard(numberOfCardsUsed);
                    player.numberOfCards += 1;
                    numberOfCardsUsed +=1;
            }
        }
        Here is the Player Class 
        package blackjack;
        public class Player 
        {
            public String Name;
            public Card[] Cards;
            public int numberOfCards;
            public int wins;
            public int loss;
            public int ties;
            public int currentTotal;
            public int total;
            public Player(String name)
            {
                Name = name;
                Cards = new Card[100];
                numberOfCards = 0;
            }
            public void DisplayPlayer()
            {
                System.out.println("Player Name:" + Name );
                System.out.println("  Current Card List");
                for(int i =0 ; i < numberOfCards; i++)
                {
                    Cards[i].display();
                }
            }
            public boolean IsPlayerBust()
            {
                int total=0;
                for(int i = 0 ; i < numberOfCards; i++)
                {
                    int value = Cards[i].getValue();
                    if(value>10)
                    {               
                        total += 10;
                    }
                    else
                    {
                        total += value;
                    }
                }
                return total>21;
            }
            public int GetcurrentTotal()
            {
              return currentTotal;
            }
            public void setCurrentTotal(int currentTotal)
            {
                this.currentTotal = currentTotal;
            }
        }
        Here is the Card class
        package blackjack;
        public class Card 
        {
            private String valueString;
            private int value;
            private int suit;
            private String suitString;
            public Card(int number, int shape)
            {
                value = number;
                suit = shape;
                if(value == 1)
                {
                    valueString = "Ace";
                }
                else if(value == 11)
                {
                    valueString = "Jack";
                }
                else if(value == 12)
                {
                    valueString = "Queen";
                }
                else if(value == 13)
                {
                    valueString = "King";
                }
                else
                {
                    valueString = Integer.toString(value);
                }
                switch(shape)
                {
                    case 1:
                        suitString = "Spades";
                        break;
                    case 2:
                        suitString = "Hearts";
                        break;
                    case 3:
                        suitString = "Clubs";
                        break;
                    case 4:
                        suitString = "Diamonds";
                        break;
                }
            }
            public int getValue() 
            {
                return value;
            }
            public void setValue(int value) 
            {
                this.value = value;
            }
            public int getSuit() 
            {
                return suit;
            }
            public void setSuit(int suit) 
            {
                this.suit = suit;
            }
            public void display()
            {
                System.out.println("    "+valueString + " of "+ suitString);
            }
        }
        Here is the Deck Class
        package blackjack;
        import java.util.*;
        public class Deck {
            private Card[] deck;
            public void CreateNewDeck()
            {            int index = 0;
                deck = new Card[52];
                for(int i = 1; i <= 13; i++)
                {
                    for(int j = 1; j <= 4 ; j++)
                    {
                        deck[index] = new Card(i,j);
                        index = index + 1;
                    }
                }
            }
            public void DisplayDeck()
            {
                for(int i = 0 ; i< 52; i++)
                {
                    deck[i].display();
                }
            }
            public Card getCard(int index)
            {
                return deck[index];
            }
            public void ShuffleCards()
            {
                int index;
                Random random = new Random();
                for (int i = deck.length - 1; i > 0; i--)
                {
                    index = random.nextInt(i + 1);
                    if (index != i)
                    {
                        Card tempCard = new Card(deck[i].getValue(),deck[i].getSuit());
                        deck[i] = new Card(deck[index].getValue(),deck[index].getSuit());
                        deck[index] = new Card(tempCard.getValue(),tempCard.getSuit());
                    }
                }
            }
            }