package com.bridgelabz;

public class SnakeAndLadderSimulation {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder game.");

           int Position=0;
           int newPosition=0;

           int DieRolled = (int) (Math.random()*6)+1;
           int checkOption = (int) (Math.random()*3);

           switch (checkOption){
               case NO_PLAY:
                     newPosition = 0;
                      break;
               case LADDER:
                   newPosition = DieRolled;
                     break;
               case SNAKE:
                   newPosition = -DieRolled;
           }
           Position=Position+newPosition;
           if (Position<0){
                    Position = 0;
           }
           System.out.println("You are now at "+Position+"th"+" position");
    }
}
