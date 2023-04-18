/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thanh
 */
public class StudentThang extends Student{
    public ArrayList <Student> ls = new ArrayList<>(); //Statement to declare list student
    public int add(Student st){ //This function adds student
        ls.add(st);
        return 1;
    }
    public List<Student> getAllStudent(){
        return ls;
    }
     public Student getStudentByID (int id){ 
        for (Student st: ls){
            if (st.getStudentId() == id){
                return st;
            }
        }
        return null;
    }
    public int delStudentById(int ma){
        for (Student st : ls){
            if (st.getStudentId() == ma){ //This function passes a String parameter to enter the Student Id code, when it matches the Id you want, it will run and delete the student.
                ls.remove(st);
                return 1;
            }
        }
        return -1;
    }
   
    public int updateStudentByID(Student stNew){
        for (Student st : ls){
            if(st.getStudentId() == stNew.getStudentId()){
                st.setAddress(stNew.getAddress());
                st.setSex(stNew.isSex());
                st.setBirthday(stNew.getBirthday());
                st.setName(stNew.getName());
                st.setEmail(stNew.getEmail());
                return 1;
            }
        }
        return -1;
    }
}
