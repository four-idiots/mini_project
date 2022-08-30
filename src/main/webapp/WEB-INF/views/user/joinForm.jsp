<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>


<head>
    <link href="${pageContext.request.contextPath}/resources/index.css" rel="stylesheet"  />
</head>


<header>
    <h1>조기 화재 감지 서비스</h1>
</header>
<br><br>
 <body>
     <article id="join">
          <h2>서비스 등록하기</h2>
          <form>
            <div>
              <i class="icon-building-filled"></i>
              <b>아파트 이름</b><br />

              <input
                type="text"
                id="apartname"
                placeholder=" oo아파트"
                style="width: 280px;"
              />
            </div>

            <div>
              <i class="icon-home"></i>
              <b>주소(동/호)</b><br />

              <input
                type="number"
                id="building"
                placeholder="(숫자)동"
                style="width:130px"
              />
              /
              <input
                type="number"
                id="unit"
                style="width:130px"
                placeholder="(숫자)호"
              />
            </div>

            <div>
              <i class="icon-handshake-o"></i>
              <b>정보 공유 소방서 등록</b><br />

              <input type="radio" /> A 소방서 <input type="radio" /> B 소방서
              <input type="radio" /> C 소방서
              <button onclick="deselect()" id="deselect">
                선택 해제
              </button>
            </div>
            <div>
              <input id="btn-save" type="submit" value="Register" />
            </div>
          </form>
        </article>

<script src="../js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>