$(document).ready(() => {
    var sai = $("<span class='error'>SAI</span.error>").css({margin: "0", color: "red"});

    $("input.email").on("blur", () => {
        if (!checkEmail()) {
            $("div.email").children("span.error").remove();
            $("input.email").css({color: "red"});
            $("div.email").append(sai);
        } else {
            $("div.email").children("span.error").remove();
            $("input.email").css({color: "black"});
        }
    });
});

function checkEmail() {
    var valueEmail = $("input.email").first().val();
    index = 0;
    if ((index = valueEmail.indexOf("@")) > 0) {
        if (valueEmail.indexOf(".", index + 2) >= 0 && valueEmail.lastIndexOf(".") != valueEmail.length - 1) {
            return true;
        }
    }

    return false;
}