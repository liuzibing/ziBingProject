package com.bing.entity.test;

import com.bing.entity.Course;
import com.bing.entity.Detergent;
import com.bing.entity.Food;
import com.bing.entity.Pet;

/**
 * 测试类，程序入口
 * @author 刘紫兵
 *
 * 2017年4月21日
 */
public class PetTest {

	public static void main(String[] args) {
		// 1、创建宠物对象，为宠物设置各属性值，显示宠物信息。
		// QGG：小鱼儿 等级：58，成长点：53921 武力值：5395，智力值：5276，魅力值：4669
		// 饥饿度：610/1000，清洁度：782/1000
		Pet pet = new Pet(123456, "小鱼儿", "QGG", 58, 53921, 2110, 5276, 4669, 610, 782);
		System.out.println(pet);
		// 2、创建一个课程对象，设置课程各属性值，让宠物学习这门课程，并显示相应信息。
		// 相应的类型取值分别为"A:体力"、"B：智力"、"C:魅力"
		Course course = new Course("《Java程序设计》", 'A', 100);
		System.out.println(course);
		// 3、创建一个食物对象，设置食物各属性值，给宠物喂养这个食物，并显示相应信息。
		Food food = new Food("海鲜盖浇饭", 120);
		System.out.println(food);
		// 4、创建一个清洁用品对象，设置清洁用品各属性值，用这个清洁用品给宠物洗澡，并显示相应信息。
		Detergent detergent = new Detergent("宝宝金水", 40);
		System.out.println(detergent);
		// 5、经过上述各种活动，显示宠物的最新状态。
		System.out.println("-------------------------------------------------");
		// 早睡早起精神好，本宝宝要开开心心去上一堂《Java程序设计》课，提升智力
		pet.study(course);
		System.out.println("-------------------------------------------------");
		// 上完课肚子好饿，买份海鲜盖浇饭来吃，瞬间精力充沛！
		pet.feed(food);
		System.out.println("-------------------------------------------------");
		// 天气这么热，用宝宝金水洗个澡，浑身香喷喷！
		pet.clean(detergent);
		System.out.println("-------------------------------------------------");
		// 愉快的一天结束了，宝宝的成长看得见——
		pet.sleep();
		System.out.println(pet);
	}
}
