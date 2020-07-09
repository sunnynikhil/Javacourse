/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.missingpangram.missingcharacters;

/**
 *
 * @author oyo
 */

public class strstr {
    public static int strstr(String a,String b){
        int n = a.length();
        int m = b.length();
        
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            { if(a.charAt(i+j)!=b.charAt(j))
                    break;
            
            }
            if(j==m)
                return i;
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(strstr(a,b));
    }
}
