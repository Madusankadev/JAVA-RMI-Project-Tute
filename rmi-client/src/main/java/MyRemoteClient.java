import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteService");

            System.out.println(service.testService());
            System.out.println(service.getDate());
            System.out.println(service.sayHello("Madhushankha"));
            System.out.println(service.add(4, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
