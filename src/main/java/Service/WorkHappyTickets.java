package Service;

public class WorkHappyTickets {
    public int moskovCount() {
        int count = 0;
        int firstFigure;
        int secondFigure;
        int thirdFigure;
        int fouthFigure;
        int fifthFigure;
        int sixthFigure;
        for (int i = 0; i <= 999999; i++) {
            firstFigure = i / 100000;
            secondFigure = i / 10000 - firstFigure * 10;
            thirdFigure = i / 1000 - firstFigure * 100 - secondFigure * 10;
            fouthFigure = i / 100 - firstFigure * 1000 - secondFigure * 100 - thirdFigure * 10;
            fifthFigure = i / 10 - firstFigure * 10000 - secondFigure * 1000 - thirdFigure * 100 - fouthFigure * 10;
            sixthFigure = i - fifthFigure * 100000 - secondFigure * 10000 - thirdFigure * 1000 - fouthFigure * 100 - fifthFigure * 10;
            if (firstFigure + secondFigure + thirdFigure == fouthFigure + fifthFigure + sixthFigure) {
                count++;
            }
        }
        return count;
    }

    public int piterCount() {
        int count = 0;
        int firstFigure;
        int secondFigure;
        int thirdFigure;
        int fouthFigure;
        int fifthFigure;
        int sixthFigure;
        for (int i = 0; i <= 999999; i++) {
            firstFigure = i / 100000;
            secondFigure = i / 10000 - firstFigure * 10;
            thirdFigure = i / 1000 - firstFigure * 100 - secondFigure * 10;
            fouthFigure = i / 100 - firstFigure * 1000 - secondFigure * 100 - thirdFigure * 10;
            fifthFigure = i / 10 - firstFigure * 10000 - secondFigure * 1000 - thirdFigure * 100 - fouthFigure * 10;
            sixthFigure = i - fifthFigure * 100000 - secondFigure * 10000 - thirdFigure * 1000 - fouthFigure * 100 - fifthFigure * 10;
            if (firstFigure + thirdFigure + fifthFigure == secondFigure + fouthFigure + sixthFigure) {
                count++;
            }
        }
        return count;
    }
}
