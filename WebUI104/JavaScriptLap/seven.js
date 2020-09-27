var arr = [];
function addIN(event){
    if(isContain(event.innerText)){
        alert("You already have this element");
        return;
    }
    arr.push(event.innerText);    
}

function rep(event){
    var word = "";
    for(var i = 0; i < arr.length;i++){
        word += (i+1)+ " : " + arr[i] + "\n";
    }
    var p = prompt("Choose data to replce : "+event.innerText+"\n"+word);
    if(p == null){
        return ;
    }
    event.innerText = arr[p-1];
    arr.splice(p-1,1);
}

function isContain(item){
    for(var i = 0; i < arr.length;i++){
        if(arr[i] === item){
            return true;
        }
    }
    return false;
}