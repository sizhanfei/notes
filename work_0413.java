/*
 功能：循环输入客户姓名
 （当输入Y时 记录客户名字 输入N时 结束）
 时间：2016年4月13日19:12:23
 作者：司展飞
 */
package homework;

import java.util.HashSet;
import java.util.Scanner;

public class work_0413 {
	HashSet<String> name = new HashSet<String>();
	public HashSet<String> tianjiamingzi() { 
        Scanner input=new Scanner(System.in);
        boolean condition; 
        int i = 0;
        do {
            System.out.print("请输入客户的姓名：");
            this.name.add(input.next());
            System.out.print("继续输入吗?（y/n）:");
            String choose =input.next(); 
            if ("y".equals(choose)) {
                condition = true;
            } else {
                condition = false;
            }
            i++;
        } while (condition);
        return this.name;
    }
    public void xianshimingzi() {
        System.out.println("\n客户姓名列表");
        for (String names : this.name) {
            System.out.print(names + "\t");
        }
    }
	public static void main(String[] args){
		work_0413 kehu= new work_0413();
	        kehu.tianjiamingzi();
	        kehu.xianshimingzi();

	}
}
