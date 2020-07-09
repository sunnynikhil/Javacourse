/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;

/**
 *
 * @author oyo
 */
public class unqiuerows {
    public static void printArray(int arr[][],int r,int c)
    {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<r;i++)
        {
            String s="";
            for(int j=0;j<c;j++)
            {
                if(j!=c-1)
                {s+=arr[i][j];
                 s+=" ";
                }
                else
                {
                  s+=arr[i][j];
                 s+=" $";  
                }
                    
            }
            if(!set.contains(s))
            {set.add(s);
            System.out.print(s);
            }
            
                
        }
        
    }
    public static void main(String[] args) { 
          
        int arr[][] = { {1 ,1, 0, 1},
                        {1, 0, 0, 1},
                        {1 ,1 ,0 ,1}
        };
          
        printArray(arr, 3, 3); 
    }
    
}
