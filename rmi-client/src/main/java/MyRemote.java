import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String testService() throws RemoteException;
    public String sayHello(String name) throws RemoteException;
    public String getDate() throws RemoteException;
    public int add(int a, int b) throws RemoteException;
}
