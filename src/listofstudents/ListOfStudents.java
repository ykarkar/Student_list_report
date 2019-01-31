/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 yash karkar
 hiiii
 */

package listofstudents;

/**
 *
 * @author shaim
 */
public class ListOfStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.setId(1111);
        s1.setName("Shaimaa");
    
        Student s2 = new Student();
        
        Student s3 = new Student("John",2222);
        
        System.out.println("BEFORE s1 ==> Name: "+s1.getName() + " Id= "+ s1.getId());
        System.out.println("BEFORE s2 ==> Name: "+s2.getName() + " Id= "+ s2.getId());
        System.out.println("BEFORE s3 ==> Name: "+s3.getName() + " Id= "+ s3.getId());
 
        Student[] studentList = new Student[5];
        
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = new Student("ABC",123);
        studentList[4] = new Student("XYZ",456);
                
        studentList[0] = new Student("Tom",7777);
        System.out.println("Printing from the array");
        for(int i=0; i<studentList.length ; i++)
            System.out.println(i + " ==> Name: "+studentList[i].getName() + " Id= "+ studentList[i].getId());
 
        s1 = new Student ("Smith", 8888);
        System.out.println("AFTER s1 ==> Name: "+s1.getName() + " Id= "+ s1.getId());
        System.out.println("AFTER s2 ==> Name: "+s2.getName() + " Id= "+ s2.getId());
        System.out.println("AFTER s3 ==> Name: "+s3.getName() + " Id= "+ s3.getId());
 
    }
    
}
