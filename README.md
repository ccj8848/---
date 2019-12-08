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
  

运行截图：
















四、实验心得

本学期我们进行了五次Java 实验，经过这五次实验，我深切体会到投身实践的重要性。在本次实验中综合性的归纳了以往学过的知识点，
整合已学知识编写本次实验程序。通过本次实验，我系统的再次了解和应用gui框体、事件监听、异常处理、文件保存与读取的逻辑编程。
在本次实验的过程中，我认识到自己在实践中的不足，缺乏相应的知识与经验，对所学专业知识不能够很好的应用。所以在同班同学们的帮
助下，熟悉并完成了代码编写，同时让我对程序设计有了成就感与兴趣感。希望通过这段时间的学习，能给以后的工作奠定坚持的基础。
