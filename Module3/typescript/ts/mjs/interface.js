class Machine {
    calculate(x, y) {
        return x + y;
    }
}
class Superman extends Machine {
    constructor(name) {
        super();
        this.name = name;
    }
    eat() {
        console.log("No");
    }
    ;
    sleep() {
        console.log("Yes");
    }
    fly() {
        console.log("Yes");
    }
}
let son = new Superman("Son");
son.eat();
son.sleep();
son.fly();
console.log(son.calculate(2, 3));
