let indexDisplay = 1;
function getListImg() {
    return document.querySelectorAll("#myCarousel .carousel-inner .item");
}

function getListDotDisplayImg(){
    return document.querySelectorAll('#myCarousel .carousel-indicators li');
}


//Function change image aut
function displayImgAuto(indexDisplay){
    const listImg = getListImg();
    listImg.forEach((element) => {
        element.setAttribute("class", "item");
    });

    const listDot = getListDotDisplayImg();
    listDot.forEach((element) => {
        element.setAttribute("class", "");
    });

    listDot[indexDisplay].setAttribute("class", "active");
    listImg[indexDisplay].setAttribute("class", "item active");
    return indexDisplay == 2 ? 0 : ++indexDisplay;
}

//Same function for but it dont make this page is stop
setInterval(() => {
    indexDisplay = displayImgAuto(indexDisplay);
}, 5000);

//Set Action for dot in right top img
const listDotDisplayImg = getListDotDisplayImg();
listDotDisplayImg.forEach(dot => {
    dot.addEventListener("click", () => {
        indexDisplay = displayImgAuto(dot.getAttribute("data-slide-to"));
    })
})

//set action for button next and prev
const listButton = document.querySelectorAll("#myCarousel .button div");
for (let i = 0; i < listButton.length; i++) {
    listButton[i].addEventListener("click", () => {
        indexDisplay = displayImgAuto(indexDisplay);
    });
}
