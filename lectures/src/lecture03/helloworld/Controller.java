package lecture03.helloworld;

public class Controller {
    void control(Model m, View v) {
        v.show(m.createGreetings());
    }
}
