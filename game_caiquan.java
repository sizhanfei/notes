package test1;

import java.util.Scanner;

public class caiquan {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字（1是石头2是剪刀3是布）：");
		int shuzi=input.nextInt();
		int suijishu=(int) (Math.random()*3+1);
		/*if(shuzi==(int)(Math.random()*3+1))
		{
			System.out.println("平局！");
		}
		else
			if((shuzi==1&&(int)(Math.random()*3+1)==2)||(shuzi==2&&(int)(Math.random()*3+1)==3)||(shuzi==3&&(int)(Math.random()*3+1)==1))
			System.out.println("你赢了");
			else
				System.out.println("你输了！");*/
		if(shuzi==1){
			switch(suijishu){
			case 1:
				System.out.println("平局！");
				break;
			case 2:
				System.out.println("胜利！");
				break;
			case 3:
				System.out.println("失败！");
				break;
				default:
					System.out.println("错误！");
			}}
		else{
			if(shuzi==2)
			{
				switch(suijishu){
				case 1:
					System.out.println("失败！");
					break;
				case 2:
					System.out.println("平局！");
					break;
				case 3:
					System.out.println("胜利！");
					break;
					default:
						System.out.println("错误！");
				}
			}
			else{
				if(shuzi==3)
				{
					switch(suijishu){
					case 1:
						System.out.println("胜利！");
						break;
					case 2:
						System.out.println("失败！");
						break;
					case 3:
						System.out.println("平局！");
						break;
						default:
							System.out.println("错误！");
					}
				}
			}
				
		}
		
		
		}
		

}
