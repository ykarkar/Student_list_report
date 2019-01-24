package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
  private String name;
  private int id;
  
  
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
      this.id = givenId;
  }
  public int getId()
  {
      return id;
  }
  
}
