package View;

import Controller.Controller;

public class TeacherView {
    protected Controller controller;

    public TeacherView(Controller controller) {
        this.controller = controller;
    }

    public void readTeV() {
        System.out.println(this.controller.Read("Teacher"));
    }

    @Override
    public String toString() {
        return "TeacherView{" +
                "controller=" + controller +
                '}';
    }
}
