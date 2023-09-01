package util;

public final class CommonUtil {
    private CommonUtil(){

    }
    public static String maskAccNumber(String accNumber) {
        return "******"+ accNumber.substring(accNumber.length()-4);
    }
}
