<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>シンプル掲示板</title>

<style>
body {
    margin: 0;
    font-family: "Segoe UI", sans-serif;
    background: #36393f;
    color: #dcddde;
}


/* 各メッセージ */
.posts {
    padding: 10px;
    margin-bottom: 10px;
    background: #40444b;
    border-radius: 8px;
}

/* 名前 */
.name {
    font-weight: bold;
    color: #7289da;
    margin-bottom: 5px;
}

/* 本文 */
.text {
    color: #dcddde;
    line-height: 1.4;
}

/* 投稿フォーム */
form {
    max-width: 700px;
    margin: 20px auto;
    padding: 10px;
    background: #2f3136;
    border-radius: 8px;
}

input, textarea {
    width: 100%;
    margin-top: 5px;
    margin-bottom: 10px;
    padding: 8px;
    border: none;
    border-radius: 5px;
    background: #202225;
    color: white;
}

input[type="submit"] {
    background: #7289da;
    cursor: pointer;
}

input[type="submit"]:hover {
    background: #5b6eae;
}
</style>

</head>

<body>

	<h1>掲示板</h1>
	
	<form action = "board" method = "post" >
		名前：
		<input type = "text" name = "name">
		
		本文：
		<textarea name = "body"></textarea>
		
		<input type = "submit" value = "投稿">
	</form>
	
</body>

</html>