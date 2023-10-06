var valueA, valueB, valueC;

function setResult1(x) {
    document.getElementById("result").innerHTML = String(x);
}

function setResult2(x1, x2) {
    document.getElementById("result").innerHTML = "x1 = " + x1 + "<br>x2 = " + x2;
}


function isFullInput() {
    var saveValueA = valueA, saveValueB = valueB, saveValueC = valueC;
    var inputA = document.querySelector("input[aria-label='inputA']");
    valueA = inputA.value;
    var inputB = document.querySelector("input[aria-label='inputB']");
    valueB = inputB.value;
    var inputC = document.querySelector("input[aria-label='inputC']");
    valueC = inputC.value;

    if (valueA == "-" || valueB == "-" || valueC == "-") {
        return false;
    }

    if (isNaN(valueA)) {
        valueA = saveValueA;
        inputA.value = valueA;
    }

    if (isNaN(valueB)) {
        valueB = saveValueB;
        inputB.value = valueB;
    }

    if (isNaN(valueC)) {
        valueC = valueC;
        inputC.value = valueC;
    }

    if (valueA.length != 0 && valueB.length != 0 && valueC.length != 0) {
        return true;
    }

    return false;
}

function giaiPhuongTrinhBacMot() {
    var result = -valueC / valueB;
    setResult1(result);
}

function giaiPhuongTrinhBacHai() {
    if (isFullInput()) {
        if (valueA == 0 && valueB == 0) {
            setResult1("NaN");
            return;
        }

        if (valueA == 0) {
            giaiPhuongTrinhBacMot();
            return;
        }

        var dental = valueB * valueB - (4 * valueA * valueC);
        if (!isNaN(dental)) {
            var x1, x2;
            if (dental === 0) {
                x1 = -valueB / (2 * valueA);
                setResult2(x1, x1)
                return;
            }

            if (dental < 0) {
                setResult1("NaN");
                return;
            }

            x1 = (-valueB + Math.sqrt(dental)) / (2 * valueA);
            x2 = (-valueB - Math.sqrt(dental)) / (2 * valueA);
            setResult2(x1, x2);
        }
    }
}


var inputs = document.getElementsByTagName("input");
for (let input of inputs) {
    input.addEventListener("input", () => giaiPhuongTrinhBacHai());
}