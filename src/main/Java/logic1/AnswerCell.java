package logic1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep) {
            return false;
        }

        if (isMorning && !isMom) {
            return false;
        }

        return true;

//        if (!isMorning & isMom & !isAsleep)
//            return true;
//
//        if (isMorning & isMom & isAsleep)
//            return false;
//
//        if (isMorning & isMom & !isAsleep)
//            return true;
//
//
//        if (!isMorning & !isMom & isAsleep)
//            return false;
//
//        if (!isMorning & !isMom & !isAsleep)
//            return true;
//
//        if (isMorning & !isMom & !isAsleep)
//            return false;
//
//        else return false;

    }


}
