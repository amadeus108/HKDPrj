<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" />

<title>Hashtag Kleague Data</title>

</head>
<body>
	<!-- --- header --- -->
	<!-- --- main --- -->
	<section id="search">
		<h1 class="hidden">해시태그 검색창</h1>
		<div class="search-container">
			<input class="search-input" type="search" placeholder="검색어를 입력해주세요."/>
			<input class="button search-button" type="submit" value="검색" />
		</div>
	</section>
	<!-- 뉴스 -->
	<section id="news">
		<h1>뉴스</h1>
		<div>
			<h1>뉴스 테이블</h1>
			<table class="table">
				<thead>
					<tr>
						<th rowspan="2">번호</th>
						<th rowspan="2">사진</th>
						<th>제목</th>
						<th rowspan="2">작성일자</th>
					</tr>
					<tr>
						<th>내용</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td rowspan="2">1</td>
						<td rowspan="2">사진</td>
						<td>FC서울 vs 포항</td>
						<td rowspan="2">2018-08-20</td>
					</tr>
					<tr>
						<td>2018-08-21 상암월드컵경기장</td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
	<section>
		<h1>경기 일정</h1>
	</section>
	<section>
		<h1>리그 테이블</h1>
	</section>
	<section>
		<h1>이적 정보</h1>
	</section>
	
</body>
</html>