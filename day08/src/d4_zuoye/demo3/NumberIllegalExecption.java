package d4_zuoye.demo3;

public class NumberIllegalExecption extends Exception{
    public NumberIllegalExecption(NumberIllegalExecption e) {
    }

    public NumberIllegalExecption(String message) {
        super(message);
    }
}
