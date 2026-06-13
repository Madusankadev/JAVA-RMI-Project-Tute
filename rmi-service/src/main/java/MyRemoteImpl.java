import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException{

    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("remoteService", service);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String testService() throws RemoteException {
        return "working!. Response from service";
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name;
    }

    @Override
    public String getDate() throws RemoteException {
        return String.valueOf(new Date());
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
}
