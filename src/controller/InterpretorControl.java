package controller;

import domain.adt.MyDictionary;
import domain.adt.MyList;
import domain.adt.MyStack;
import model.ProgramState;
import model.expression.ArithmeticExpression;
import model.expression.ConstantExpression;
import model.statement.*;
import repo.IRepo;

public class InterpretorControl {
    IRepo repo;
    int option;

    public InterpretorControl(IRepo repo) {
        this.repo = repo;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void allStep() {
        ProgramState programState = repo.getProgramState();
        while (!programState.getExecStack().isEmpty()) {
            executeOneStep(repo.getProgramState());
        }
    }

    public ProgramState executeOneStep(ProgramState programState) {
        MyStack<IStatement> stack = programState.getExecStack();
        if (stack.isEmpty()) {
            throw new RuntimeException("Exec stack is empty");
        }
        IStatement currentStatement = stack.pop();
        return currentStatement.execute(programState);
    }



    public void populate() {

        MyStack<IStatement> exeStack = new MyStack<>();
        MyDictionary<String, Integer> symTable = new
                MyDictionary<>();
        MyList<Integer> output = new MyList<>();
        IStatement op = new PrintStatement(new ConstantExpression(100));

        IStatement originalProgram = new IfStatement(new ConstantExpression
                (10),
                new CompoundStatement(new AssignmentStatement("v", new
                        ConstantExpression(5)), new PrintStatement(new
                        ArithmeticExpression( '/',new ConstantExpression(3),
                        new
                                ConstantExpression(3)))), new PrintStatement
                (new ConstantExpression(100)));

        exeStack.push(originalProgram);
        ProgramState ps = new ProgramState(op,exeStack,symTable,output);

        repo.addProgramState(ps);
    }
}
