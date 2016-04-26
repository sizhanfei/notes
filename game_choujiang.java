package test1;

import java.util.Scanner;

public class choujiang {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("<我行我素购物管理系统>幸运抽奖\n\n");
		System.out.println("请输入一个四位的会员号：");
		int haoma=input.nextInt();
		int baiweishuzi=0;
		baiweishuzi=(haoma%1000)/100;
		System.out.println("请输入幸运数字：");
		int xingyunshuzi=input.nextInt();
		if(baiweishuzi==xingyunshuzi)
		{
			System.out.println(haoma+"号客户是幸运客户，获精美MP3一个！");
		}
		else
			System.out.println(haoma+"号客户，谢谢您的支持！");
	}


}
