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

function hideall(){
    loadStudent();
    document.getElementById("STUDENT").style.display = "none";
    document.getElementById('addStudentForm').style.display = "none";
}

function loadStudent(){
    fetch("data.json")
        .then((response) => {
            return response.json();
        }).then((json) => {
            console.log(json);
            getStudent(json);
        });
}

function getStudent(elem){
    let submenu1 = document.getElementById('submenu1');
    submenu1.innerHTML = "";
    for(let i=0;i<elem.length;i++){
        let a = document.createElement('a');
        let span = document.createElement('span');
        a.href = "#";
        a.classList.add("nav-link");
        a.addEventListener('click',function(){
            setActiveSubList(this);
            showInfor(elem[i]);
        });
        span.classList.add("menu-collapsed");
        span.innerHTML = "Student" + (i+1);
        a.appendChild(span);
        submenu1.appendChild(a);
    }
    let lastA = document.createElement('a');
    let lastSpan = document.createElement('span');
    lastA.href = "#";
    lastA.classList.add("nav-link");
    lastA.addEventListener('click',function(){        
        setActiveSubList(this);
        hideall();
        document.getElementById('addStudentForm').style.display = "block";
    });
    lastSpan.classList.add("menu-collapsed");
    lastSpan.innerHTML = "Add student";
    lastA.appendChild(lastSpan);
    submenu1.appendChild(lastA);

}

function clickonStudent(){
    hideall();
    document.getElementById('STUDENT').style.display = "block";
}



function showInfor(info){
    document.getElementById('id').innerHTML = info.id;
    document.getElementById('studentId').innerHTML = info.studentId;
    document.getElementById('name').innerHTML = info.name + " " + info.surname;
    document.getElementById('gpa').innerHTML = info.gpa;
    document.getElementById('image').src = info.image;

}


function addStudent(){
    hideall();
    document.getElementById('addStudentForm').style.display = 'block';
    var stuData = {};
    stuData.studentId = document.getElementById('sID').value;
    stuData.name = document.getElementById('sName').value;
    stuData.surname = document.getElementById('sSur').value;
    stuData.gpa = document.getElementById('sGPA').value;
    stuData.image = document.getElementById('sImg').value;
    if(stuData.studentId.length === 0){
        alert("please enter your Id");
        return;
    }
    if(stuData.name.length === 0){
        alert("please enter your name");
        return;
    }
    if(stuData.surname.length === 0){
        alert("please enter your surname");
        return;
    }
    if(stuData.gpa.length === 0){
        alert("please enter your GPA");
        return;
    }
    if(stuData.image.length === 0){
        alert("please add the link");
        return;
    }
    fetch('data.json',{
        method:"PUT",
        headers : {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify(stuData)
    }).then((res) =>{
        if(res.status === 200){
            return res.json();
        }else{
            console.log(res.statusText);

            throw Error(res.status);
        }
    })
        .then((data)=>{
            alert("add success");
            hideAll();
            clickonStudent();
        }).catch((error)=>{
            console.log("error",error);
        });
}