# JavaWeb

## 1、基本概念

### 1.1 前言

web开发：

- web，网页的意思，www.baidu.com

- 静态web

  - html，css
  - 提供给所有人看的数据始终不会发生变化

- 动态web

  - 淘宝，几乎是所有网站；
  - 提供给所有人的数据始终会发生变化，每个人在不同的时间，不同的地点看到的信息各不相同。
  - 技术栈：Servlet/JSP，ASP，PHP。

  在java中，动态web资源开发的技术统称为javaweb

### 1.2 web应用程序

web应用程序：可以提供浏览器访问的程序；

- a.html，b.html....多个web资源，这些web资源可以被外界访问，对外界提供服务。
- 你们能访问到的任何一个页面或者资源，都存在于世界的某个角落的计算机上。
- URL（统一资源定位符）
- 这个统一的web资源会被放在同一个文件夹下，web应用程序-->Tomcat:服务器
- 一个web应用由多部分组成（静态web，动态web）
  - html，css，js
  - jsp，servlet
  - java程序
  - jar包
  - 配置文件（Properties）

web应用程序编写完毕后，若想提供给外界访问：需要一个服务器统一管理。

### 1.3 静态web

- *.html，*.html,这些都是网页的后缀，如果服务器上一直存在这些东西，我们就可以直接进行读取。同络

![image-20220224231426540](readme.assets/image-20220224231426540.png)

- 静态web存在的缺点

  - web页面无法动态更新，所有用户看到都是同一个页面
    - 轮播图，点击特效：伪动态
    - JavaScript[实际开发中，它用的最多]
    - VBScript
  - 它无法和数据库交互（数据无法持久化，用户无法交互）
  
  ### 1.4 动态web
  

页面会动态展示：”Web的页面展示效果因人而异“

![image-20220224232034187](readme.assets/image-20220224232034187.png)

缺点

- 加入服务器的动态web资源出现了错误，我们需要重新编写我们的**后台程序**，重新发布；
  - 停机维护

优点

- web页面可以动态更新，所有用户看到都不是同一个页面
- 它可以和数据库交互（数据无法持久化：注册，商品信息，用户信息）

![image-20220224232325576](readme.assets/image-20220224232325576.png)

## 2、web服务器

### 2.1 技术讲解

**ASP:**

- 微软：国内最早流行的就是ASP；

- 在html中嵌入了VB的脚本，ASP + COM；

- 在ASP开发中，基本一个页面都有几千行的业务代码，页面及其混乱。

- 维护成本高

  ```html
  <h1>
      <h1><h1>
          <h1>
              <% System.out.println();
          </h1>
          </h1>
  	<h1><h1>  
  <h1>    
  ```

**php:**

- PHP开发速度很快，功能很强大，跨平台，代码简单（70%，WP）
- 无法承载大访问量的情况（局限性）；

**Jsp/Servlet:**

B/S：浏览器和服务器

C/S：客户端和服务器

- sun公司主推的B/S架构

- 基于java语言的（所有的大公司，或者一些开源的组件，都是用java写的）

- 可以承载三高问题带来的影响。高并发，高可用，高性能。

- 语法像ASP，ASP-->JSP,加强市场强度。

  ### 2.2 web服务器

  服务器是一种被动的操作，用来处理用户的一些请求和给用户一些响应信息；

  

  **lls**

  微软的；ASP本土的东西，Windows中自带的

  **tomcat**

  ![image-20220224234529707](readme.assets/image-20220224234529707.png)

  Tomcat是Apache软件基金会(Apache Software Foundation)的Jakarta项目中的一个核心项目，最新的Servlet和SP规范总是能在Tomcat中得到体现，因为Tomcat 技术先进、性能稳定，而且免费，因而深受Java爱好者的喜爱并得到了部分软件开发商的认可，成为目前比较流行的Web应用服务器。

  Tomcat服务器是一个免费的开放源代码的Web应用服务器，属于轻量级应用服务器，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试SP程序的首选。对于一个Java初学web的人来说，它是最佳的选择。

  Tomcat 实际上运行SP页面和Servlet。Tomcat最新版本为9.0。

  **工作3-5年，可以尝试手写Tomcat服务器；**
  
  

