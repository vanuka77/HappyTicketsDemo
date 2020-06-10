package Controller;

import Service.FileRead;
import Service.WorkHappyTickets;
import Util.Input;
import Util.OutPut;
import Validator.ArgumentValidator;

import java.io.File;
import java.io.IOException;

public class Controller {

    boolean isWorked = false;

    OutPut outPut = new OutPut();
    WorkHappyTickets workHappyTickets = new WorkHappyTickets();
    FileRead fileRead = new FileRead();
    File file;

    public void run(String[] args) {
        String choice = "";
        String isContinued = "y";
        while (isContinued.equals("y") || isContinued == "yes") {
            if (!ArgumentValidator.areArguments(args) || isWorked) {
                outPut.printInstruction();
                file = new File(Input.inputString());
            } else {
                file = new File(args[0]);
            }
            try {
                choice = fileRead.readFromFile(file);
            } catch (IOException e) {
                outPut.printError();
            }
            if (choice.equals("Moskov")) {
                outPut.printResult(workHappyTickets.piterCount());
            } else if (choice.equals("Piter")) {
                outPut.printResult(workHappyTickets.moskovCount());
            } else {
                outPut.printErrorSetMethod();
            }
            isWorked = true;
            choice="";
            outPut.printContinueInstruction();
            isContinued = Input.inputString().toLowerCase();
        }
    }
}
