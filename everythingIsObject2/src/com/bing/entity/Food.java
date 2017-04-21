package com.bing.entity;

/**
 * 食物类Food
 * @author 刘紫兵
 *
 * 2017年4月21日
 */

public class Food {
	
	private String name;//食物名称name
	private int energy;//食物的能量值energy
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int energy) {
		super();
		this.name = name;
		this.energy = energy;
	}
	@Override
	public String toString() {
		return "Food [食物名称=" + name + ", 食物的能量值=" + energy + "]";
	}

}
