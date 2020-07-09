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
import java.util.Stack;
import static javacourse.resverseastring.reverse;
public class evlatepostfix {
    
    public static int cal(int x,int y,char c){
        int res=0;
        switch(c){
            case '-':
                res= x-y;
                break;
            case '+':
                res= x+y;
                break;
            case '*':
                res= x*y;
                break; 
            case '/':
                res= x/y;
                break;    
                
             
        }
        return res;
    }
        public static int eavlpost(String s){
            Stack<Integer> stack = new Stack<>();
            int i=0;
            while(i<s.length()){
                if(Character.isDigit(s.charAt(i)))
                {
                    stack.push(s.charAt(i)-'0');
                }
                else
                {
                    
                    int y=stack.pop();
                    int x = stack.pop();
                    int res = cal(x,y,s.charAt(i));
                    stack.push(res);
                }
                i++;
            }
            
            return stack.pop();
        }
    
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        System.out.print(eavlpost(s));
    }
    
}
