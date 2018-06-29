public class View {
    // Text's constants
    public static final String INPUT_FIRST_DATA = "Input first value = ";
    public static final String INPUT_SECOND_DATA = "Input second value = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_STRING = "OUT value = ";
    public static final String FIRST_WORD = "Hello";
    public static final String SECOND_WORD = "world!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, String value){
        System.out.println(message + value);
    }
}
