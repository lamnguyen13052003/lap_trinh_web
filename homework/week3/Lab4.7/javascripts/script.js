$(document).ready(() => {
    var nextNumber = 1;
    var listNumber = [];
    newGame(listNumber);
    setActionForButtonNumber(nextNumber);
    $("button#new_game").click(function (){
        listNumber = [];
        newGame(listNumber, nextNumber);
    });
});

function newGame(listNumber, nextNumber){
    for(var row = 0; row < 8; row++){
        for(var col = 0; col < 8; col++){
            var rowIndex = $("div.row").eq(row);
            var cell = rowIndex.find("button").eq(col);
            let number = Math.floor(Math.random()*64) + 1;
            while(listNumber.includes(number)){
                number = Math.floor(Math.random()*64) + 1;
            }
            cell.text(number);
            listNumber[row*8 + col] = number;
            cell.removeClass("bg-primary");
            cell.removeClass("border-primary");
        }
    }
    nextNumber = 1;
}

function setActionForButtonNumber(nextNumber){
    var buttonNumber = $("button.number");
    buttonNumber.click(function() {
        var cell = $(this);
        if(cell.text() == nextNumber){
            cell.addClass("bg-primary");
            cell.addClass("border-primary");
            if(nextNumber === 64){
                alert("Chúc mừng bạn đã chiến thắng trò chơi này!!! Hớ hớ!!!\n" +
                    "Cuốn xuống và nhấn 'Game mới' nếu bạn muốn chơi lại!");
            }
            nextNumber++;
        }else{
            cell.addClass("bg-danger");
        }
    });

    buttonNumber.mouseenter(function () {
        $(this).addClass("border-primary");
    });

    buttonNumber.mouseleave(function (){
        $(this).removeClass("border-primary");
        $(this).removeClass("bg-danger");
    });
}

function runTime(){
    if(!time){
        setInterval(() => {
            if(second == 59){
                second = 0;
            }else{
                second++;
            }

            if (second == 59 && munute == 59){
                munute = 0;
            }else{
                munute++;
            }

            if (second == 59 && munute == 59 && hour == 23){
                hour = 0;
            }

        }, 1000);
    }
}
