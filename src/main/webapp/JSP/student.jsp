<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Students</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="stylesheet" href="../resources/styles/style.css">
</head>
<body>
<header class="page-header">
    <div class="page-header-inner">
        <div class="page-header-top">
            <h2>Система управления студентами и их успеваемостью</h2>
            <nav>
                <ul class="nav justify-content-end header-sett">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/title">На главную</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="registration.html">Регистрация</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.html">Войти</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<div class="page-content">
    <div class="middle-block-list">
        <ul class="nav nav-stud-list">
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="student_progress.html">Посмотреть успеваемость выбранных студентов</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/students_creating">Создать студента...</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="student_modifying.html">Модифицировать выбранного студента...</a>
            </li>
            <li class="nav-item">
                <input class="nav-link" type="submit" value="Удалить выбранных студентов" onclick="deleteStudents()">
                <%--<a class="nav-link" type="submit" onclick="deleteStudents()" href="#">Удалить выбранных студентов</a>--%>
            </li>
        </ul>
    </div>

    <div class="table-block">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Фамилия</th>
                <th scope="col">Имя</th>
                <th scope="col">Группа</th>
                <th>Дата поступления</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="st">
                <tr>
                    <th><input type="checkbox" value="${st.id}" name="idStudent"></th>
                    <td>${st.sur_name}</td>
                    <td>${st.name}</td>
                    <td>${st.group}</td>
                    <td>${st.date_in}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<form id="deleteStudentForm" action="/deleteStudent" method="post">
    <input type="hidden" id="deleteStudentHidden" name="deleteStudentHidden">
</form>
<form id="modifyStudentForm" action="/modifyStudent" method="get">
    <input type="hidden" id="modifyStudentHidden" name="modifyStudentHidden">
</form>

<script src="../resources/js/functions.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>
