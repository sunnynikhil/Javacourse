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
class Student{
    private int id;
    private String name;
    
    public Student(int id, String name){
        super();
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
              
    }
    public String getName(){
        return name;
    }
    

}
class sortbyId implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.getId()-b.getId();
    }
}
public class JavaLists {
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        List<Student> studentList = new ArrayList<Student>();
        while(t-->0){
            int id=in.nextInt();
            String name=in.next();
            Student st = new Student(id,name);
            studentList.add(st);
        }
        
        Collections.sort(studentList,new sortbyId());
        for(Student st : studentList)
            System.out.println(st.getId()+"="+st.getName());
        
        
    }
    
    
}
