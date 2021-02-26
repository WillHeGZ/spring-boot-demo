package xyz.gzzh.spring.demo.injection.setinjection;

public class ServiceA {
    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
        System.out.println("A setter B");
    }
}
