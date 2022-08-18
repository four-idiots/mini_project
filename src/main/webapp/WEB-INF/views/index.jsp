<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Main 페이지</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="keyword" content="fire, prevention" />
    <meta name="subject" content="화재 방지" />
    <meta
            name="description"
            content="화재를 조기에 진압하기 위해 도움을 주는 페이지"
    />
    <link href="/design/index.css" rel="stylesheet" />
</head>

<body>
<header>
    <h1>조기 화재 감지 서비스</h1>
</header>

<article id="join">

    <h2 style="text-align: center">서비스 등록하기</h2>
    <form>
        <div>
            <b>User name</b><br />
            <input type="text" id="name" style="width: 80%" />
        </div>

        <div>
            <b>Address</b><br />
            <input
                    type="number"
                    id="front_num"
                    style="width: 30%"
                    placeholder="동"
            />
            /
            <input
                    type="number"
                    id="back_num"
                    style="width: 30%"
                    placeholder="호"
            />
        </div>
        <div>
            <input id="submit" type="submit" value="Register" />
        </div>
         <div>
                    <b>Fire station</b><br />
                    <input type="radio" /> A 소방서 <input type="radio" /> B 소방서
                    <input type="radio" /> C 소방서
                    <button onclick="deselect()" style="background-color: aliceblue">
                        선택 해제
                    </button>
                </div>
    </form>
</article>


<footer>
    <div>
        <a href="#"><h2>소방서 등록하기</h2></a>
    </div>
</footer>
</body>
</html>