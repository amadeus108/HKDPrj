<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="/resources/css/header.css" rel="stylesheet" />
<script src="/resources/js/header.js"></script>

<header id="header">
	<h1><a href="/index">Hashtag Kleague Data</a></h1>
	<section id="header-buttons">
		<h1 class="hidden">헤더 버튼</h1>
		<input class="button hamburger-button" type="button" value="메뉴보기" />
	</section>
	<aside id="login-info">
		<h1 class="hidden">로그인 정보</h1>
		<section id="profile">
			<h1 class="hidden">프로필</h1>
			<div class="status">
				<div class="auth-status"><a href="/login">로그인</a></div>
				<div class="auth-status"><a href="">회원가입</a></div>
			</div>
		</section>
		<section id="main-menu">
			<h1 class="hidden">메인 메뉴</h1>
			<ul>
				<li><a href="">선수정보</a></li>
				<li><a href="">클럽정보</a></li>
				<li><a href="">뉴스</a></li>
				<li><a href="">경기일정</a></li>
				<li><a href="">리그테이블</a></li>
				<li><a href="">이적정보</a></li>
			</ul>
		</section>
	</aside>
</header>