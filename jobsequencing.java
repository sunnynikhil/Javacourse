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
class job implements Comparable<job>{
    int id;
    int deadline;
    int profit;
    job(int id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    @Override
    public int compareTo(job o) {
        if(this.profit<o.profit)
            return 1;
        return 0;//To change body of generated methods, choose Tools | Templates.
    }
    
}

class jobComparator implements Comparator<job> {
    public int compare(job j1, job j2){
        if(j1.profit > j2.profit)return -1;
        if(j1.profit < j2.profit)return 1;
        return 0;
    }
}
public class jobsequencing {
    public static void jobsequnence(job arr[],int n){
        Arrays.sort(arr, new jobComparator());
        int res=0, count=0;
        int[] result = new int[n];
        boolean[] slot = new boolean[n];
        Arrays.fill(slot, false);
        
        
        for (int i=0; i<n; i++) { 
            for (int j=Integer.min(n, arr[i].deadline)-1; j>=0; j--) { 
                if (slot[j]==false) { 
			        result[j] = i; // Add this job to result 
			        slot[j] = true; // Make this slot occupied 
			        break; 
		        } 
	        } 
	    } 
	    for (int i=0; i<n; i++) 
	        if(slot[i]) {
	            count++;
	            res += arr[result[i]].profit;
	    }
	    System.out.print(count + " " + res);
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        job[] arr = new job[n];
        for(int i=0;i<n;i++)
        {
            int id = in.nextInt();
            int deadline = in.nextInt();
            int profit = in.nextInt();
            arr[i]=new job(id,deadline,profit);
            
        }
        jobsequnence(arr,n);
    }
}
