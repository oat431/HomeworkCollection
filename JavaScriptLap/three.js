function showPhi(){
    if(document.getElementById("phi").style.display == 'block'){
        document.getElementById("phi").style.display = 'none';
        document.getElementById("pro").style.display = 'none';
    }else{
        document.getElementById("phi").style.display = 'block';
        document.getElementById("pro").style.display = 'none';
    }
}

function showPro(){
    if(document.getElementById("pro").style.display == 'block'){
        document.getElementById("phi").style.display = 'none';
        document.getElementById("pro").style.display = 'none';
    }else{
        document.getElementById("pro").style.display = 'block';
        document.getElementById("phi").style.display = 'none';
    }
}