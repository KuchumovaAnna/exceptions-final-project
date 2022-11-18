import Presenter.Presenter;
import view.ConsoleView;
import view.View;

public class Prog 
    {
        public static void main(String[] args) {
            Presenter<View> prog = new Presenter<View>(new ConsoleView());
            prog.start();
        }
}