## 3. Tomcat

### 3.1 安装tomcat

官网https://tomcat.apache.org/

![image-20220225154803120](readme.assets/image-20220225154803120.png)

解压

![image-20220225154816077](readme.assets/image-20220225154816077.png)

### 3.2 Tomcat启动和配置

文件夹作用：

![image-20220225155223517](readme.assets/image-20220225155223517.png)

启动，关闭tomcat



![image-20220225155350268](readme.assets/image-20220225155350268.png)

访问测试：http://local host:8080/

可能遇到的问题：

1、java环境变量没有配置

2、闪退问题：需要配置兼容性。

3、乱码问题：配置文件中的设置。startup.bat

### 3.3 配置

![image-20220225155747628](readme.assets/image-20220225155747628.png)

可以配置启动端口号

```xml
<Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
```

- tomcat的默认端口号：8080
- mysql:3306
- https:443
- http:80

可以配置主机的名字

- 默认的主机名为：localhost ->127.0.0.1
- 默认网站应用存放的位置为：webapps

```xml
<Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
```



### 高难度面试题

请你谈谈网站是如何进行访问的！

1、输入你个域名；回车

2、检查本机的C:\Windows\System32\drivers\etc\hosts配置文件下有没有这个域名映射；

- 有：直接返回对应的ip地址，这个地址中，有我们需要访问的web程序，可以直接访问。

  ```java
  	127.0.0.1       localhost
  ```

- 没有：去DNS服务器找，找到的话就返回，找不到就返回找不到；

  ![image-20220225161801704](readme.assets/image-20220225161801704.png)



4.可以配置一下环境变量（可选项）

### 3.4 发布一个web网站

- 将自己写的网站，放到服务器（Tomcat）中指定的web应用的文件夹（webapps）下，就可以访问了。

网站应有的结构

```java
--webapps : tomcat 服务器的web目录
	-ROOT
	-TEST ：网站的目录名
	 	- WEB-INF
	 		-class:java程序
	 		-lib：web应用所依赖的jar包
	 		-web.xml：网站配置文件
	 	- index.html：默认首页
	 	- static
	 		-css
	 			-style.css
	 		-js
	 		-img
	 	-.....
```



## 4、HTTP

### 4.1 什么是HTTP

HTTP（超文本传输协议）是一个简单的请求-响应协议，它通常运行再TCP(传输控制协议)

​					UDP（协议报文传输）

- 文本：html，字符串，~....
- 超文本：图片，音乐，视频，地位，地图......
- 80

Https:安全的

- 443

### 4.2 两个时代

- http1.0
  - HTTP/1.0：客户端可以和web服务器连接后，只能获得一个web资源，断开连接。
- http2.0
  - HTTP/1.1：客户端可以和web服务器连接后，可以获得多个web资源。

### 4.3 Http请求

- 客户端---发请求---服务器

百度：

```java
Request URL:https://www.baidu.com/Request
Method :GET
status code : 200 oK
Remote Address : 14.215.177.39:443
```

```java
Accept:text/html
Accept-Encoding:gzip，deflate，br
Accept-Language :zh-cN , zh; q=0.9 语言
cache-contro1 :max-age=O
connection : keep-alive
```



#### 1、 请求行

- 请求行中的请求方式：GET
- 请求方式：**Get/Post**，HEAD，DELETE，PUT，TRACT...
  - get：请求能够携带的参数比较少，大小由限制，会在浏览器的URL地址栏显示数据内容，不安全，但高效。
  - post：请求能够携带的参数没有限制，大小没有限制，不会在浏览器的URL地址栏显示数据内容，安全，但不q高效。

#### 2、消息头

