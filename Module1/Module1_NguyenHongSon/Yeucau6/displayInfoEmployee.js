function displayInformationEmployee (){
    choose = prompt("Chọn nhân viên muốn hiển thị \n" + get2InforEmployee() + arrListCustomer.length + ".Back");
    switch (choose) {
        case (arrEmployee.length) + "":
            displayMainMenu();
            break;
        default:
            displayEmployee(choose);
    }
    displayMainMenu();
}

function get2InforEmployee() {
    let result = "";
    for (i = 0; i < arrEmployee.length; i++) {
        result += "Số thứ tự:" + " " + i + "\n"
            + "0.Name:" + " " + arrEmployee[i].getNameEmployee() + "\n"
            + "1.ID Card" + " " + arrEmployee[i].getIdCard() + "\n"
            + "============================\n";
    }
    return result;
}

function displayEmployee(index) {
    alert(getInformationEmployee(index));
}

function getInformationEmployee(index) {
    return "0. Name: " + " " + arrEmployee[index].getNameEmployee() + "\n"
        + "1. ID Card: " + " " + arrEmployee[index].getIdCard() + "\n"
        + "2. Birthday: " + " " + arrEmployee[index].getBirthdayEmployee() + "\n"
        + "3. Email: " + " " + arrEmployee[index].getEmailEmployee() + "\n"
        + "4. Phone: " + " " + arrEmployee[index].getPhoneEmployee() + "\n"
        + "5. Degree: " + " " + arrEmployee[index].getDegreeEmployee() + "\n"
        + "6. Potision: " + " " + arrEmployee[index].getPotisionEmployee() + "\n"
        + "7. Salary: " + " " + arrEmployee[index].getSalaryEmployee() + "\n"
        + "============== \n";
}