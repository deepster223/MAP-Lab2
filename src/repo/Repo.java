package repo;

import model.ProgramState;

import java.util.ArrayList;
import java.util.List;

public class Repo implements IRepo {
    List<ProgramState> myProgramState;

    public Repo() {
        myProgramState = new ArrayList<>();
    }

    @Override
    public ProgramState getProgramState(int option) {
        return myProgramState.get(0);
    }

    public void addProgramState(ProgramState programState) {
        myProgramState.add(programState);
    }
}
