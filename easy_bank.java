package homework;

import java.util.Scanner;

public class work_0413_1 {
	public static void main(String[] args){
		banK bank=new banK();
		bank.caidan();
	}

}

class banK{
	int i=0;//定义余额的初始值
	Scanner input=new Scanner(System.in);
	public void caidan(){
		System.out.println("1.存款 2.取款 3.退出");
		System.out.print("请输入你要办理的业务：");
		int xuanxiang=input.nextInt();
		switch(xuanxiang){
		case 1:
			cunkuan();
			break;
		case 2:
			qukuan();
			break;
		case 3:
			tuichu();
			break;
		}
	}
	public void cunkuan(){
		System.out.print("请输入存款金额：");
		int cunkuanjine=input.nextInt();
		System.out.println("存款成功！");
		i+=cunkuanjine;
		System.out.println("***当前余额为"+i+"元***");
		caidan();
	}
	public void qukuan(){
		System.out.print("请输入取款金额：");
		int qukuanjine=input.nextInt();
		i=i-qukuanjine;
		System.out.println("***当前余额为"+i+"元***");
		caidan();
	}
	public void tuichu(){
		System.out.println("谢谢使用！");
	}
}
