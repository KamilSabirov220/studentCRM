<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <a class="nav-link active" aria-current="page" href="index.html">На главную</a>
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
        <div class="info-block">
            <h5>Отображена успеваемость для следующего студента:</h5>
        </div>
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
            <tr>
                <th scope="row">1</th>
                <td>${student.sur_name}</td>
                <td>${student.name}</td>
                <td>${student.group}</td>
                <td>${student.date_in}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<div class="discipline_mark_term">
    <div class="table-block">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">Дисциплина</th>
                <th scope="col">Оценка</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Информатика</td>
                <td>5</td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="s-p-select-form">
        <select class="form-select" aria-label="Default select example">
            <c:forEach items="${terms}" var="t">
                <option selected>${t.name}</option>
            </c:forEach>

        </select>
        <p>Средняя оценка за семестр: 5 баллов</p>
    </div>

    <div class="back-button">
        <a href="students_list.html"><button type="submit" class="btn btn-primary dev-button">Назад</button></a>
    </div>


</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>
