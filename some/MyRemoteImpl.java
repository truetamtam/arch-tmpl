import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by truetamtam on 27.05.15.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements IMyRemote {
    @Override
    public String sayHi() {
        return "some hi";
    }

    public MyRemoteImpl() throws RemoteException {}

    public static void main(String[] args) {

        try {
            IMyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHi", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
