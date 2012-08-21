package jp.co.dhw.review2;

public class User {
	
	public Integer id; 
	public String firstName;
	public String lastName;


	//mainで呼び出し
	public static void main (String[] args){
		
		showName(); //表示のクラス呼び出し
		this.id = null; //変数id初期化
		this.firstName = null; //変数firstName初期化
		this.lastName = null; //変数lastName初期化

	}

	//表示用クラスshowName
	public void showName(){

		getName(str);
		System.out.println(firstName ":" lastName);

	}


	public void setFirstName(String name){
		this.firstName = name;
	}


	public void setLastName(String name){
		this.lastName = name;
	}

	//名前代入用クラスgetName
	public void getName(String[] str){

		Person p1 = new Person();
		p1.id("1");
		p1.setFirstName("武田");
		p1.setLastName("憲隆");

		Person p2 = new Person();
		p2.id("2");
		p2.setFirstName("高木");
		p2.setLastName("香");


		Person p3 = new Person();
		p3.id("3");
		p3.setFirstName("徳永");
		p3.setLastName("裕介");


		Person p4 = new Person();
		p4.id("4");
		p4.setFirstName("柴田");
		p4.setLastName("伊織");


		Person p5 = new Person();
		p5.id("5");
		p5.setFirstName("酒見");
		p5.setLastName("真悟");


		Person p6 = new Person();
		p6.id("6");
		p6.setFirstName("竹末");
		p6.setLastName("国崎");


		Person p7 = new Person();
		p7.id("7");
		p7.setFirstName("割鞘");
		p7.setLastName("洋介");


		Person p8 = new Person();
		p8.id("8");
		p8.setFirstName("榎枝");
		p8.setLastName("大悟");


		Person p9 = new Person();
		p9.id("9");
		p9.setFirstName("武田");
		p9.setLastName("憲隆");


		Person p10 = new Person();
		p10.id("10");
		p10.setFirstName("武田");
		p10.setLastName("憲隆");

	}

}