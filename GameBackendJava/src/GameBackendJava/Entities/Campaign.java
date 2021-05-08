package GameBackendJava.Entities;

import GameBackendJava.Abstract.Entity;

public class Campaign implements Entity{

	private int id;
	private String campaignName;
	private String description;
	private int discountRate;
	
	public Campaign(int id, String campaignName, String description, int discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.description = description;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
}
