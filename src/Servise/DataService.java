package Servise;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;

public class DataService {
    private ArrayList<User> studentList = new ArrayList<>();
    private ArrayList<User> teacherList = new ArrayList<>();

    public void Create(User user){
        if (user instanceof Student){
            Student student1 = new Student(user.getName(), user.getAge(), user.getAddress(), studentList.size()+1);
            studentList.add(student1);
        } else {
            Teacher teacher1 = new Teacher(user.getName(), user.getAge(), user.getAddress(), teacherList.size()+1);
            teacherList.add(teacher1);
        }
    }

    public ArrayList<User> Read(String type){
        if (type.equals("Student")){
            return studentList;
        } else {
            return teacherList;
        }
    }







}
