import java.util.Scanner;
public class Student {
String [] studentName=new String[5];//学生姓名
Scanner input=new Scanner(System.in);
public void init(){//初始化
	for (int i = 0; i < studentName.length; i++) {
		System.out.print("请输入学生姓名：");
		studentName[i]=input.next();
	}
	System.out.println("本班学生列表是：");
	for (int i = 0; i < studentName.length; i++) {
		System.out.print("\t"+studentName[i]);
	}
}
public void find(int start,int end,String name){
	System.out.println("*********查找结果***********");
	for (int i = start; i <= end; i++) {
		if(name.equals(studentName[i])){
			System.out.println("找到");
			break;
		}
		else
		{
			System.out.println("没有找到");
		}
	}
}
public static void main(String[] args) {
	Student student=new Student();
	student.init();
	System.out.println("\n");
	System.out.print("请输入开始查找的位置：");
	Scanner input=new Scanner(System.in);
	int start=input.nextInt();
	System.out.print("请输入结束查找的位置：");
	int end=input.nextInt();
	System.out.print("请输入查找的名字：");
	String findname=input.next();
   student.find(start, end, findname);	
}
} 
