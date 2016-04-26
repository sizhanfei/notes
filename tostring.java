案例一
public class Work {
  String name;
  int age;
  public void run(){
	  System.out.println(name+"开始跑步");
  }
  public static void main(String[] args) {
	Work worker=new Work();
	worker.run();
	System.out.println(worker);
}
}



案例二、

import javax.management.ObjectName;
public class Work {
  String name;
  int age;
  public void run(){
	  System.out.println(name+"开始跑步");
  }
 @Override
	public String toString() {  
           //该方法是字符串类型的，所以返回值也是字符串类型
		return super.toString();
	}
 
  public static void main(String[] args) {
	Work worker=new Work();
	worker.run();
	System.out.println(worker);
}
}


案例三

import javax.management.ObjectName;
public class Work {
  String name;
  int age;
  public void run(){
	  System.out.println(name+"开始跑步");
  }
 @Override
	public String toString() {  
           //该方法是字符串类型的，所以返回值也是字符串类型
		return "姓名:"+name+"\t年龄："+age;
	}
 
  public static void main(String[] args) {
	Work worker=new Work();
	worker.name="张三";
	worker.age=20;
	worker.run();
	System.out.println(worker);
}
}
