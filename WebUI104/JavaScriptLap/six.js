function showTxt(evt){
    var inTxt = document.getElementById("inTxt").value;
    if(inTxt.length === 0){
        document.getElementById("inTxt").value = evt.innerText;
    }else{
        evt.innerHTML = inTxt;
        document.getElementById("inTxt").value = "";
    }
}

function deCnt(){
    let cnt = document.getElementById("curVal").value;
    if(typeof cnt !== "number"){
        document.getElementById("curVal").value = 0;
    }
    cnt--;
    document.getElementById("curVal").value = cnt;
}

function inCnt(){
    let cnt = document.getElementById("curVal").value;
    if(typeof cnt !== "number"){
        document.getElementById("curVal").value = 0;
    }
    cnt++;
    document.getElementById("curVal").value = cnt;
}

function getTxt(){
    let txt = document.getElementById('inTxt');
    var chk = confirm("Do you want to show the text?");
    alert(chk?txt.value:"not shown");
}

