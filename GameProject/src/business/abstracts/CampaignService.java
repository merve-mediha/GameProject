package business.abstracts;

import java.util.List;
import java.util.Optional;

import entity.concretes.Campaign;

public interface CampaignService {
	 void add(Campaign campaign);
	 void update(Campaign campaign);
	 void delete(Campaign campaign);
	 Optional<Campaign> getById(int id);
	 List<Campaign> getAll();
}
