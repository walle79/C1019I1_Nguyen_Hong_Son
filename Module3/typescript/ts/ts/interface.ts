interface People {
    name: string;
    eat(): void;
    sleep(): void
}
interface Bird {
    fly(): void
}
class Machine {
    calculate(x: number, y: number) : number {
        return x+y;
    }
    
}
class Superman extends Machine implements People, Bird{
    name: string;
    constructor(name: string) {
        super();
        this.name = name;
    }

    eat(): void {
        console.log("No")
    };
    sleep(): void {
        console.log("Yes")
    }
    fly(): void {
        console.log("Yes")
    }
}
let son: Superman = new Superman("Son");
son.eat();
son.sleep();
son.fly();
console.log(son.calculate(2,3));