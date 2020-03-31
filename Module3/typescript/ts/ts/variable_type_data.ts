function variable_type_data(person: string) {
    return "Hello " + person;
}
var user = "Son55558444";
document.body.innerHTML = variable_type_data(user);

// tuple
let x : [string, number, boolean];
x = ["alo", 4, true];
console.log(x);

// enum
enum STATUS {CREATED = 100, PROCESS = 101, FINISH = 102};
let todoStatus : STATUS = STATUS.CREATED;
console.log(todoStatus);

// any
let mVar : any = 5;
mVar = "abt";
mVar = true;
let mArr : any [] = [1, true, "abc"];
console.log(mVar);
console.log(mArr);

// void
function hello() : void {
    console.log("Xin chào Hồng Sơn");
}
hello();

// type assertion
let mVariable : any = "lalala";
// let total = (<string>mVariable).length;
let total = (mVariable as string).length;
console.log(total);

// interface object
let obj1 : any = {};
console.log(obj1);
interface CourseInterface {
    name : string;
    time : number;
    age? : number;
}
let obj2 : CourseInterface;
obj2 = {name : "Son", time : 5};
let obj3 : CourseInterface = {
    name : "Thuy",
    time : 10,
    age : 20
};
console.log(obj2);
console.log(obj3);

// interface array
interface CourseName {
    [index : number] : string;
}
let nameStudent : CourseName[] = ["Son", "Thuy", "Tan"];
console.log(nameStudent);