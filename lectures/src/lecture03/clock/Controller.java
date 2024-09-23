package lecture03.clock;

public class Controller {
    void control(Model m, View v) {
        v.show(m.whatTimeIsIt());
    }
}
