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
    let studnetId = input.id;
    loadStudent2(studnetId);
    let a = document.querySelectorAll('#submenu1 a');
    for(let i=0;i<a.length;i++){
        console.log(a[i]);
        if(a[i] == input){
            loadStudent2(i+1);
            break;
        }
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
    //document.getElementById('stu1').addEventListener('click',loadSTStudent);
    //document.getElementById('stu2').addEventListener('click',loadNDStudent);
    //document.getElementById('stu3').addEventListener('click',loadTDStudent);
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

function loadStudent2(id){
    clickonStudent();
    console.log(id);
    fetch("https://dv-student-backend-2019.appspot.com/student/"+id)
        .then((response) => {
            return response.json();
        }).then((json) => {
            addStudentData(json);
        });
}

/*function loadNDStudent(){
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
*/
function loadMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            addMovieData(json);
        });
}
function load1stMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=220a941d-844d-403c-bdad-e4a9e62e6e7c")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load2ndMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=d7ae3568-20eb-433e-a2e8-490e00e503ca")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load3rdMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movieQuery?id=52bc2802-f220-4a41-971e-9f9a77e4a0e3")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load4thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/12dea0c4-a3c9-44af-8bbe-4524ba3ae6a3")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load5thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/66dabba2-e65e-4b2f-a552-9b3e429a9c12")
        .then((response)=>{
            return response.json();
        }).then((json) =>{
            //console.log(json);
            addMovieData(json);
        });
}
function load6thMovie(){
    fetch("https://dv-excercise-backend.appspot.com/movie/e3506227-4f61-4116-a3eb-35433077ccb")
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