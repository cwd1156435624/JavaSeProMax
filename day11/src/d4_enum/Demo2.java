package d4_enum;

public class Demo2 {
    public static void main(String[] args) {
        sendMeg(Festival.NEW_YEAR);
        sendMeg(Festival.NATIONAL_DAY);
    }

    public static void sendMeg(Festival festival){
        switch (festival){
            case NEW_YEAR :
                System.out.println("新年快乐");
                break;
            case NATIONAL_DAY:
                System.out.println("国庆快乐");
                break;
        }
    }
}
