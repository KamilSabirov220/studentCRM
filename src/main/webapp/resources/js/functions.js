function deleteStudents(){
    var checkedCheckboxs =
        document.querySelectorAll('input[name=idStudent]:checked')
    if(checkedCheckboxs.length == 0){
        alert("Выберете Хотябы одного студента!!!")
        return;
    }
    // "1 2 5 7" - string
    var ids = ""
    for(var i = 0; i < checkedCheckboxs.length; i++){
        ids = ids + checkedCheckboxs[i].value + ",";
    }
    ids = ids.substring(0, ids.length - 1);


    document.getElementById("deleteStudentHidden").value = ids;
    document.getElementById('deleteStudentForm').submit();
}


function modifyStudents(){
    var checkedCheckboxs =
        document.querySelectorAll('input[name=idStudent]:checked')
    if(checkedCheckboxs.length == 0 || checkedCheckboxs.length > 1) {
        alert("Выберете одного студента!!!")
        return;
    }
    // "1 2 5 7" - string
    var ids = ""
    for(var i = 0; i < checkedCheckboxs.length; i++){
        ids = ids + checkedCheckboxs[i].value + ",";
    }
    ids = ids.substring(0, ids.length - 1);


    document.getElementById("modifyStudentHidden").value = ids;
    document.getElementById('modifyStudentForm').submit();
}

function progressStudents(){
    var checkedCheckboxs =
        document.querySelectorAll('input[name=idStudent]:checked')
    if(checkedCheckboxs.length == 0 || checkedCheckboxs.length > 1) {
        alert("Выберете одного студента!!!")
        return;
    }
    // "1 2 5 7" - string
    var ids = ""
    for(var i = 0; i < checkedCheckboxs.length; i++){
        ids = ids + checkedCheckboxs[i].value + ",";
    }
    ids = ids.substring(0, ids.length - 1);


    document.getElementById("progressStudentHidden").value = ids;
    document.getElementById('progressStudentForm').submit();
}