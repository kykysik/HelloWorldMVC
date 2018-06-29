public class Model {
    private String value;

    // The Program logic

    public String addIntOurValue(String valueString){
        return value += valueString;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
