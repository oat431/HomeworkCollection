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
    $('#showAlert').hide('fade');
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    courseContentElement.style.display = "block";
    phylosContentElement.style.display = "none";
}

function showCourseContent() {
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    courseContentElement.style.display = "block";
    phylosContentElement.style.display = "none";
}

function showPhylosContent() {
    courseContentElement = document.getElementById("courseContent");
    phylosContentElement = document.getElementById("philosopyElement");
    courseContentElement.style.display = "none";
    phylosContentElement.style.display = "block";
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

let cntAlert = 1;
function showAlert(){
    console.log(cntAlert);
    if(cntAlert === 3){
        $('#showAlert').show('fade');
        cntAlert = 1;
    }else{
        cntAlert++;
    }
}

$('#Cllose').click(function(){
    $('#showAlert').hide('fade');
});