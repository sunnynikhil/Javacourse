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
public class Heap {
    
    public static void heapify(int arr[], int n,int start){
        
        int largrest=start;
        int l=2*start+1;
        int r=2*start+2;
        
        if(l<n && arr[l]<arr[largrest])
            largrest=l;
        if(r<n && arr[r]<arr[largrest])
            largrest=r;
        
        if(largrest!=start){
            int swap=arr[start];;
            arr[start]=arr[largrest];
            arr[largrest]=swap;
            
            heapify(arr,n,largrest);
        }
    
}
    public static void printtree(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int deletenode(int arr[],int n,int key){
       
        int last=arr[n-1];
        int pos=0;
        for(int i=0;i<n;i++)
            if(arr[i]==key)
                pos=i;
        arr[pos]=last;
        n=n-1;
        heapify(arr,n,pos);
        return n;
    }
    public static int insertnode(int arr[],int n,int data){
        n=n+1;
        arr[n-1]=data;
        
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);
        return n;
    }
//    public static void heap(int arr[],int n,int i){
//       int parent= (i-1)/2;
//       System.out.println("n="+parent);
//       if(arr[parent]>0)
//       {
//           if(arr[i]<arr[parent]){
//               int swap=arr[i];
//               arr[i]=arr[parent];
//               arr[parent]=swap;
//               
//               heap(arr,n,parent);
//           }
//       }
//        
//        
//    }
    public static void main(String[] args){
//         arr= {8,7,6,3,2,1};
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=6;
        arr[4]=7;
        arr[5]=8;
        
        int n=6;
        n=insertnode(arr,n,3);
//        System.out.println("nn="+n);
        printtree(arr,n);
    }
}
