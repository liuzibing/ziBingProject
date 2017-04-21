package com.bing.entity;

/**
 * 宠物类
 * @author 刘紫兵
 *
 * 2017年4月21日
 */

public class Pet {

	private static final int UPPER_LIMIT_VALUE = 1000;// 上限值1000

	private int qqid; // QQ账号qqid
	private String name; // 宠物昵称name
	private String gender; // 性别gender，取值为QGG或QMM
	private int grade; // 宠物等级grade
	private int growth; // 成长点growth
	private int power; // 体力值power
	private int intellect; // 智力值intellect
	private int charm; // 魅力值charm
	private int hunger; // 饥饿度hunger
	private int cleaning; // 清洁度cleaning

	public int getQqid() {
		return qqid;
	}

	public void setQqid(int qqid) {
		this.qqid = qqid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getIntellect() {
		return intellect;
	}

	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}

	public int getCharm() {
		return charm;
	}

	public void setCharm(int charm) {
		this.charm = charm;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getCleaning() {
		return cleaning;
	}

	public void setCleaning(int cleaning) {
		this.cleaning = cleaning;
	}

	/*
	 * QGG：小鱼儿 等级：58，成长点：53921 武力值：5395，智力值：5276，魅力值：4669
	 * 饥饿度：610/1000，清洁度：782/1000 注意：可以在字符串中使用“\n”来表示换行符。
	 */
	@Override
	public String toString() {
		return "-------------------------------------------------\n" 
				+ gender + ":" + name + "\n等级:" + grade + "\t 成长点:"
				+ growth + "\n武力值:" + power + "\t智力值:" 
				+ intellect + "\t 魅力值:" + charm + "\n饥饿度:" + hunger
				+ "/1000\t 清洁度:" + cleaning + "/1000" 
				+ "\n-------------------------------------------------";
	}

	public Pet() {
		super();
	}

	public Pet(int qqid, String name, String gender, int grade, int growth, int power, int intellect, int charm,
			int hunger, int cleaning) {
		super();
		this.qqid = qqid;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		this.growth = growth;
		this.power = power;
		this.intellect = intellect;
		this.charm = charm;
		this.hunger = hunger;
		this.cleaning = cleaning;
	}

	// 喂养feed，喂养需要一个食物，根据食物的能量值增加宠物的饥饿度，但是不能超过饥饿度的上限值1000。喂养还能增加宠物的1点成长值。
	public void feed(Food food) {
		System.out.println("上完课肚子好饿，买份" + food.getName() + "来吃，瞬间精力充沛！");
		int energy = this.getHunger() + food.getEnergy();
		if (energy >= UPPER_LIMIT_VALUE) {
			this.setHunger(UPPER_LIMIT_VALUE);
		} else {
			this.setHunger(energy);
		}
		this.setGrowth(this.getGrowth() + 1);
		String info = this.getName() + "的饥饿度为：" + this.getHunger() + "\t成长值为：" + this.getGrowth();
		System.out.println(info);
	}

	// 清洁clean，清洁需要一个清洁用品，根据清洁用品的能量值增加宠物的清洁度，但是不能超过清洁度的上限值1000。清洁还能增加宠物的1点成长值。
	public void clean(Detergent detergent) {
		System.out.println("天气这么热，用" + detergent.getName() + "洗个澡，浑身香喷喷！");
		int energy = this.getCleaning() + detergent.getEnergy();
		if (energy >= UPPER_LIMIT_VALUE) {
			this.setCleaning(UPPER_LIMIT_VALUE);
		} else {
			this.setCleaning(energy);
		}
		this.setGrowth(this.getGrowth() + 1);
		String info = this.getName() + "的清洁度为：" + this.getCleaning() + "\t成长值：" + this.getGrowth();
		System.out.println(info);
	}

	// 学习study，学习需要指定一门课程，根据课程的类型增加宠物的体力值或智力值或魅力值，同时还能增加宠物的1点成长值。
	// 相应的类型取值分别为"A:体力"、"B：智力"、"C:魅力"
	public void study(Course course) {
		String name = this.getName();
		String info = "";
		String upWhat = "";
		switch (course.getType()) {
		case 'A':
			this.setPower(this.getPower() + course.getEnergy());
			info = name + "的体力值为：" + this.getPower();
			upWhat = "体力...";
			break;
		case 'B':
			this.setIntellect(this.getIntellect() + course.getEnergy());
			info = name + "的智力值为：" + this.getIntellect();
			upWhat = "智力...";
			break;
		case 'C':
			this.setCharm(this.getCharm() + course.getEnergy());
			info = name + "的魅力值为：" + this.getCharm();
			upWhat = "魅力...";
			break;
		default:
			info = "什么都没有增加。。。。这书是白念了";
			upWhat = "nothing...";
			break;
		}
		this.setGrowth(this.getGrowth() + 1);
		System.out.println("早睡早起精神好，本宝宝要开开心心去上一堂" + course.getName() + "课，提升" + upWhat);
		System.out.println(info + "\t成长值：" + this.getGrowth());
	}

	//一天结束，睡觉去。。。
	public void sleep() {
		System.out.println("愉快的一天结束了，宝宝的成长看得见>>>>>>");
	}

}
