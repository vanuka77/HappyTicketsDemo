package Util;

public class OutPut {

    public void printInstruction() {
        System.out.println("Введите путь к файлу");
    }

    public void printError() {
        System.err.println("Некоректные данные");
    }

    public void printErrorSetMethod() {
        System.err.println("Не удалось определить тип билета!");
    }

    public void printContinueInstruction() {
        System.out.println("Чтобы продолжить введите y/yes");
    }

    public void printResult(int result) {
        System.out.println("Ответ : " + result + ".");
    }
}
