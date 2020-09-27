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

function hideAll(){
    document.getElementById('STUDENT').style.display = "none";
    document.getElementById('MOVIE').style.display = "none";
    document.getElementById('addStudentForm').style.display = 'none';
    document.getElementById('addMovieform').style.display = 'none'; 
    document.getElementById('deleteStudentForm').style.display = 'none';
}

function showAllStudent(){
    if(document.getElementById('STUDENT').style.display === "none"){
        document.getElementById('STUDENT').style.display = "block";
    }
    
    let stu_table = document.getElementById("stu_table");
    stu_table.innerHTML = '';
    fetch('https://dv-student-backend-2019.appspot.com/students')
        .then((res)=>{
            return res.json();
        }).then((j)=>{
            for(let i=0;i<j.length;i++){
                let TR = document.createElement('tr');
                let thIndex = document.createElement('th');
                thIndex.scope = 'row';
                thIndex.innerHTML = (i+1);
                let tdStudentId = document.createElement('td');
                let tdStudentNameSur = document.createElement('td');
                let gpaData = document.createElement('td');
                let frame = document.createElement('td');
                let imgData = document.createElement('img');
                tdStudentId.innerHTML = j[i].studentId;
                tdStudentNameSur.innerHTML = j[i].name + " " + j[i].surname;
                gpaData.innerHTML = j[i].gpa;
                imgData.src = j[i].image;
                imgData.classList.add("profile-img");
                frame.appendChild(imgData);
                TR.appendChild(thIndex);
                TR.appendChild(tdStudentId);
                TR.appendChild(tdStudentNameSur);
                TR.appendChild(gpaData);
                TR.appendChild(frame);
                stu_table.appendChild(TR);
                TR.addEventListener('click',function(){
                    alert(JSON.stringify(j[i]));
                });
            }
        });
}

function showAllMovie(){
    if(document.getElementById('MOVIE').style.display === "none"){
        document.getElementById('MOVIE').style.display = "block";
    }
    let mov_table = document.getElementById('mov_table');
    mov_table.innerHTML = '';
    fetch('https://dv-excercise-backend.appspot.com/movies')
        .then((res)=>{
            return res.json();
        }).then((j)=>{
            for(let i=0;i<j.length;i++){
                
                //create the element
                let img = document.createElement('img');
                let movName = document.createElement('h3');
                let synopsis = document.createElement('p');

                //push the attribute inside
                img.src = j[i].imageUrl;
                movName.innerHTML = j[i].name;
                synopsis.innerHTML = j[i].synopsis;

                //create big colum-3
                let theater = document.createElement('div');
                theater.className = 'col-lg-4 col-md-4 col-sm-4 col-xs-4 col-4 border';
                theater.addEventListener('click',function(){
                    deletemovie(j[i]);
                });

                //create 3 row for contain in theater
                let moviePic = document.createElement('div');
                moviePic.classList.add('row');
                let movieName = document.createElement('div');
                movieName.classList.add('row');
                let moviesynopsis = document.createElement('div');
                moviesynopsis.classList.add('row');

                //create 3 small colum for each row
                let contPic = document.createElement('div');
                contPic.className ='col-lg-12 col-md-12 col-sm-12 col-xs-12 col-12';
                let contName = document.createElement('div');
                contName.className ='col-lg-12 col-md-12 col-sm-12 col-xs-12 col-12';
                let contSyn = document.createElement('div');
                contSyn.className ='col-lg-12 col-md-12 col-sm-12 col-xs-12 col-12';

                //put the element in small colum
                contPic.appendChild(img);
                contName.appendChild(movName);
                contSyn.appendChild(synopsis);

                //put the small colum to each row
                moviePic.appendChild(contPic);
                movieName.appendChild(contName);
                moviesynopsis.appendChild(contSyn);

                //put the row into the big colum
                theater.appendChild(moviePic);
                theater.appendChild(movName);
                theater.appendChild(moviesynopsis);

                //addeverything to table
                mov_table.appendChild(theater);
            }
        });
}

document.getElementById('stu_menu')
.addEventListener('click',function(){
    showAllStudent();
    document.getElementById('STUDENT').style.display = "block";
    document.getElementById('MOVIE').style.display = "none"; 
});

document.getElementById('mov_menu')
.addEventListener('click',function(){
    showAllMovie();
    document.getElementById('STUDENT').style.display = "none";
    document.getElementById('MOVIE').style.display = "block"; 
});

document.getElementById('Adddata').addEventListener('click',addStudent);
document.getElementById('Adddata2').addEventListener('click',addMovie);
document.getElementById('delStuBut').addEventListener('click',deleteStudent);

document.getElementById('addstudentMenu')
.addEventListener('click',function(){
    hideAll();
    document.getElementById('addStudentForm').style.display = 'block';
});

document.getElementById('addMovieMenu')
.addEventListener('click',function(){
    hideAll();
    document.getElementById('addMovieform').style.display = 'block';
});

document.getElementById('delstudentMenu')
.addEventListener('click',function(){
    hideAll();
    document.getElementById('deleteStudentForm').style.display = 'block';
});

function addStudent(){
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
    fetch('https://dv-student-backend-2019.appspot.com/students',{
        method:"POST",
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
            showAllStudent();
        }).catch((error)=>{
            console.log("error",error);
        });
}
function addMovie(){
    var movData = {};
    movData.name = document.getElementById('mName').value;
    movData.synopsis = document.getElementById('mSyn').value;
    movData.imageUrl = document.getElementById('mImg').value;
    if(movData.name.length == 0){
        alert("please enter your movie name");
        return;
    }
    if(movData.synopsis.length == 0){
        alert("please enter your movie synopsis");
        return;
    }
    if(movData.imageUrl.length == 0){
        alert("please enter your movie link");
        return;
    }
    fetch('https://dv-excercise-backend.appspot.com/movies',{
        method:"POST",
        headers : {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify(movData)
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
            showAllMovie();
        }).catch((error)=>{
            console.log("error",error);
        });
}

function deleteStudent(){
    let SID = document.getElementById('delSID').value;
    fetch('https://dv-student-backend-2019.appspot.com/student/'+SID,{
        method:'DELETE'
    }).then((res) =>{
        if(res.status === 200){
            return res.json();
        }else{
            throw Error(res.status);
        }
    }).then((data) =>{
        alert('student name ' + data.name + ' is now deleted');
        showAllStudent();
    }).catch((error)=>{
        alert('your input student id not in the database');
    });
}

function deletemovie(elem){
    let check = confirm("Do you want to delete this?");
    console.log(elem.id);
    if(check){
        fetch('https://dv-excercise-backend.appspot.com/movie?movie_id='+elem.id,{
        method:'DELETE'
    }).then((res) =>{
        if(res.status === 200){
            return res.json();
        }else{
            throw Error(res.status);
        }
    }).then((data) =>{
        alert('movie name ' + elem.name + ' is now deleted');
        showAllMovie();
    }).catch((error)=>{
        alert('your input movie id not in the database');
    });
    }
    
}