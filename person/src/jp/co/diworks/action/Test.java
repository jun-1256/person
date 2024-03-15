package jp.co.diworks.action;

public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-1111";
		taro.address = "北海道";
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "000-2222-3333";
		jiro.address = "沖縄";
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "000-4444-5555";
		hanako.address = "神奈川";
		
		Person jun = new Person();
		jun.name = "坂本潤";
		jun.age = 24;
		jun.phoneNumber = "090-6796-8974";
		jun.address = "東京";
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println("\n"+jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println("\n"+hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println("\n"+jun.name);
		System.out.println(jun.age);
		System.out.println(jun.phoneNumber);
		System.out.println(jun.address);
		jun.talk();
		jun.walk();
		jun.run();
		System.out.println("\n"+aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println("\n"+asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println("\n"+pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}

}
