import Controller.Controller;
import Data.Student;
import Data.Teacher;
import Servise.DataService;
import View.StudentView;
import View.TeacherView;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", 2000, "Москва", 0);
        Student student2 = new Student("Петр", 2001, "Серпухов", 0);

        Teacher teacher1 = new Teacher("Михаил", 1982, "Петербург", 0);
        Teacher teacher2 = new Teacher("Дмитрий", 1987, "Протвино", 0);

        Controller controller = new Controller();
        controller.Create(student1);
        controller.Create(student2);
        controller.Create(teacher1);
        controller.Create(teacher2);

        System.out.println(" ");

        StudentView studentView = new StudentView(controller);
        studentView.ReadeStV();

        System.out.println(" ");

        TeacherView teacherView = new TeacherView(controller);
        teacherView.readTeV();



    }
}
