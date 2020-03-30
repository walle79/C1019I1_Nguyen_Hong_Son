function show(x) {
    return x;
}
console.log(show("Thuy"));
class StudentGeneric {
    static printArray(params) {
        console.log(params);
    }
}
StudentGeneric.printArray(["Son", "Thuy", "Minh"]);
class Product {
    constructor(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    showInfo() {
        console.log(`${this.id} - ${this.name} - ${this.price}`);
    }
}
let product1 = new Product(1, "Laptop", 500);
let product2 = new Product("No2", "Television", "10tr");
product1.showInfo();
product2.showInfo();
