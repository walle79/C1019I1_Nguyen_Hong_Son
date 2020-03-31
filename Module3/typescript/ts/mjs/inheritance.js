class Course {
    constructor(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    showInfoCourse() {
        console.log(`${this.id} - ${this.name} - ${this.price}`);
    }
}
class CourseMobile extends Course {
    constructor(id, name, price, author) {
        super(id, name, price);
        this.author = author;
    }
    showInfoCourse() {
        super.showInfoCourse();
        console.log(`${this.author}`);
    }
}
var courseObj = new Course(1, "java", 100);
courseObj.showInfoCourse();
