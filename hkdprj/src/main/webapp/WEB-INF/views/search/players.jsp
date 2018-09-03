<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="${pageContext.request.contextPath}/resources/css/players.css" rel="stylesheet" />
<main>
	<section id="player-info">
	<h1>선수 정보 창</h1>
		<div class="player-container">
			<div class="player-img"><img src="/resources/images/players/koyohan.png" width="100%" height="100%"/></div>
			<div class="player-profile">
				<table>
					<tr>
						<th>이름</th>
						<td>고요한</td>
					</tr>
					<tr>
						<th>생년월일</th>
						<td>1988-03-10</td>
					</tr>
					<tr>
						<th>등번호</th>
						<td>13</td>
					</tr>
					<tr>
						<th>포지션</th>
						<td>RM</td>
					</tr>
					<tr>
						<th>국적</th>
						<td>대한민국</td>
					</tr>
					<tr>
						<th>소속팀</th>
						<td>FC서울</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="player-records">
			<table>
				<tr>
					<th>연도</th>
					<th>경기</th>
					<th>골</th>
					<th>어시스트</th>
					<th>경고</th>
					<th>퇴장</th>
				</tr>
				<tr>
					<td>2018</td>
					<td>23</td>
					<td>6</td>
					<td>3</td>
					<td>5</td>
					<td>0</td>
				</tr>
				<tr>
					<td>2017</td>
					<td>28</td>
					<td>2</td>
					<td>1</td>
					<td>9</td>
					<td>0</td>
				</tr>
			</table>
		</div>
	</section>
</main>