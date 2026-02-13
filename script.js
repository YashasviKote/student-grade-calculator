function calculate() {
    let m1 = Number(document.getElementById("m1").value);
    let m2 = Number(document.getElementById("m2").value);
    let m3 = Number(document.getElementById("m3").value);

    if (isNaN(m1) || isNaN(m2) || isNaN(m3)) {
        show("Please enter all marks");
        return;
    }

    let total = m1 + m2 + m3;
    let percentage = total / 3;
    let grade;

    if (percentage >= 90) grade = "A";
    else if (percentage >= 75) grade = "B";
    else if (percentage >= 60) grade = "C";
    else if (percentage >= 40) grade = "D";
    else grade = "Fail";

    show(
        "Total: " + total +
        " | Percentage: " + percentage.toFixed(2) +
        "% | Grade: " + grade
    );
}

function show(msg) {
    document.getElementById("result").innerText = msg;
}