```java
Accept:text/html  告诉浏览器，它所支持的数据类型
Accept-Encoding:gzip，deflate，br  支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
Accept-Language :zh-cN , zh; q=0.9 告诉浏览器语言环境
cache-contro1 :max-age=O 缓存控制
connection : keep-alive 告诉浏览器，请求完成是断开还是保持连接
```



### 4.4 Http响应

- 服务端---响应----客户端

百度：

```java

Cache-Control private //缓存控制
Connection	keep-alive //连接
Content-Encoding:gzip // 编码
Content-Type text/html;// 类型
```

#### 1、响应体

```java
Accept:text/html  告诉浏览器，它所支持的数据类型
Accept-Encoding:gzip，deflate，br  支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
Accept-Language :zh-cN , zh; q=0.9 告诉浏览器语言环境
cache-contro1 :max-age=O 缓存控制
connection : keep-alive 告诉浏览器，请求完成是断开还是保持连接
refrush:告诉客户端，多久刷新一次
location：让网页重新定位；
```

#### 2、响应状态码

200：请求响应成功

3**：请求重定向

- 重定向：你重新到我给你的新位置

4**：找不到资源

- 资源部存在；

5**：服务器代码错误  500  502网关错误



常见面试题：

当你的浏览器中地址栏输入地址并回车的一瞬间到页面能够展示回来，经历了什么？

## 5、Maven

**我们为什么要学习这个技术**

1、在javaweb开发中，需要使用大量的jar包，我们手动去导入；

2、如何能够让一个东西自动帮我导入和配置这个jar包

由此，Maven诞生了。

### 5.1 Maven项目架构管理工具

我们目前用来就是方便导入jar包的！

Maven的核心思想：**约定大于配置**

- 有约束，不要去违反

Maven会规定号你该如何去编写我们的java代码，必须按照这个约定来。



### 5.2 下载安装Maven

官网：https://maven.apache.org/

![image-20220225171229485](readme.assets/image-20220225171229485.png)

下载完成后，解压即可；

建议：电脑上的所有的环境都放在一个文件夹下；



### 5.3 环境配置

在我们的系统环境变量中

配置如下配置：

- M2_HOME  maven目录下的bin目录
- MAVEN_HOME maven的目录
- 在系统的path中配置 %MAVEN_HOME%\bin

### 5.4 阿里云镜像

- 镜像：mirrors
  - 作用：加速我们的下载
- 国内建议使用阿里云的镜像

```xml
<mirror>
     <id>alimaven</id>
     <name>aliyun maven</name>
     <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
     <mirrorOf>central</mirrorOf>
</mirror>
```

### 5.5 本地仓库

在本地的仓库，远程仓库： 

**建立一个本地仓库：**

```xml
<localRepository>D:\apache-maven-3.8.2_repository</localRepository>
```

### 5.6 在IDEA中使用Maven

​	1. 启动idea

​	2. 创建一个Maven项目

​	![image-20220225175223708](readme.assets/image-20220225175223708.png)

![image-20220225175405399](readme.assets/image-20220225175405399.png)

3.等待项目初始化完毕

![image-20220225223407791](D:\21.04.14\javaweb\readme.assets\image-20220225223407791.png)

![image-20220225223423064](D:\21.04.14\javaweb\readme.assets\image-20220225223423064.png)

4. 观察Maven仓库多了什么东西？

5. idea中的Maven的设置

idea项目创建成功后，看一眼Maven的配置

![image-20220225223740617](D:\21.04.14\javaweb\readme.assets\image-20220225223740617.png)

![image-20220225223952297](D:\21.04.14\javaweb\readme.assets\image-20220225223952297.png)

6. 到这里，Maven在idea中的配置和使用就完成了。

### 5.7 创建一个普通的Maven项目



![image-20220225224236770](D:\21.04.14\javaweb\readme.assets\image-20220225224236770.png)

<img src="D:\21.04.14\javaweb\readme.assets\image-20220225224447653.png" alt="image-20220225224447653" style="zoom:200%;" />

![image-20220225224556554](D:\21.04.14\javaweb\readme.assets\image-20220225224556554.png)

这个只有在web应用下才有。

