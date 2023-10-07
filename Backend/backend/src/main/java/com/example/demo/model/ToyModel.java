 package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToyModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pid;
	String link;
	String category;
	String brand;
	String age;
	String des;
	int price;
	int dprice;
	int save;
	public int getPid() {
		return pid;
	}
	public void setPid(int id) {
		this.pid = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDes() {
		return des;
	}
	public void setDesc(String des) {
		this.des = des;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDprice() {
		return dprice;
	}
	public void setDprice(int dprice) {
		this.dprice = dprice;
	}
	public int getSave() {
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	
	public ToyModel(int id, String link, String category, String brand, String age, String des, int price, int dprice,
			int save) {
		super();
		this.pid = id;
		this.link = link;
		this.category = category;
		this.brand = brand;
		this.age = age;
		this.des = des;
		this.price = price;
		this.dprice = dprice;
		this.save = save;
	}
	
	public ToyModel() {
		
	}
}
