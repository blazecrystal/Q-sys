<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="beyondts" uri="/beyondts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<title><beyondts:sysprop property="product.name.cn" /></title>
<link href="<beyondts:sysprop property="staticres.uri" />/css/metro.min.css" rel="stylesheet" type="text/css"/>
<link href="<beyondts:sysprop property="staticres.uri" />/css/metro-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="<beyondts:sysprop property="staticres.uri" />/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<script src="<beyondts:sysprop property="staticres.uri" />/js/jquery.min.js" type="text/javascript"></script>
<script src="<beyondts:sysprop property="staticres.uri" />/js/metro.min.js" type="text/javascript"></script>
<style type="text/css">
    .login-form {
        width: 350px;
        height: 350px;
        position: fixed;
        top: 50%;
        margin-top: -150px;
        left: 50%;
        margin-left: -200px;
    }
    #errorMsg {
        width:350px;
        position: fixed;
        left: 50%;
        top: 50%;
        margin-top: 150px;
        margin-left: -200px;
    }
</style>
</head>
<body>
    <div class="login-form padding20 block-shadow-impact" >
        <form id="loginForm" action="../platform/login" method="post">
            <h1 class="text-light">登录<beyondts:sysprop property="product.name.cn" /></h1>
            <!-- <hr class="thin"/> -->
            <br />
            <div class="input-control text full-size mouseover-shadow" data-role="input">
                <!-- <label for="user">用户：</label> -->
                <span class="mif-user prepend-icon"></span>
                <input type="text" name="user" id="user" placeholder="用户名" >
                <button class="button helper-button clear"><span class="mif-cross"></span></button>
            </div>
            <div class="input-control password full-size mouseover-shadow" data-role="input">
                <!-- <label for="user">用户：</label> -->
                <span class="mif-lock prepend-icon"></span>
                <input type="password" name="user" id="user" placeholder="密码" >
                <button class="button helper-button reveal"><span class="mif-looks"></span></button>
            </div>
            <!-- <div class="input-control modern text iconic full-size mouseover-shadow" data-role="input">
                <input type="text" name="user" id="user" >
                <span class="label">用户名</span>
                <span class="informer">请输入您的用户名</span>
                <span class="placeholder">用户名</span>
                <span class="icon fa fa-user"></span>
                <button class="button helper-button clear"><span class="mif-cross"></span></button>
            </div>
            <div class="input-control modern password iconic full-size mouseover-shadow" data-role="input">
                <input type="password" name="pwd" id="pwd">
                <span class="label">密码</span>
                <span class="informer">请输入您的密码</span>
                <span class="placeholder">密码</span>
                <span class="icon fa fa-lock"></span>
                <button class="button helper-button reveal"><span class="mif-looks"></span></button>
            </div> -->
            <br />
            <br />
            <div class="form-actions place-right">
                <button id="loginBTN" type="button" key="enter" class="button primary mif-enter">&nbsp;&nbsp;登录</button>
            </div>
            <div class="form-actions place-right">
                <button id="restBTN" type="button" class="button link small-button">忘记密码</button>
            </div>
            <br/>
            <br/>
            <br/>
            <br/>
            <div id="errorMsg"></div>
        </form>
    </div>
</body>
</html>