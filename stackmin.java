/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 *
    int minEle;
    Stack<Integer> s;

    /*returns min element from stack*/
    int getMin()
    {
	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	  if(s.isEmpty())
	       { return 0;
	           
	       }
	 Integer t = s.pop();
	 if(t<minEle)
	 {
	    int temp=minEle;
	    minEle=2*minEle-t;
	    return temp;
	 }
	 else
	 {
	     return t;
	 }
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	if(s.empty()==true)
	{
	    minEle=x;
	    s.push(x);
	    return;
	}
	else if(x<minEle)
	{
	    s.push(2*x-minEle);
	    minEle=x;
	    return;
	}
	else
	  s.push(x);
	  return;
	  
    }