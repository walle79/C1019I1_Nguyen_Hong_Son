class Course {
    id: number;
    name: string;
    price: number;

    constructor(id: number, name: string, price: number) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    showInfoCourse() : void {
        console.log(`${this.id} - ${this.name} - ${this.price}`);
    }
}
class CourseMobile extends Course {
    author: string;
    constructor(id: number, name: string, price: number, author: string) {
        super(id, name, price);
        this.author = author;
    }
    showInfoCourse(): void {
        super.showInfoCourse();
        console.log(`${this.author}`);
    }
}
var courseObj = new Course(1, "java", 100);
courseObj.showInfoCourse();
