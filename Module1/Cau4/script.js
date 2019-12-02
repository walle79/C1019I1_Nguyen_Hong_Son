let Nhanvien = function () {
    this.setName = function (name) {
        this.name = name;
    };
    this.setDay = function (day) {
        this.day = day;
    };
    this.setSalary = function (salary) {
        this.salary = salary;
    };
    this.getName = function () {
        return this.name;
    };
    this.getDayWork = function () {
        return this.day;
    };
    this.getSalary = function () {
        return this.salary;
    };
    this.gettotalSalary = function () {
        return this.salary*this.day;
    };
};