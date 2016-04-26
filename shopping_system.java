import java.util.Scanner;
public class MyShopping {
	//属性
	String name;
	int password;
	Scanner input=new Scanner(System.in);
	//方法
	public void init() //初始化成员变量
	{
		System.out.println("请输入用户名：");
		name=input.next();
		System.out.println("请输入密码：");
		password=input.nextInt();
	}
public void login(){   //登录界面
	System.out.println("欢迎进入登录界面：");
	int count = 1;
	while(count<=3) {
		System.out.println("请输入用户名：");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("请输入密码：");
		int password = input.nextInt();
		if (name.equals("东") && password == 123) {
			System.out.println("登录成功"+name);
			Menu();
			break;
		} else
		{
			System.out.println("输入错误，您还有"+(3-count)+"次机会");
			if(count==0)
				{
			    System.out.println("对不起，你没有机会了");
				System.exit(0);
				}
			count++;
		}
}
	
}
/**主界面
 * 
 */
public void Menu(){ //主界面
	System.out.println("我行我素购物主菜单：");
	System.out.println("***********************");
	System.out.println("1.客户信息管理");
	System.out.println("2.购物结算");
	System.out.println("3.真情回馈");
	System.out.println("4.注销");
	System.out.println("***********************");
	System.out.println("请选择，输入数字：");
	int operation=input.nextInt();//请按数字
	switch (operation) {
	case 1:
		customerInformation();//会员的基本信息
		break;
	case 2:
		ShoppingSettlement();//购物结算
		break;
	case 3:
		feedback();//真情回馈 
		break;
		
	default:
		System.out.println("注销");
		login();
		break;
	}
}
/**
 * 客户基本信息
 */
public void customerInformation(){
	System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
	System.out.println("请输入会员号：");
	int number=input.nextInt();//会员号
	if(number>=1000&&number<=9999){
		System.out.println("请输入会员生日：");
		String birthday=input.next();
		System.out.println("请输入积分：");
		int score=input.nextInt();
		System.out.println("已经录入的信息是：");
		System.out.println(number+"\t"+birthday+"\t"+score);	
		ShoppingSettlement();
	}
}

/**
 * 购物结算
 */
public void ShoppingSettlement() {//购物结算
	System.out.println("请输入是否是会员：是（y）/否（其他字符）");
	Scanner input=new Scanner(System.in);
	String member=input.next();
	if(member.equals("y"))
	{
		System.out.println("请输入购物金额：");
	double money=input.nextDouble();
	double totalMoney=0;
	if(money>=100&&money<200)
	{
		totalMoney=money*0.8;
	}else if(money>200)
	{
		
		totalMoney=money*0.75;
	}else
	{
		totalMoney=money*0.9;
	}
	System.out.println("实际支付："+totalMoney);
	}else//不是会员
	{
		System.out.println("请输入购物金额：");
		double money=input.nextDouble();
		double totalMoney=0;
		if(money>=100&&money<200)
		{
			totalMoney=money*0.9;
		}else if(money>200)
		{
			
			totalMoney=money*0.85;
		}else
		{
			totalMoney=money;
		}
		System.out.println("实际支付："+totalMoney);
	}
	feedback();
		
}

/**
 * 优惠换购活动
 */
public void feedback(){
	System.out.println("请输入消费金额：");
	int consumeMoney=input.nextInt();//消费金额
	System.out.println("是否参加优惠换购活动");
	int addMoney=input.nextInt();//
	//int number=input.nextInt();//请选择
	if(consumeMoney>=200){
		if(addMoney==20){System.out.println("可换购欧莱雅爽肤水一瓶");}
		else if (addMoney==10){System.out.println("一个苏泊尔炒菜锅");}
	}else if(consumeMoney>=100){
		if(addMoney==10){System.out.println("可换购5公斤面粉");}
		else if (addMoney==3){System.out.println("500ml可乐一瓶");}
		else if(consumeMoney>=50){
			if(addMoney==2){System.out.println("百事可乐饮料一瓶");}
		}else
			System.out.println("不能换购任何产品");
	}
}

public static void main(String[] args) {
	MyShopping myshopping=new MyShopping();
	System.out.println("欢迎登录我行我素购物管理系统");
	System.out.println("1.登录");
	System.out.println("2.退出");
	System.out.println("****************************");
	System.out.println("请选择，输入数字：");
	int i=myshopping.input.nextInt();
	switch (i) {
	case 1:
		 myshopping.login();
		break;
	case 2:
		System.exit(0);
		break;
	default:
		System.out.println("输入错误");
	}
}
}
