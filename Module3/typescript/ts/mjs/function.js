// return
function noReturn() {
    console.log("Không có return");
}
// function noReturn() : void {
//     console.log("Không có return")
// }
noReturn();
function returnNum() {
    //
    return 7;
}
console.log(returnNum());
function returnStringArr() {
    return ["a", "b", "c"];
}
console.log(returnStringArr());
// param
function showInfo(name, age) {
    // return `My name is: ` + name + ` & ` + `age: ` + age;
    return `My name is: ${name} & age: ${age}`;
}
console.log(showInfo("Son", 20));
// giá trị mặc định
function showInfo1(name, age = 25) {
    return `My name is: ${name} & age: ${age}`;
}
console.log(showInfo1("Son"));
// tham số khuyết
function showInfo2(name, age) {
    if (age == null) {
        return `My name is: ${name}`;
    }
    else {
        return `My name is: ${name} & age: ${age}`;
    }
}
console.log(showInfo2("Son"));
// param 2
function totalLength(x, y) {
    return x.length + y.length;
}
console.log(totalLength("abcd", ["a"]));
console.log(totalLength([1, "s", 6], ["a"]));
// rest param
function showInfoStudent(name, ...course) {
    console.log(course);
    return name + " study " + course.join(", ");
}
console.log(showInfoStudent("Son", "Java", "PHP", "Angular"));
// arrow function
let f1 = function (i) {
    return i * i;
};
let f2 = function (i) {
    return i * i;
};
let f3 = (i) => {
    return i * i;
};
let f4 = (i) => { return i * i; };
let f5 = (i) => i * i;
;
console.log(f1(3) + " " + f2(2) + " " + f3(5) + " " + f4(0) + " " + f5(9));
function abc123(x) {
    if (typeof x == "string") {
        return 9;
    }
    else if (typeof x == "number") {
        return "Son";
    }
}
console.log(abc123("ab"));
console.log(abc123(100));
