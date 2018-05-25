<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="formulaire-style.css">
    <title>Formulaire</title>
</head>
<body>
    <form action="FormulaireServlet" method="post">
        <input type="text" id="leftText" name="leftText" value="${ rightText }">
        <input type="text" id="rightText" name="rightText" value="${ leftText }">
        <div class="button">
            <button type="submit" name="toRight">&gt;&gt;&gt;</button>
        </div>
        <div class="button">
            <button type="submit" name="toLeft">&lt;&lt;&lt;</button>
        </div>
    </form>    
</body>
</html>