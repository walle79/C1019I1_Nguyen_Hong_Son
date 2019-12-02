let Employee = function () {
    this.setNameEmployee = function (name) {
        this.name = name;
    };
    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.setBirthdayEmployee = function (birthDay) {
        this.birthDay = birthDay;
    };
    this.setPhoneEmployee = function (phone) {
        this.phone = phone;
    };
    this.setEmailEmployee = function (email) {
        this.email = email;
    };
    this.setDegreeEmployee = function (degree) {
        this.degree = degree;
    };
    this.setPotisionEmployee = function (position) {
        this.position = position;
    };
    this.setSalaryEmployee = function (salary) {
        this.salary = salary;
    };


    this.getNameEmployee = function () {
        return this.name;
    };
    this.getIdCard = function () {
        return this.idCard;
    };
    this.getBirthdayEmployee = function () {
        return this.birthDay;
    };
    this.getEmailEmployee = function () {
        return this.email;
    };
    this.getPhoneEmployee = function () {
        return this.phone;
    };
    this.getDegreeEmployee = function () {
        return this.degree;
    };
    this.getPotisionEmployee = function () {
        return this.position;
    };
    this.getSalaryEmployee = function () {
        if(this.position === "Manager"){
            return parseInt(this.salary) + 500;
        } else if(this.position === "Sale"){
            return parseInt(this.salary) + 300;
        } else if(this.position === "Marketting"){
            return parseInt(this.salary) + 200;
        } else {
            return this.salary;
        }
    };
};