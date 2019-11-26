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
    this.getPhoneEmployee = function (phone) {
        this.phone = phone;
    };
    this.getDegreeEmployee = function (degree) {
        this.degree = degree;
    };
    this.getPotisionEmployee = function (position) {
        this.position = position;
    };
    this.getSalaryEmployee = function (salary) {
        this.salary = salary;
    };
    this.getTotalPays = function () {
        return totalPays = 500 * Number.parseInt(this.rentDays) * (1 - Number.parseFloat(this.discount) / 100);
    };
};