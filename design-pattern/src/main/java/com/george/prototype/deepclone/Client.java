package com.george.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("原型模式完成对象的创建");
		Sheep sheep = new Sheep("tom", 1, "白色");

		sheep.friend = new SheepFriend("jack", 2, "黑色");
		
//		Sheep sheep2 = sheep.clone(); //克隆
//		Sheep sheep3 = sheep.clone(); //克隆
//		Sheep sheep4 = sheep.clone(); //克隆
//		Sheep sheep5 = sheep.clone(); //克隆


		Sheep sheep2 = sheep.deepClone(); //克隆
		Sheep sheep3 = sheep.deepClone(); //克隆
		Sheep sheep4 = sheep.deepClone(); //克隆
		Sheep sheep5 = sheep.deepClone(); //克隆
		
		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());

	}

}
