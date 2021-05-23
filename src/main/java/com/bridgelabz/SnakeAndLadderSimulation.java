package com.bridgelabz;

public class SnakeAndLadderSimulation {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder game.");

        int P1_Position = 0;
        int P2_Position = 0;
        int New_Position = 0;
        int count1 = 0;
        int count2 = 0;
        int currentPlayer = 1;
        int checkOption;

        while (true) {

            if (currentPlayer == 1) {
                System.out.println("now Player-1's turn");
                count1++;
                int DieRolled = (int) (Math.random() * 6) + 1;
                checkOption = (int) (Math.random() * 3);


                switch (checkOption) {
                    case NO_PLAY:
                        New_Position = 0;
                        break;
                    case LADDER:
                        New_Position = DieRolled;
                        break;
                    case SNAKE:
                        New_Position = -DieRolled;
                        break;
                }
                P1_Position = P1_Position + New_Position;
                if (P1_Position < 0) {
                    P1_Position = 0;
                }
                if (P1_Position > 100) {
                    P1_Position = New_Position;
                }
                System.out.println("now Player-1 at " + P1_Position + "th" + " Position");
                if (P1_Position == 100) {
                    break;
                }
            }
            else {
                count2++;
                System.out.println("now Player-2's turn");
                int DieRolled = (int) (Math.random() * 6) + 1;
                checkOption = (int) (Math.random() * 3);

                switch (checkOption){
                    case NO_PLAY:
                        New_Position = 0;
                        break;
                    case LADDER:
                        New_Position = DieRolled;
                        break;
                    case SNAKE:
                        New_Position = -DieRolled;
                        break;
                }
                P2_Position = P2_Position + New_Position;
                if (P2_Position < 0) {
                    P2_Position = 0;
                }
                if (P2_Position > 100) {
                    P2_Position = New_Position;
                }
                System.out.println("now Player-2 at " + P2_Position + "th" + " Position");
                if (P2_Position == 100) {
                    break;
                }
        }
        if (checkOption==1) {
                   System.out.println("ohh,Yoy got Ladder. Now play again.");
            }
              else {
                    if (currentPlayer==1) {
                         currentPlayer = 2;
                    }
                    else  {
                        currentPlayer = 1;
                    }
        }
        }
        if (P1_Position==100) {
        System.out.println("\nCongratulation Player-1 you won! \n after die Rolled"+ count1+" times.");
        } else {
         System.out.println("\nCongratulation Player-2 you won! \n after die Rolled"+ count2+" times.");
        }
    }
}
