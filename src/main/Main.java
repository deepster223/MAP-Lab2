package main;

import controller.InterpretorControl;
import repo.IRepo;
import repo.Repo;
import view.View;

public class Main {
    public static void main(String[] args) {
        IRepo repo = new Repo();
        InterpretorControl controller = new InterpretorControl(repo);
        controller.populate();
        View UI = new View(controller);

        System.out.println(repo.getProgramState().getOutput());
    }
}
