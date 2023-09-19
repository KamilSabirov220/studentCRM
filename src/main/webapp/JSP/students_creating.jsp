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
<div class="page-content">
    <div class="middle-block">
        <div class="info-block">
            <h5>Для создания студента заполните все поля и нажмите кнопку "Создать".</h5>
        </div>
        <div class="form-creating">
            <form action="/students_creating" method="post">
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label label-form">Фамилия</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="sur_name" required>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label label-form">Имя</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="name" required>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="col-sm-2 col-form-label label-form">Группа</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="group" required>
                    </div>
                </div>
                <div class="row mb-3">
                    <label class="input_date">Дата поступления</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control" name="date_in" required>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary dev-button dev-button-creat">Создать</button>
                <button type="button" class="btn btn-primary dev-button"><a href="/student">Назад</a></button>
            </form>
        </div>
    </div>
</div>



<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>
