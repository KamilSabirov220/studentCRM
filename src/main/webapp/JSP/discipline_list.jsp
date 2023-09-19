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
<div class="info-block">
    <h5>Список дисциплин</h5>
</div>

<div class="table-block table-discipline">
    <div class="table-discipline-block">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Наименование дисциплины</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${disciplines}" var="ds">
                <tr>
                    <th><input type="checkbox" name="${ds.id}"></th>
                    <td>${ds.discipline_name}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="nav-menu-discipline">
        <a href="/discipline_creating">Создать дисциплину...</a>
        <a href="/discipline_modifying">Модифицировать выбранную дисциплину...</a>
        <a href="#">Удалить выбранную дисциплину</a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>
