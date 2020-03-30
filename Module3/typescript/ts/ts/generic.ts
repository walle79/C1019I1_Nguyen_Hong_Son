function show<T>(x: T) : T {
    return x;
}
console.log(show<string>("Thuy"));
class StudentGeneric {
    static printArray<T>(params: T[]) :void {
        console.log(params);
    }
}
StudentGeneric.printArray<string>(["Son", "Thuy", "Minh"]);
class Product<A, B, C> {
    id: A;
    name: B;
    price: C;
    constructor(id: A, name: B, price: C) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    showInfo(){
        console.log(`${this.id} - ${this.name} - ${this.price}`)
    }
}
let product1 = new Product<number, string, number>(1, "Laptop", 500);
let product2 = new Product("No2", "Television", "10tr");
product1.showInfo();
product2.showInfo();