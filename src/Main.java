import logic.Person;
import ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Cameron", "7194602828", "18820 Saint Andrews Drive, Monument, CO 80132");
        System.out.println(person);
        UserInterface ui = new UserInterface();
        ui.run();
    }
}
