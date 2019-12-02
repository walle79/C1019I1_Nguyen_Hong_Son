let arrEmployee = [];

function addNewEmployee() {
    var employee = new Employee();
    employee.setNameEmployee(prompt("Enter Name Employee:"));
    employee.setIdCard(checkCMND(prompt("Enter Id Card Employee:")));
    employee.setBirthdayEmployee(checkBirthDay(prompt("Enter Birthday Customer (dd/MM/YYYY):")));
    employee.setEmailEmployee(checkEmail(prompt("Enter email Customer:")));
    employee.setSalaryEmployee(prompt("Enter Salary:"));
    employee.setDegreeEmployee(prompt("Enter Degree of Employee:"));
    employee.setPhoneEmployee(prompt("Enter Phone Number of Employee"));
    employee.setPotisionEmployee(prompt("Enter Position of Employee"));

    arrEmployee.push(employee);
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
    if (regexp.test(email)) {
        return email;
    } else {
        alert("Email khong hop le, vui long nhap lai!!!");
        checkEmail(prompt("Enter email Customer:"));
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