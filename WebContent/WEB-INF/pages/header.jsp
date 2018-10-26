<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header> 
  <!--menu begin-->
  <div class="menu">
    <embed src="static/music/Goldmund - Dane Street.mp3" autostart="true" loop="true" hidden="true">
    <nav class="nav" id="topnav">
      <h1 class="logo"><a href="#">Loen博客</a></h1>
      <li><a href="index.jsp">网站首页</a> </li>
      <li><a href="pages?view=about">关于我</a> </li>
      <!-- <li><a href="pages?view=share">模板分享</a>
        <ul class="sub-nav">
          <li><a href="pages?view=share">个人博客模板</a></li>
          <li><a href="pages?view=share">国外Html5模板</a></li>
          <li><a href="pages?view=share">企业网站模板</a></li>
        </ul>
      </li> -->
      <li><a href="pages?view=list">学无止境</a>
        <ul class="sub-nav">
          <li><a href="pages?view=/list/list_notes">心得笔记</a></li>
          <li><a href="pages?view=/list/list_css">CSS3|Html5</a></li>
          <li><a href="pages?view=/list/list_webs">网站建设</a></li>
          <li><a href="pages?view=/list/list_recommend">推荐工具</a></li>
          <li><a href="pages?view=/list/list_js">JS实例索引</a></li>
        </ul>
      </li>
      <li><a href="pages?view=life">慢生活</a>
        <ul class="sub-nav">
          <li><a href="pages?view=/life/life_notes">日记</a></li>
          <li><a href="pages?view=/life/life_enjoy">欣赏</a></li>
          <li><a href="pages?view=/life/life_program">程序人生</a></li>
          <li><a href="pages?view=/life/life_ana">经典语录</a></li>
        </ul>
      </li>
      <li><a href="pages?view=time">时间轴</a> </li>
      <li><a href="pages?view=gbook">留言</a> </li>
      <li><a href="pages?view=info">内容页</a> </li>
      <!--search begin-->
      <div id="search_bar" class="search_bar">
        <form  id="searchform" action="[!--news.url--]e/search/index.php" method="post" name="searchform">
          <input class="input" placeholder="请输入检索词..." type="text" name="keyboard" id="keyboard">
          <input type="hidden" name="show" value="title" />
          <input type="hidden" name="tempid" value="1" />
          <input type="hidden" name="tbname" value="news">
          <input type="hidden" name="Submit" value="搜索" />
          <span class="search_ico"></span>
        </form>
      </div>
      <!--search end--> 
    </nav>
  </div>
  <!--menu end--> 
</header>
</body>
</html>