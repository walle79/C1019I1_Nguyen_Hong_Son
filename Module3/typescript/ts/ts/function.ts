// return
function noReturn() {
    console.log("Không có return")
}
// function noReturn() : void {
//     console.log("Không có return")
// }
noReturn();
function returnNum() : number {
    //
    return 7;
}
console.log(returnNum());
function returnStringArr() : string[] {
    return ["a", "b", "c"];
}
console.log(returnStringArr());

// param
function showInfo(name : string, age : number) : string {
    // return `My name is: ` + name + ` & ` + `age: ` + age;
    return `My name is: ${name} & age: ${age}`;
}
console.log(showInfo("Son", 20));
// giá trị mặc định
function showInfo1(name : string, age : number = 25) : string {
    return `My name is: ${name} & age: ${age}`;
}
console.log(showInfo1("Son"));
// tham số khuyết
function showInfo2(name : string, age? : number) : string {
    if(age == null) {
        return `My name is: ${name}`;
    } else {
        return `My name is: ${name} & age: ${age}`;
    }
}
console.log(showInfo2("Son"));

// param 2
function totalLength(x : any, y : string[]) : number {
    return x.length + y.length;
}
console.log(totalLength("abcd", ["a"]));
console.log(totalLength([1,"s",6], ["a"]));

// rest param
function showInfoStudent(name: string, ...course: string[]) : string {
    console.log(course);
    return name + " study " + course.join(", ");
}
console.log(showInfoStudent("Son", "Java", "PHP", "Angular"));

// arrow function
let f1 = function (i : number) : number {
    return i*i;
};
let f2 = function (i : number) {
    return i*i;
};
let f3 = (i : number) : number => {    // arrow function
    return i*i;
};
let f4 =(i : number) => { return i*i; };
let f5 = (i : number) => i*i; ;
console.log(f1(3) + " " + f2(2) + " " + f3(5) + " " + f4(0) + " " + f5(9));

// overload
function abc123(x: number) : string;
function abc123(x: string) : number;
function abc123(x: any) : any {
    if (typeof x == "string") {
        return 9;
    } else if (typeof x == "number") {
        return "Son";
    }
}
console.log(abc123("ab"));
console.log(abc123(100));
