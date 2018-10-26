package repo;

import model.ProgramState;

public interface IRepo {
    ProgramState getProgramState(int option);
    void addProgramState(ProgramState programState);
}
