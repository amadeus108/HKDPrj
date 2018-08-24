<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/header.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/news-insert.css" rel="stylesheet" />

<title>뉴스 등록</title>
</head>
<body>
	<!-- ----- main ----- -->
	<h1>뉴스 등록 페이지</h1>
	<section id="container">
		<h1>뉴스 등록 메뉴</h1>
		<div class="content">
			<div class="form-group">
				<label>제목</label>
<!-- 				<div class="form"> -->
					<input type="text" name="title" placeholder="제목을 입력하세요."/>
<!-- 				</div> -->
			</div>
			<div class="form-group">
				<label>내용</label>
				<div class="form-content">
					<textarea rows="10" name="content" placeholder="내용을 입력하세요."></textarea>
				</div>
			</div>
			<div class="form-group">
				<label>사진</label>
				<div class="form">
					<input type="text" name="picture" placeholder="사진을 등록하세요." />
				</div>
			</div>
			<div class="form-group">
				<label>출처</label>
				<div class="form">
					<input type="text" name="source" placeholder="링크를 입력하세요." />
				</div>
			</div>
			<div class="form-group">
				<label>태그</label>
				<div class="form">
					<input type="text" name="hashtag" placeholder="ex) #FC서울, #고요한, #킹한빈" />
				</div>
			</div>
			<div class="btn">
				<input type="submit" value="등록" />
				<input type="submit" value="취소" />
			</div>
		</div>
	</section>
</body>
</html>