package firstAssignment.entities;

public class RequestParameter {
    private double principal;
    private double rate;
    private int time;

    public RequestParameter() {
    }

    public RequestParameter(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RequestParameter{" +
                "principal=" + principal +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }


    public double simpleInterest (RequestParameter requestParameter) {
        return (requestParameter.principal*requestParameter.rate*requestParameter.time)/100;
    }

    public double simpleInterest2 () {
        return (this.principal*this.rate*this.time)/100;
    }

}
