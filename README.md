# ---
班级：计G191 姓名 : 崔长江 学号：2019322045
# JAVA实验报告五
## 一、实验目的:

1.使用GUI窗体及其组件设计窗体界面
2.完成学生选课过程业务逻辑编程
3.基于文件保存并读取数据
4.处理异常

## 二、实验要求

1.设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作
2.基于事件模型对业务逻辑编程，实现在界面上支持上述操作
3.针对操作过程中可能会出现的各种异常，做异常处理
4.基于输入/输出编程，支持学生、课程、教师等数据的读写操作

## 三、实验步骤

1.在实验三中的基础上添加事件监听以实现学生的登陆注册
2.实现选课退课的基本文件的输入和输出
3.打印已选课程信息

## 核心代码：

String user = new String();
		String passworld = new String();
		user = txt1.toString();
		passworld = txt2.toString();
		if (txt1.getText().equals("1") && txt2.getText().equals("1")) {
			Main windtow=new Main();
			windtow.setVisible(true);
		} else {
			System.out.print("您输入的密码错误");
		}
    
    
  String str = TX3.getText();  
        byte bt[] = new byte[1024];  
        bt = str.getBytes();  
            FileOutputStream in = new FileOutputStream(a); 
        e1.printStackTrace();     
  

## 运行截图：
请看图  不知道怎么导进来  没有中文翻译  英语差

## 四、实验心得
 时间过的是挺快，java课程也是很有意思，但是吧，现在的社会，GUI窗体已经落后了，是不是可以考虑引入一些新的东西，专升本之前，更多的上机实验课，
 来了这边后更多的是实践课，理论很重要，我觉得实践一样重要，是不是平时写的代码比较少，所以理论性的东西知道的多一些，但是却不能很好的写出自己
 想要的东西，希望以后可以设置更多一点的实验课。
