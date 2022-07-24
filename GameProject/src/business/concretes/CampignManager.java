package business.concretes;

import java.util.List;
import java.util.Optional;

import business.abstracts.CampaignService;
import dataAccess.abstracts.BaseRepository;
import entity.concretes.Campaign;

public class CampignManager implements CampaignService{
	private final BaseRepository<Campaign> baseRepository;

	public CampignManager(BaseRepository<Campaign> baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	public void add(Campaign campaign) {
		baseRepository.update(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		baseRepository.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		getById(campaign.getId()).ifPresent(campaign1->baseRepository.delete(campaign));
		
	}

	@Override
	public Optional<Campaign> getById(int id) {
		return baseRepository.getById(id);
	}

	@Override
	public List<Campaign> getAll() {
		return baseRepository.getAll();
	}
	
	
}
