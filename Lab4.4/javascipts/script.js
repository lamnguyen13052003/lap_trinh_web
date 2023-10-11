document.getElementById("button").addEventListener("click", () => {
    const textarea = document.getElementById("textarea").value;
    const textField = document.getElementById("textField").value;
    if(textField == ""){
        document.getElementById("result").getElementsByTagName("span")[1].innerText = 0;
        return;
    }

    var count = 0, fromIndex = 0, step = textField.length, indexOf = 0;
    while((indexOf = textarea.indexOf(textField, fromIndex)) >= 0){
        console.log(count);
        count++;
        fromIndex = indexOf + step;
    }

    document.getElementById("result").getElementsByTagName("span")[1].innerText = count;
})