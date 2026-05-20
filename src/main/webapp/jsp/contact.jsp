<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file="../header.html" %>
    
    <h1>フォーム</h1>
    
    
    <form action = "contact-out.jsp" method = "post">
    	<p>
		    氏名（必須）
		    <input type = "text" name = "name">
	    </p>
	    
	    <p>会社
		    <input type = "text" name = "company">
	    </p>
	    
	    <p>メールアドレス（必須）
		    <input type = "text" name = "mail">
	    </p>
	    
	    <p>お問い合わせ内容（必須）</p>
		    <p><textarea name = "text"></textarea></p>

		
	    <p>メルマガ種類</p>
		    	<p><input type = "checkbox" name = "genre" value = "総合案内">総合案内</p>
		    	<p><input type = "checkbox" name = "genre" value = "セミナー案内">セミナー案内</p>
		    	<p><input type = "checkbox" name = "genre" value = "求人採用情報">求人採用情報</p>
	    
	    
	    <p>資料請求希望</p>
		    	<p>
		    	<input type = "radio" name = "siryou" value = "Yes">Yes
		    	<input type = "radio" name = "siryou" value = "No">No
		    	</p>
	    
	    	<input type = "submit" value = "確認">
    </form>
    
    <%@include file="../footer.html" %>
    
    