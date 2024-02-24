public class Calculator {
    double account = 0;
    int people;

    double personalAccount(){
        return  account / people;
    }
    Calculator(int people){
        this.people = people;
    }
}
