package lecture03.temperature;

public class View {
    double getTemperature() {
        return 0.0;
    }

    void showTemperature(double c, double f) {
        System.out.println("섭씨 " + c + "도를 화씨로 바꾸면 " + f + "도입니다.");
    }
}
