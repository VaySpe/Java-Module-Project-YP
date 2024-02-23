import java.util.ArrayList;

public class Calculator {
    double account = 0;
    int people;

    double personalAccount(double account, int people){
        return  account / people;
    }
    Calculator(int people){
        this.people = people;
    }
}
