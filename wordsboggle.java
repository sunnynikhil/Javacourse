/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
public class wordsboggle {
 
     private static boolean search(char board[][], String word, int index, int i, int j)
    {
        int n = board.length;
        int m = board[0].length;
        
        // If position of the cell is inside the board or not
        if(i < 0 || i > n - 1 || j < 0 || j > m - 1) 
            return false;
        
        // If the current cell does not match the letter at index  
        if( word.charAt(index) != board[i][j]) return false;
    
        // If each character is matched
        if (index == word.length() - 1) return true;
        
        char ch = board[i][j];
        board[i][j] = '#';
        
        // Search for adjacent indices
        int dx[] = {-1,0,+1,-1,+1,-1,0,+1};
        int dy[] = {+1,+1,+1,0,0,-1,-1,-1};
        
        for(int x= 0;x<dx.length;x++)
        {
            if(search(board,word,index + 1,i+dx[x],j+dy[x]))
            {
                board[i][j] = ch;
                return true;
            }
        }
        
        board[i][j] = ch;
        
        return false;
    }
    
    private static boolean exist(char board[][], String word)
    {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(search(board,word,0,i,j)) return true;
        
        return false;
    }

    public static String[] findwords(char[][] board,String[] dictionary){
        List <String> wordslist = new ArrayList<String>();
        for(int i=0;i<dictionary.length;i++)
            if(exist(board,dictionary[i]))
                wordslist.add(dictionary[i]);
                
        String[] ans = wordslist.toArray(new String[0]);

        return ans;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] dictionary = new String[n];
        for(int i=0;i<n;i++)
            dictionary[i]=in.next();
        int r = in.nextInt();
        int c = in.nextInt();
        char[][] boggle = new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                boggle[i][j]=in.next().charAt(0);
        }
        String[] ans =findwords(boggle,dictionary);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]);
 
    }
    
}
