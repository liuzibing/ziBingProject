package com.bing.entity;

/**
 * 清洁用品类Detergent
 * @author 刘紫兵
 *
 * 2017年4月21日
 */
public class Detergent{
	
	private String name;//清洁用品名称name
	private int energy;//清洁用品的能量值energy
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
	public Detergent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detergent(String name, int energy) {
		super();
		this.name = name;
		this.energy = energy;
	}
	@Override
	public String toString() {
		return "Detergent [清洁用品名称=" + name + ", 清洁用品的能量值=" + energy + "]";
	}
	
}
