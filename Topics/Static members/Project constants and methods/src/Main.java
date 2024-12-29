public class Main {

    public static void main(String[] args) {
        String firstConst = ConstantsAndUtilities.A_CONSTANT_TTT;
        String secondConst = ConstantsAndUtilities.B_CONSTANT_QQQ;
        String third = ConstantsAndUtilities.getMagicString();
        String fourth = ConstantsAndUtilities.convertStringToAnotherString("aa");
        System.out.println(firstConst+"\n"+secondConst+"\n"+third+"\n"+fourth);
    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}