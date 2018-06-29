import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);


        model.setValue(inputIntValueWithScanner(sc));
        model.addIntOurValue(" " + inputIntValueWithScanner1(sc));

        view.printMessageAndInt(View.OUR_STRING, model.getValue());
    }

    public String inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_FIRST_DATA);

        while( !sc.hasNext(View.FIRST_WORD)) {
                view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_FIRST_DATA);
                sc.next();
        }

        return sc.next();
    }

    public String inputIntValueWithScanner1(Scanner sc1) {
        view.printMessage(View.INPUT_SECOND_DATA);

        while( !sc1.hasNext(View.SECOND_WORD)) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_SECOND_DATA);
            sc1.next();

        }

        return sc1.next();
    }
}