### 5.8 标记文件夹功能

​	1 .  

![image-20220225224919960](D:\21.04.14\javaweb\readme.assets\image-20220225224919960.png)

2. 

![image-20220225225121369](D:\21.04.14\javaweb\readme.assets\image-20220225225121369.png)

![image-20220225225221629](D:\21.04.14\javaweb\readme.assets\image-20220225225221629.png)

![image-20220225225257391](D:\21.04.14\javaweb\readme.assets\image-20220225225257391.png)

### 5.9 在idea中配置Tomcat

![image-20220225225415147](D:\21.04.14\javaweb\readme.assets\image-20220225225415147.png)

![image-20220225225455894](D:\21.04.14\javaweb\readme.assets\image-20220225225455894.png)

![image-20220225225538863](D:\21.04.14\javaweb\readme.assets\image-20220225225538863.png)

![image-20220225225711771](D:\21.04.14\javaweb\readme.assets\image-20220225225711771.png)



解决警告问题：

**为什么会有这个问题：我们访问一个网站，需要指定一个文件夹名字**



![image-20220225225740946](D:\21.04.14\javaweb\readme.assets\image-20220225225740946.png)



![image-20220225230051964](D:\21.04.14\javaweb\readme.assets\image-20220225230051964.png)

![image-20220225230109911](D:\21.04.14\javaweb\readme.assets\image-20220225230109911.png)

![image-20220225230231459](D:\21.04.14\javaweb\readme.assets\image-20220225230231459.png)

### 5.10 pom文件

pom.xml 是Maven的核心配置文件

![image-20220225230717351](D:\21.04.14\javaweb\readme.assets\image-20220225230717351.png)

![image-20220225231328497](D:\21.04.14\javaweb\readme.assets\image-20220225231328497.png)

![image-20220225231549043](D:\21.04.14\javaweb\readme.assets\image-20220225231549043.png)

maven由于它的约定大于配置，我们之后可能遇到我们写的配置文件，无法被导出或者生效的问题。

解决方案：

```xml
<! --build中配置resources，来防止我们资源导出失败的问题-->
<build>
	<resources>
        <resource>
            <directory>src/main/ resources</directory><excludes>
            <excludes>
                <exclude>**/*.properties</exclude>
                <exclude>**/*.xml</exclude>
            </excludes>
            <filtering>false</filtering> 
        </resource>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering></ resource>
         </resource>
	</resources>
</build>
```



### 5.11 idea操作

![image-20220225232730516](D:\21.04.14\javaweb\readme.assets\image-20220225232730516.png)

![image-20220225232805427](D:\21.04.14\javaweb\readme.assets\image-20220225232805427.png)

### 5.13 解决遇到的问题

1. Maven 3.6.2

   解决方法：降级为3.6.1

   ![image-20220225233016172](D:\21.04.14\javaweb\readme.assets\image-20220225233016172.png)

2. Tomcat闪退

   ​	

3. Idea中每次都要重复配置Maven

   在idea中的全局默认配置中去配置

   ![image-20220225234422638](D:\21.04.14\javaweb\readme.assets\image-20220225234422638.png)

   ![image-20220225234055324](D:\21.04.14\javaweb\readme.assets\image-20220225234055324.png)

4. Maven项目中Tomcat无法配置

5. maven默认web项目中的web.xml版本问题

   ![image-20220225234824555](D:\21.04.14\javaweb\readme.assets\image-20220225234824555.png)

6. 提花你为webapps4.0版本和tomat一致

7. Maven仓库的使用

   地址：https://mvnrepository.com/

   ![image-20220225235645390](D:\21.04.14\javaweb\readme.assets\image-20220225235645390.png)

![image-20220225235850108](D:\21.04.14\javaweb\readme.assets\image-20220225235850108.png)

![image-20220226000039631](D:\21.04.14\javaweb\readme.assets\image-20220226000039631.png)

![image-20220226000043214](D:\21.04.14\javaweb\readme.assets\image-20220226000043214.png)
