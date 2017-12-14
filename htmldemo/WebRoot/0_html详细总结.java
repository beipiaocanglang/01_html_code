一、html
	由标签组成
	1、简介
		1.1、html是什么？
			Html是用来描述网页的一种语言。
			
			HTML 指的是超文本标记语言 (Hyper Text Markup Language)
			
			HTML 不是一种编程语言，而是一种标记语言 (markup language)
			
			html 标记语言是一套标记标签 (markup tag)
			
			HTML 使用标记标签来描述网页"
		
		1.2、超文本 标记 语言
			超文本：
				笔普通文本强大，但是超越了普通文本的范畴，普通文本不能实现的超文本都能实现，包含超链接的文本
				
			标记：
				就是标签，不同的标签会实现不同的功能
				
			语言：
				人与计算机交互的工具
		
		1.3、html能做什么
			html可以编写网页，把信息展示给我们
		
		1.4、书写规范
			(1) 良好的结构，以html作为根标签，包裹着head和body
			(2) html标签是以尖括号包括关键字成对出现的，有开始标签有结束标签，能支持正确的嵌套
			(3) 大部分标签有属性 格式：属性="属性值"多个属性之间使用空格隔开
			(4) 空标签 功能比较单一 不需要含有标签体 <br></br>  ==  <br/>
			(5) html不区分大小写 但是建议写成小写

			需求：
				写一段文字，将其中部分文字改变颜色改变字号
			例如：
				<html>
					<head></head>
					<body>
						我请大家<font color="red" size="5">吃饭</font>，大家很高兴，<br/>所以大家没人给了我一百块钱
					</body>
				</html>
	
	2、基本标签
		2.1、文件标签(结构标签)
			<html>:就是一个根标签
			
			<head>:写一些资讯信息
				页面的整体属性标签：<title>页面的标题
				
				指导解析器解析html的标签：<meta http-equiv="content-type" content="text/html; charset=UTF-8">
				
				引入外部文件的标签：<link rel="stylesheet" type="text/css" href="styles.css">
				
				seo的搜索优化：<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
			
			<body>:写一些需要展示的内容和标签
 				属性：
 					text:  body中的文本的颜色
				
 					bgcolor: body的背景颜色
				
 					background: 背景图片
		
		2.2、排版标签
			换行标签：<br/>
			段落标签：<p>文本内容</p>
				特点：段誉段之间有空行
				属性：
					align:对齐方式
					取值：left(默认值)/center/rigth
					
		2.3、水平线标签
			<hr/>:产生一条水平线
			属性：
				width:长度(默认占父标签的100%)
				size：高度(粗细)
				color：颜色
				align：对齐方式
					取值：left/center(默认值)/rigth
			
			颜色和长度的写法：
				 颜色：
				 	英文单词：red、green、pink等
				 	rgb写法：rgb(0,0,0),数字的范围0~255
				 	16进制写法(开发中常用)：#000000  #ffffff
				 	注意：
				 		使用工具来识别颜色
				 长度:
				 	像素的写法：300px(默认)
				 	
				 	百分比写法：50%(父标签的百分比)
				 	
				 	两者的区别：	
				 		百分比会随着父标签的变化而变化，
				 		像素写法始终占固定的比例	
		2.4、注释标签：
			<!-- -->
		
		2.5、块标签
			<div>:行级块标签(自动换行)
				属性：align
				取值：left(默认值)、center、right
				作用：用于div+css布局
				
			<span>:行内块标签(正行)
				作用：例如：注册页面的有好提示
		
		2.6、文字标签
			基本文字标签：<font>
				属性：
					color：颜色
					size：字体大小
						最大：7号
						最小：1号
						默认：3号
					face：文字类型（宋体、微软雅黑等等）
					
		2.7、标题标签:<h1>-<h6>
			特点：
				依次减小
				占据一行
				有内置的字号
				自动加粗
				
			标题标签作用：
				书写页面的标题
		
		2.8、清单标签（列表标签）
			无序标签：<ul>--<li>
				ul属性：type
				取值：
					disc：（默认值）
					square：实心方块
					circle：空心圆点
					
			有序标签
				<ol>--<li>
				ol属性：
					type：表示列表前的顺序标志
						取值：A、I、a、i、1(默认值)
					start：从哪个位置开始
						取值：数字
						
			清单标签的作用：
				实现横向和纵向的菜单
				生成简单列表
		2.9、图像标签：<img/>
			属性：
				scr:指定图片路径
				alt：图片的文字说明(在图片未加载或加载失败或将鼠标放在图像上时用于显示的文字)
				width：长度
				heigth：宽度
				border：边框
				align：对齐方式
					取值：
						left：左对齐
						rigth:右对齐
						center:失效
					
					以下三个取值的作用是指相邻的文字相对于图片的位置
						top:文字在图片的上面
						bottom:文字在图片的下面
						middle:文字在图片右边
		1.10、链接标签：<a></a>
			<a>显示的内容(也可以是图片)</a>
			
			属性：
				href：跳转的地址
				name：名称(锚点)
					例如：
						在页面顶端：<a name="top"></a>
						在页面底部：<a href="#top">置顶</a>
				target：控制是否开启新页
					取值：
						_self(默认值):在当前页打开
						_blank：在新的页面打开				
					
					其他功能：
						在框架标签<frameset>时使用，在指定的区域块中打开
						
		1.11、表格标签
			表格标签：<table></table>
				属性：
					border：边框
					width：表格的长度
					align：对齐方式
					bgcolor：背景颜色
				
				<tr>：代表表格中的行
					align：对齐方式
					bgcolo：背景颜色
					
				<td>：代表行中的单元格
					属性：
						rowspan:行合并
						cols：列合并
				<th>:代表表头，默认样式居中、加粗
				
				<caption>:代表表格标题	
			作用：
				1、单纯的做表格
				2、做网页的布局
		
		1.12、上午练习bookstore
			详见bookstoredemo.html
			
	3、表单标签
		<form>:仅仅声明这是一个表单
			属性：
				action：提交的url的地址
				name：表单名称
				method：提交方式
					取值：
						POST：将数据封装到http请求的请求体中进行提交
						GET(默认值)：将数据显示到地址栏进行提交
			POST/GET提交的区别：
				1、get数据显示在地址栏上，而post不显示
				2、get提交相对不安全，而post提交相对安全
				3、get提交有大小限制，一句浏览器的不同而不同
			      post没有大小限制(例如上传图片)
						
		<input>:输入框
			属性：
				value：input标签的默认值  
				
				checked="checked"：默认选中其中一个
				
				name：表单项的名称
				
				type：值不同代表的功能不同
					取值:
						text:普通的输入框				
						
						password：密码输入框，输入的内容不可见
						
						radio:单选按钮(例如男/女)
							checked="checked"、默认选中其中一个
							注意：name值必须一致，才能成为一组互斥
						
						checkbox：多选按钮
							checked="checked"、默认选中其中一个
							注意：name值必须一致，才能成为一组互斥
						
						file：文件上传
						
						submit：提交按钮
						
						reset：重置按钮，点击的时候恢复默认值
						
						button：普通按钮
						
						image：图片按钮
							src:必须包含一个src属性，指定按钮图片的路径
							功能：与submit是一样的
							
						hidden：隐藏域
							作用：服务器需要但是不让用户看到的数据
		<select>：表示一个下拉列表
		
		<option>：代表一个下拉框内的选项
			selected="selected"，当前默认被选择
			注意：
				select中的name属性值等于option中的value值				
		
		<textarea>:代表一个多行文本域					
			属性;
				clos:列数
				rows：行数
			注意：
				默认的内容写在两个标签中间
	
	4、框架标签
		见图1
		<frameset>：表示是一个框架
			属性：
				rows：按照行进行分割
				clos：按照列进行分割
				*:代表剩余的全部
			注意:
				<frameset>标签的位置是和<body>标签同级
				
		<frame>:代表最终的一块区域，是<frameset>标签的字标签
			属性：
				name：名称
				src：要加载页面的地址		
			注意：
				不能自闭和
				不能有结束标签	
				target="right",在指定的右侧打开链接

	5、其他标签
		5.1、其他标签
			<base>：在head标签内使用
				属性：
					href:指定统一的域名(跳转路径)
				例如：
					<base href="http://www.baidu"></base>
					在页面中所用的链接之前都会自动加上这个链接
			<head>:写一些资讯信息
				页面的整体属性标签：<title>页面的标题
				
				指导解析器解析html的标签：<meta http-equiv="content-type" content="text/html; charset=UTF-8">
				
				引入外部文件的标签：<link rel="stylesheet" type="text/css" href="styles.css">
				
				seo的搜索优化：<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">	
		
		5.2、特殊字符
			&nbsp;代表空格
			&gt;代表大于号
			&lt;代表小于号
			&copy;代表版权符号(圆圈中一个c)
			&reg;代表注册商标(圆圈中一个R)
	
二、css
	对html的美化

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




三、javascript(js)
	动态的添加或修改html标签和css样式
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
四、jQuery
	是js的一个封装
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
五、mysql
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	