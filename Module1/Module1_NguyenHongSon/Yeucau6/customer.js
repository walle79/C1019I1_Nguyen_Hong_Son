let Customer = function () {
    this.setNameCustomer = function (name) {
        this.name = name;
    };
    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.setBirthdayCustomer = function (birthDay) {
        this.birthDay = birthDay;
    };
    this.setEmailCustomer = function (email) {
        this.email = email;
    };
    this.setAddressCustomer = function (address) {
        this.adress = address;
    };
    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.setNumberOfAccompanying = function (numberOfAccompanying) {
        this.numberOfAccompanying = numberOfAccompanying;
    };
    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.setRentDays = function (rentDays) {
        this.rentDays = rentDays;
    };
    this.setTypeService = function (typeService) {
        this.typeService = typeService;
    };

    this.getNameCustomer = function () {
        return this.name;
    };
    this.getIdCard = function () {
        return this.idCard;
    };
    this.getBirthdayCustomer = function () {
        return this.birthDay;
    };
    this.getEmailCustomer = function () {
        return this.email;
    };
    this.getAddressCustomer = function () {
        return this.adress
    };
    this.getTypeCustomer = function () {
        return this.typeCustomer;
    };
    this.getDiscount = function () {
        return this.discount;
    };
    this.getNumberOfAccompanying = function () {
        return this.numberOfAccompanying;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };
    this.getRentDays = function () {
        return this.rentDays;
    };
    this.getTypeService = function () {
        return this.typeService;
    };
    this.getTotalPays = function () {
        return totalPays = 500 * Number.parseInt(this.rentDays) * (1 - Number.parseFloat(this.discount) / 100);
    };
};