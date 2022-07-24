package entity.concretes;

import entity.abstracts.Entity;

public class Game implements Entity{

	private int id;
	private String name;
	private String description;
	private double price;
	
	Campaign campaign;
	
	

	public Game() {
		
	}



	public Game(int id, String name, String description, double price, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.campaign = campaign;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Campaign getCampaign() {
		return campaign;
	}



	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	public String toString() {
		 return "Game{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", price=" + price +
	                ", campaign=" + campaign + '\'' +
	                '}';
	
	}
	
	
}
