<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<header>
    <h1>조기 화재 감지 서비스</h1>
</header>
<br><br>

<article id="join">
    <h2 style="text-align: center">서비스 등록하기</h2>
<div class="container">
<form>
  <div class="form-group">
    <label for="apartname">Apartname : </label>
    <input type="text" class="form-control" placeholder="Enter username" id="apartname">
  </div>

 <div class="form-group">
        <label for="building">Building:</label>
        <input type="text" class="form-control" placeholder="Enter building" id="building">
      </div>

  <div class="form-group">
      <label for="unit">Unit:</label>
      <input type="text" class="form-control" placeholder="Enter unit" id="unit">
    </div>
</form>
<button id="btn-save" class="btn btn-primary">회원가입완료</button>
</div>
</article>

<script src="../js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>