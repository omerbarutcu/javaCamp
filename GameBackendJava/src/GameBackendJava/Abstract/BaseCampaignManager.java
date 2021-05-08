package GameBackendJava.Abstract;

import GameBackendJava.Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya eklendi " + campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya silindi " + campaign.getCampaignName());
		
	}

}
