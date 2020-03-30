function variable_type_data(person) {
    return "Hello " + person;
}
var user = "Son55558444";
document.body.innerHTML = variable_type_data(user);
// tuple
let x;
x = ["alo", 4, true];
console.log(x);
// enum
var STATUS;
(function (STATUS) {
    STATUS[STATUS["CREATED"] = 100] = "CREATED";
    STATUS[STATUS["PROCESS"] = 101] = "PROCESS";
    STATUS[STATUS["FINISH"] = 102] = "FINISH";
})(STATUS || (STATUS = {}));
;
let todoStatus = STATUS.CREATED;
console.log(todoStatus);
// any
let mVar = 5;
mVar = "abt";
mVar = true;
let mArr = [1, true, "abc"];
console.log(mVar);
console.log(mArr);
// void
function hello() {
    console.log("Xin chào Hồng Sơn");
}
hello();
// type assertion
let mVariable = "lalala";
// let total = (<string>mVariable).length;
let total = mVariable.length;
console.log(total);
// interface object
let obj1 = {};
console.log(obj1);
let obj2;
obj2 = { name: "Son", time: 5 };
let obj3 = {
    name: "Thuy",
    time: 10,
    age: 20
};
console.log(obj2);
console.log(obj3);
let nameStudent = ["Son", "Thuy", "Tan"];
console.log(nameStudent);
