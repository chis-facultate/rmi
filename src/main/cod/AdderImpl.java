import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImpl extends UnicastRemoteObject implements Adder {
    protected AdderImpl() throws RemoteException {
        super();
    }

    @Override
    public int[] add(int[] a, int[] b) throws RemoteException {
        int[] c = new int[a.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i] + b[i];
        }
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        return c;
    }
}
