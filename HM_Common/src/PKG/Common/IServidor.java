package PKG.Common;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServidor extends Remote{
    
    public String holaMundo() throws RemoteException;
    
}
