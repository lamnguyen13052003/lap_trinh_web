$(document).ready(() => {
    animationRotate(2000);
});

function animationRotate(time) {
    var currentAngle = 0;
    setInterval(() => {
        $("img").animate(
            {deg: currentAngle},
            {
                step: function (now) {
                    $(this).css({transform: 'rotate(' + now + 'deg)'});
                }
            }
        );

        currentAngle += 15;
    }, time);
}