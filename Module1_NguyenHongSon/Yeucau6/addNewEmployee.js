let arrEmployee = [];

function addNewEmployee() {
    var employee = new Employee();
    employee.setNameEmployee(prompt("Enter Name Employee:"));
    employee.setIdCard(prompt("Enter Id Card Employee:"));
    employee.setBirthdayEmployee(checkBirthDay());
    employee.setEmailEmployee(checkEmail());
    employee.setSalaryEmployee()

    arrEmployee.push(employee);
    displayMainMenu();
}

function checkBirthDay(birthDay) {
    birthDay = prompt("Enter Birthday Customer (dd/MM/YYYY):");
    regexp = /^(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/(19[6-9][0-9]|200[0-9])$/;
    if (regexp.test(birthDay)) {
        return birthDay;
    } else {
        alert("Ngay sinh khong hop le, vui long nhap lai!!!");
        checkBirthDay();
    }
}


function checkEmail(email) {
    email = prompt("Enter email Customer:");
    regexp = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
    if (regexp.test(email)) {
        return email;
    } else {
        alert("Email khong hop le, vui long nhap lai!!!");
        checkEmail();
    }
}