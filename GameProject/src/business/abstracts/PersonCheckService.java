package business.abstracts;

import java.rmi.RemoteException;

import entity.concretes.Player;

public interface PersonCheckService {
	boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
