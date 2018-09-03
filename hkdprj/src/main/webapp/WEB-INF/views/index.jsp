<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" />
<main> 
	<!-- --- header --- --> 
	<!-- --- main --- -->
	<section id="search">
		<h1 class="hidden">해시태그 검색창</h1>
		<div class="search-container">
			<input class="search-input" type="search"
				placeholder="선수 또는 클럽명을 입력해주세요." /> <input
				class="button search-button" type="submit" value="검색" />
		</div>
	</section>
	<section id="league-table">
		<h1 class="hidden">리그 테이블</h1>
		<div class="table-container">
			<span>K리그1 순위표</span>
			<table class="table">
				<tr>
					<th>순위</th><th>클럽</th><th>경기</th><th>승</th><th>무</th><th>패</th><th>득점</th><th>실점</th><th>득실</th><th>승점</th>
				</tr>
				<tr>
					<td>1</td>
					<td>전북</td>
					<td>26</td>
					<td>19</td>
					<td>3</td>
					<td>4</td>
					<td>52</td>
					<td>22</td>
					<td>30</td>
					<td>60</td>
				</tr>
				<tr>
					<td>2</td>
					<td>경남</td>
					<td>26</td>
					<td>14</td>
					<td>7</td>
					<td>5</td>
					<td>43</td>
					<td>26</td>
					<td>17</td>
					<td>49</td>
				</tr>
				<tr>
					<td>3</td>
					<td>울산</td>
					<td>26</td>
					<td>12</td>
					<td>9</td>
					<td>5</td>
					<td>40</td>
					<td>28</td>
					<td>12</td>
					<td>45</td>
				</tr>
			</table>
		</div>
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
					<div class="club-logo"><img src="/resources/images/clubs/jeju.png" /></div>
				</div>
				<div class="score">
					<div class="score-inner">1-3</div>
				</div>
				<div class="club-info">
					<div class="club-logo"><img src="/resources/images/clubs/fcseoul.png" /></div>
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
					<div class="club-logo"></div>
				</div>
				<div class="score">
					<div class="score-inner">1-3</div>
				</div>
				<div class="club-info">
					<div class="club-logo"></div>
					<div class="club-name">FC서울</div>
				</div>
			</div>
		</div>
	</section>
<!-- --- footer --- --> 
</main>
