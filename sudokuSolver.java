/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class sudokuSolver {
    
     public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return ;
        solve(board);
    }
    
    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(int c = 1; c <= 9; c++){//trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = Character.forDigit(c, 10); //Put c for this cell
                            
                            if(solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean isValid(char[][] board, int row, int col, int c){
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == Character.forDigit(c, 10)) return false; //check row
            if(board[row][i] != '.' && board[row][i] == Character.forDigit(c, 10)) return false; //check column
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' && 
board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == Character.forDigit(c, 10)) return false; //check 3*3 block
        }
        return true;
    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t =in.nextInt();
	 while(t-->0)
	 {
	     int[][] board = new int[9][9];
	     for(int i=0;i<9;i++)
	      for(int j=0;j<9;j++)
	       board[i][j]=in.nextInt();
	   boolean isvaild = solveSudoku(board);
	   if(isvaild)
	     System.out.println("1");
	   else
	     System.out.println("0");
	 }
	 }
}
