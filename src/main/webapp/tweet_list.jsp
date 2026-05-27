<%@page import="jp.co.aforce.beans.Tweet"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイート一覧</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<div class="container">
		<h1>ツイート一覧</h1>
		<%-- 新規投稿 --%>
		<p>
			<a href="new_tweet.jsp">新規投稿</a>
		</p>

		<%-- ツイート一覧の表示 --%>
		<%@page import = "jp.co.aforce.beans.Tweet, java.util.List" %>
		<% List<Tweet> tweets = (List<Tweet>)request.getAttribute("tweets"); %>
		<ul class="tweet-list">
			<li>
				<div class="tweet-content">
					<p>
					<%for (Tweet tweet : tweets) { %>
					<%=tweet.getContent() %>
						<p class="tweet-info">
							投稿者:<%=tweet.getAuthor() %>:
							投稿日時:<%=tweet.getPostedAt() %>
						</p>
					<%} %>
					</p>
					
				</div>
			</li>
		</ul>
	</div>
</body>
</html>