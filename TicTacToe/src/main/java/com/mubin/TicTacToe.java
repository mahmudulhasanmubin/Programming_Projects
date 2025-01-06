package com.mubin;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board=new char[3][3];

    public static void run(){
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        char player='X';
        boolean gameOver=false;
        Scanner scanner=new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.print("Player " + player + " enter [][]: ");
            try {
                int row=scanner.nextInt();
                int col=scanner.nextInt();
                if(board[row][col]==' '){
                    //place the element
                    board[row][col] = player;
                    gameOver=haveWon(board, player);
                    if(gameOver){
                        System.out.println("Player " + player + " has won the game!");
                    }
                    else if (isBoardFull(board)) {
                        printBoard(board);
                        System.out.println("It's a tie!");
                        gameOver=true;
                    } else{
                        player = (player=='X' ? 'O' : 'X');
                    }
                }
                else {
                    System.out.println("Invalid move. Try again.");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input: Please enter two integers {between (0 0) to (2 2)} separated by a space.");
                scanner.nextLine();
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        //check the row
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }
        //check for the column
        for (int col =0; col < board[0].length; col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char rows : row) {
                if (rows == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(char[][] board){

        System.out.println("\n  +---+---+---+");
        for (char[] chars : board) {
            System.out.print("  |");
            for (char aChar : chars) {
                System.out.print(" " + aChar + " |");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
    }
}
