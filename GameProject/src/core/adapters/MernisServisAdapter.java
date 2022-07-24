package core.adapters;

import java.rmi.RemoteException;

import business.abstracts.PersonCheckService;
import entity.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServisAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentity()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthOfYear());
	}

}
