import firstAssignment.entities.RequestParameter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        RequestParameter req = new RequestParameter(230.23,2.0,2);

        System.out.println(req);
        System.out.println(req.simpleInterest2());
        System.out.println(req.simpleInterest(req));
    }




    //"Simple interest = (P*R*T)/100"
//    P type double;
//    R type R double
//    T interger
}