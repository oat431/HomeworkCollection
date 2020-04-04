/* globals Chart:false, feather:false */

(function () {
    'use strict';
    feather.replace();
}());

var cnt = true;

function setActive(inputMenu){
    var activeMenu = document.querySelector('nav li a.active');
    activeMenu.classList.remove('active');
    inputMenu.classList.add('active');
    cnt = true;
    let act = document.querySelector('#submenu1 a.active');
    if(act != null){
        act.classList.remove('active');
    }
}

function setActiveSubList(input){   
    var act = document.querySelector('#submenu1 a.active');
    var act2 = document.querySelector('#submenu2 a.active');
    if(act2 != null){
        act2.classList.remove('active');
    }
    if(act == null){
        input.classList.add('active');
    }else{
        act.classList.remove('active');
        input.classList.add('active');
        
    }
        
}

function setActiveSubList2(input){   
    var act = document.querySelector('#submenu2 a.active');
    var act2 = document.querySelector('#submenu1 a.active');
    if(act2 != null){
        act2.classList.remove('active');
    }
    if(act == null){
        input.classList.add('active');
    }else{
        act.classList.remove('active');
        input.classList.add('active');
        
    }
        
}

function loadStudent(){
    fetch("https://dv-student-backend-2019.appspot.com/student")
        .then((response) => {
            return response.json();
        }).then((json) => {
            document.getElementById('result').innerHTML = JSON.stringify(json,null,2);
        });
}
function addStudentData(student){
    document.getElementById('id').innerHTML = student.id;
    document.getElementById('studentId').innerHTML = student.studentId;
    document.getElementById('name').innerHTML = student.name + " " + student.surname;
    document.getElementById('gpa').innerHTML = student.gpa;
    document.getElementById('image').src = student.image;
}
