package xyz.gzzh.spring.demo.injection.setinjection;

public class ServiceB {
    private ServiceA serviceA;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
        System.out.println("B setter A");
    }
}
