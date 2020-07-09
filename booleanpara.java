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

public class booleanpara {

    public static int counttrues(char[] s,char[] o,int n){
        
        int t[][] = new int[n][n];
        int f[][] = new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            t[i][i]=(s[i]=='T')? 1:0;
            f[i][i]=(s[i]=='F')? 1:0;
            
        }
        for(int gap=0;gap<n;++gap){
            for(int i=0,j=gap;j<n;++i,++j){
                t[i][j]=f[i][j]=0;
                for(int g=0;g<gap;g++){
                    int k =i+g;
                    int tik = t[i][k]+f[i][k];
                    int tkj = t[k+1][j] + f[k+1][j];
                    
                    if(o[k]=='&'){
                        
                      t[i][j] += t[i][k] * t[k + 1][j]; 
                        f[i][j] += (tik * tkj - t[i][k] * t[k + 1][j]); 
                    } 
                    if (o[k] == '|')  
                    { 
                        f[i][j] += f[i][k] * f[k + 1][j]; 
                        t[i][j] += (tik * tkj - f[i][k] * f[k + 1][j]); 
                    } 
                }
            }
        }
        return t[0][n-1];
    }
    public static void main(String[] args){
        char symbols[] = "TF".toCharArray(); 
        char operators[] = "|&".toCharArray(); 
        int n = symbols.length; 
        System.out.print(counttrues(symbols,operators,n));
    }
}
