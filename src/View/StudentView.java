package View;

import Controller.Controller;

public class StudentView {
    protected Controller controller;

    public StudentView(Controller controller) {
        this.controller = controller;
    }

    public void ReadeStV() {
        System.out.println(this.controller.Read("Student"));
    }

    @Override
    public String toString() {
        return "StudentView{" +
                "controller=" + controller +
                '}';
    }
}
