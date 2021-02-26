package xyz.gzzh.spring.demo.injection.setinjection;

public class TestClient {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.setServiceB(serviceB);
        serviceB.setServiceA(serviceA);
    }
}
