function closeContent() {
    contentElement = document.getElementById("content");
    if (contentElement.style.display === "none")
        contentElement.style.display = "block";
    else
        contentElement.style.display = "none";
    console.log(contentElement.style.display);
}

function showContent() {
    contentElement = document.getElementById("content");
    contentElement.style.display = "block";
    console.log(contentElement.style.display);
}

function hideAll() {
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    PurposesContentElement = document.getElementById("Purposes");
    courseContentElement.style.display = "block";
    phylosContentElement.style.display = "none";
    PurposesContentElement.style.display = "none";
}

function showCourseContent() {
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    PurposesContentElement = document.getElementById("Purposes");
    courseContentElement.style.display = "block";
    phylosContentElement.style.display = "none";
    PurposesContentElement.style.display = "none";
}

function showPhylosContent() {
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    PurposesContentElement = document.getElementById("Purposes");
    courseContentElement.style.display = "none";
    phylosContentElement.style.display = "block";
    PurposesContentElement.style.display = "none";
}
function showPurpose(){
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    PurposesContentElement = document.getElementById("Purposes");
    courseContentElement.style.display = "none";
    phylosContentElement.style.display = "none";
    PurposesContentElement.style.display = "block";
}
function showText(element) {
    let html = element.innerHTML;
    let text = element.innerText;
    alert("inner html = \n " + html +
        "\n" + "the text = \n " + text);
}

let counter = 0;

function increaseCounter() {
    counter = counter + 1;
    valueButton = document.getElementById("currentValue");
    valueButton.value = counter;
}

function decreaseCounter() {
    counter = counter - 1;
    valueButton = document.getElementById("currentValue");
    valueButton.value = counter;
}

function getCourseCode(element) {
    let currentTextElement = document.getElementById("currentValue");
    let newText = element.innerText;
    currentTextElement.value = newText;
}

function getTextBoxValue() {
    let textBoxElement = document.getElementById("inputText");
    var confirmBox = confirm("Do you want to show the text?");

    if (confirmBox == true) {
        alert(textBoxElement.value);
    } else {
        alert("the text box is not shown");
    }
}

var cnt = 0;

function addButton(){
    cnt++;
    let nBut = document.createElement('button');
    nBut.setAttribute('class','btn btn-success');
    nBut.innerHTML = cnt;

    var rowW = document.createElement('div');
    var colW = document.createElement('div');
    rowW.setAttribute('class','row justify-content-center');
    colW.setAttribute('class','col-1');
    colW.appendChild(nBut);
    rowW.appendChild(colW);
    var butE = document.getElementById("pButton");
    butE.appendChild(rowW);
}