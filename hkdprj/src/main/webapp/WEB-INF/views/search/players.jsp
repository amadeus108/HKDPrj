<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="${pageContext.request.contextPath}/resources/css/players.css" rel="stylesheet" />
<link href="/resources/css/news-list.css" type="text/css" rel="stylesheet" />
<link href="/resources/css/match-list.css" type="text/css" rel="stylesheet" />
<main>
	<section id="search">
		<h1 class="hidden">선수,클럽 검색</h1>
		<div class="search-container">
			<input class="search-input" type="search" placeholder="선수 또는 클럽명을 입력해주세요." /> 
			<input class="button search-button" type="submit" value="검색" />
		</div>
	</section>
	<section id="player-info">
	<h1 class="hidden">선수 정보 창</h1>
		<div class="player-container">
			<div class="player-img"><img src="/resources/images/players/koyohan.png" width="100%" height="100%"/></div>
			<div class="player-profile">
				<table>
					<tr>
						<th>이름</th>
						<td>${player.name}</td>
					</tr>
					<tr>
						<th>생년월일</th>
						<td>${player.birthday}</td>
					</tr>
					<tr>
						<th>등번호</th>
						<td>${player.backNumber}</td>
					</tr>
					<tr>
						<th>포지션</th>
						<td>${player.position}</td>
					</tr>
					<tr>
						<th>국적</th>
						<td>${player.nationality}</td>
					</tr>
					<tr>
						<th>소속팀</th>
						<td><a href="">${player.clubName}</a></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="player-records">
			<table>
				<tr>
					<th>연도</th>
					<th>리그</th>
					<th>출장</th>
					<th>득점</th>
					<th>도움</th>
				</tr>
				<tr>
					<td>2018</td>
					<td>K리그1</td>
					<td>24</td>
					<td>6</td>
					<td>3</td>
				</tr>
				<tr>
					<th>오프사이드</th>
					<th>슈팅</th>
					<th>파울</th>
					<th>경고</th>
					<th>퇴장</th>
				</tr>
				<tr>
					<td>7</td>
					<td>27</td>
					<td>33</td>
					<td>6</td>
					<td>0</td>
				</tr>
			</table>
		</div>
	</section>
	<section id="news-list">
		<h1 class="hidden">뉴스 리스트</h1>
		<span>뉴스 센터</span>
		<table class="news-container">
			<tbody>
				<tr class="tr1">
					<td class="image" rowspan="2"><img src="/resources/images/players/koyohan.png" width="100%" height="100%"/></td>
					<td class="title"><a href="">title1</a></td>
				</tr>
				<tr class="tr2">
					<td class="content"><a href="">content1</a></td>
				</tr>
				<tr class="tr1">
					<td class="image" rowspan="2"><img src="" />사진</td>
					<td class="title"><a href="">title2</a></td>
				</tr>
				<tr class="tr2">
					<td class="content"><a href="">content2</a></td>
				</tr>
				<tr class="tr1">
					<td class="image" rowspan="2"><img src="" />사진</td>
					<td class="title"><a href="">title3</a></td>
				</tr>
				<tr class="tr2">
					<td class="content"><a href="">content3</a></td>
				</tr>
			</tbody>
		</table>
	</section>
	<section id="match-list">
		<h1 class="hidden">경기 일정</h1>
		<span>K리그 경기 일정</span>
		<div class="match-list-container">
			<div class="match-date">
				<span>2018-08-28 19:00</span>
			</div>
			<div class="match-info">
				<div class="club-info">
					<div class="club-name">제주</div>
					<div class="club-logo"><img src="/resources/images/clubs/jeju-s.png" /></div>
				</div>
				<div class="score">
					<div class="score-inner">1-3</div>
				</div>
				<div class="club-info">
					<div class="club-logo"><img src="/resources/images/clubs/seoul-s.png" /></div>
					<div class="club-name">FC서울</div>
				</div>
			</div>
		</div>
		<div class="match-list-container">
			<div class="match-date">
				<span>2018-08-28 19:00</span>
			</div>
			<div class="match-info">
				<div class="club-info">
					<div class="club-name">제주</div>
					<div class="club-logo"><img src="/resources/images/clubs/jeju-s.png" /></div>
				</div>
				<div class="score">
					<div class="score-inner">1-3</div>
				</div>
				<div class="club-info">
					<div class="club-logo"><img src="/resources/images/clubs/seoul-s.png" /></div>
					<div class="club-name">FC서울</div>
				</div>
			</div>
		</div>
	</section>
</main>
