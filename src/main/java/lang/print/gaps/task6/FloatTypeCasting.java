package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int integerPart =(int) numberToBeRounded;
        float floatingPart = numberToBeRounded-integerPart;

        if(floatingPart>=0.5)
            System.out.println(++integerPart);
        else
            System.out.println(integerPart);
    }
}
