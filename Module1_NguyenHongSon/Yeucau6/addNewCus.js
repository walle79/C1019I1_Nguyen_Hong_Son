let arrListCustomer = [];

function addNewCustomer() {
    var customer = new Customer();
    customer.setNameCustomer(prompt("Enter Name Customer:"));
    customer.setIdCard(checkCMND(prompt("Enter Id Card Customer:")));
    customer.setBirthdayCustomer(checkBirthDay(prompt("Enter Birthday Customer (dd/MM/YYYY):")));
    customer.setEmailCustomer(checkEmail(prompt("Enter email Customer:")));
    customer.setAddressCustomer(prompt("Enter Address Customer:"));
    customer.setTypeCustomer(prompt("Enter Type Customer:"));
    customer.setDiscount(checkDiscount(prompt("Enter Discount: ")));
    customer.setNumberOfAccompanying(checkNumberofAccompany(prompt("Enter Number of Accompanying: ")));
    customer.setTypeRoom(prompt("Enter Type Room:"));
    customer.setRentDays(checkRentDays(prompt("Enter RentDays: ")));
    customer.setTypeService(prompt("Enter Type Service:"));

    arrListCustomer.push(customer);
    displayMainMenu();
}

function checkBirthDay(birthDay) {
    regexp = /^(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/(19[6-9][0-9]|200[0-9])$/;
    if (regexp.test(birthDay)) {
        return birthDay;
    } else {
        alert("Ngay sinh khong hop le, vui long nhap lai!!!");
        checkBirthDay(prompt("Enter Birthday Customer (dd/MM/YYYY):"));
        return birthDay;
    }
}


function checkEmail(email) {
    regexp = /^[A-Za-z0-9]+@[A-Za-z0-9]+(\.com)$/;
    if (regexp.test(email)){
        alert("hợp lệ");
        return email;
    } else {
        alert("Email không hợp lệ!");
        checkEmail(prompt("Enter Email Customer: "));
        return email;
    }
}
function checkCMND(idCard) {
    regexp = /^[0-9]{9}$/;
    if(regexp.test(idCard)){
        return idCard;
    } else {
        alert("idCard không hợp lệ!");
        checkCMND(prompt("Enter ID Customer: "));
        return idCard;
    }
}
function checkRentDays(rentDays) {
    regexp = /^[0-9]{1,2}$/;
    if(regexp.test(rentDays)){
        return rentDays;
    } else {
        alert("Invalid!");
        checkRentDays(prompt("Enter RentDays: "));
        return rentDays;
    }
}
function checkDiscount(discount) {
    regexp = /^[0-9]{1,2}$/;
    if(regexp.test(discount)){
        return discount;
    } else {
        alert("Invalid!");
        checkRentDays(prompt("Enter Discount: "));
        return discount;
    }
}
function checkNumberofAccompany(numberOfAccompanying) {
    regexp = /^[0-9]{1,2}$/;
    if(regexp.test(numberOfAccompanying)){
        return numberOfAccompanying;
    } else {
        alert("Invalid!");
        checkNumberofAccompany(prompt("Enter Number of Accompanying: "));
        return numberOfAccompanying;
    }
}