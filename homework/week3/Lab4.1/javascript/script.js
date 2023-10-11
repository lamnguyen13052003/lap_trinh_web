var buttons = document.querySelectorAll("#main .container .buttons button");

document.addEventListener("keydown", e => {
    if (e.altKey) {
        let key = e.key.toLowerCase();
        switch (key) {
            case "b": {
                setBackGround("blue");
                break;
            }
            case "r": {
                setBackGround("red");
                break
            }
        }
    }
});

for (let button of buttons) {
    button.addEventListener("click", () => {
        let color = button.getAttribute("color");
        setBackGround(color);
    });
}

function setBackGround(color) {
    var body = document.getElementsByTagName("body");
    body[0].style.background = color;
}