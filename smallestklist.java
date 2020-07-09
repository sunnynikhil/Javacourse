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
public class smallestklist {
    
    static int N=5;
    static int ptr[] = new int[501];
    
    public static void findSmallestRange(int a[][],int n,int k){
        
        int i,minval,maxval,minrange=Integer.MAX_VALUE,minel=0,maxel=0,flag,minind;
        for(i=0;i<=k;i++)
            ptr[i]=0;
        while(true){
            minind=-1;
            minval=Integer.MAX_VALUE;
            maxval = Integer.MIN_VALUE;
            flag=0;
            for(i=0;i<k;i++)
            {
                if(ptr[i]==n){
                    flag=1;
                    break;
                }
                if(ptr[i]<n && a[i][ptr[i]]<minval)
                    {
                   minval=a[i][ptr[i]];
                    minind=i;
                }
                if(ptr[i]<n && a[i][ptr[i]]>maxval)
                    maxval=a[i][ptr[i]];
                
            }
            
            if(flag==1)
                break;
            ptr[minind]++;
            if((maxval-minval)<minrange){
                minrange=maxval-minval;
                minel=minval;
                maxel=maxval;
            }
        }
        System.out.print(minel+""+maxel);
    }
    public static void main(String[] args){
        int arr[][] = { 
            { 4, 7, 9, 12, 15 }, 
            { 0, 8, 10, 14, 20 }, 
            { 6, 12, 16, 30, 50 } 
        }; 
  
        int k = arr.length; 
  
        findSmallestRange(arr, N, k); 
    }
    
}
