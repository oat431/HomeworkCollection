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

function bodyLoad(){
    loadStudent();
    loadMovie();
    document.getElementById('STUDENT').style.display = "block";
    document.getElementById('MOVIE').style.display = "none"; 
    document.getElementById('stu1').addEventListener('click',loadSTStudent);
    document.getElementById('stu2').addEventListener('click',loadNDStudent);
    document.getElementById('stu3').addEventListener('click',loadTDStudent);
    document.getElementById('mv1').addEventListener('click',load1stMovie);
    document.getElementById('mv2').addEventListener('click',load2ndMovie);
    document.getElementById('mv3').addEventListener('click',load3rdMovie);
    document.getElementById('mv4').addEventListener('click',load4thMovie);
    document.getElementById('mv5').addEventListener('click',load5thMovie);
    document.getElementById('mv6').addEventListener('click',load6thMovie);

}

function loadStudent(){
    fetch("https://dv-student-backend-2019.appspot.com/student")
        .then((response) => {
            return response.json();
        }).then((json) => {
            addStudentData(json);
        });
}

function loadSTStudent(){
    clickonStudent();
    fetch("https://dv-student-backend-2019.appspot.com/student/1")
        .then((response) => {
            return response.json();
        }).then((json) => {
            addStudentData(json);
        });
}
function loadNDStudent(){
    clickonStudent();
    fetch("https://dv-student-backend-2019.appspot.com/student/2")
        .then((response) => {
            return response.json();
        }).then((json) => {
            addStudentData(json);
        });
}
function loadTDStudent(){
    clickonStudent();
    fetch("https://dv-student-backend-2019.appspot.com/student/3")
        .then((response) => {
            return response.json();
        }).then((json) => {
            addStudentData(json);
        });
}

function loadMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            addMovieData(json);
        });
}
function load1stMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=1c1f5c60-ead3-4b6e-8877-77167f07fd80")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load2ndMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=eb43986d-121c-411e-953b-f0b033b256dc")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load3rdMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=7e1cba36-d9fb-459c-9455-f2a7893a8e2e")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load4thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/0f18fdd5-5f94-40e5-b661-fd5c1ebc5252")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load5thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/3a4a9378-dce0-4ccd-9727-f83a5b89f95b")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load6thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/e5547392-be4f-45ab-bd99-8b31f4d6a41f")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function addStudentData(student){
    document.getElementById('id').innerHTML = student.id;
    document.getElementById('studentId').innerHTML = student.studentId;
    document.getElementById('name').innerHTML = student.name + " " + student.surname;
    document.getElementById('gpa').innerHTML = student.gpa;
    document.getElementById('image').src = student.image;
}
function addMovieData(movie){
    document.getElementById('moviename').innerHTML = movie.name;
    document.getElementById('moviesynopsis').innerHTML = movie.synopsis;
    document.getElementById('Movieimage').src = movie.imageUrl;
}

function clickonStudent(){
    document.getElementById('STUDENT').style.display = "block";
    document.getElementById('MOVIE').style.display = "none";
}

function clickonMoive(){
    document.getElementById('MOVIE').style.display = "block";
    document.getElementById('STUDENT').style.display = "none";
}