package com.bing.entity;

/**
 * 课程类Course
 * @author 刘紫兵
 *
 * 2017年4月21日
 */

public class Course {
	private String name;//课程名称name
	private char type;//课程类型type，课程分为不同的类型，分别增加体力、智力和魅力值，相应的类型取值分别为"A:体力"、"B：智力"、"C:魅力"
	private int energy;//能力增长值energy
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, char type, int energy) {
		super();
		this.name = name;
		this.type = type;
		this.energy = energy;
	}
	@Override
	public String toString() {
		return "Course [课程名称=" + name + ", 课程类型=" + type + ", 能力增长值=" + energy + "]";
	}
	
	
}
