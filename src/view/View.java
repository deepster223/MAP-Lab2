package view;

import controller.InterpretorControl;

import java.util.Scanner;

public class View {
    private InterpretorControl controller;
    private Scanner input;

    public View(InterpretorControl controller) {
        this.controller = controller;
        input = new Scanner(System.in);
    }

    public void showOptions() {
        System.out.println("\t\t1. v=2;Print(v)");
        System.out.println("\t\t2. a=2+3*5;b=a+1;Print(b)");
        System.out.println("\t\t3. a=2-2;(If a Then v=2 Else v=3);Print(v) ");
    }

    public void showMenu() {
        System.out.println("Enter the program number: ");
        showOptions();
        String choice = input.nextLine();
        int option;
        try {
            option = Integer.parseInt(choice);
            option--;
        } catch (NumberFormatException e) {
            option = -1;
        }
        controller.setOption(option);

        /*
        VariableExpression exp1 =
                new ArithmeticExpression('+', new ConstantExpression(2),
                        new ArithmeticExpression('*', new ConstantExpression(3),
                                new ConstantExpression(5)));
        CompoundStatement st1 =
                new CompoundStatement(
                        new AssignmentStatement('v', new ConstantExpression(2)),
                        new PrintStatement(new VariableExpression('v')));
        CompoundStatement st2 =
                new CompoundStatement(new AssignmentStatement('a', exp1),
                        new CompoundStatement('b', exp3),
                        new PrintStatement(new VariableExpression('b')));
    }
    */


    }
}
