function displayInformationEmployee (){
    choose = prompt("Chọn khách hàng muốn hiển thị \n" + get2InforEmployee() + arrListCustomer.length + ".Back");
    switch (choose) {
        case (arrListCustomer.length) + "":
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
        + "4. Address: " + " " + arrEmployee[index].getAddressEmployee() + "\n"
        + "5. Type Customer: " + " " + arrEmployee[index].getTypeEmployee() + "\n"
        + "6. Discount: " + " " + arrEmployee[index].getDiscount() + "\n"
        + "7. Number Of Accompanying: " + " " + arrEmployee[index].getNumberOfAccompanying() + "\n"
        + "8. Type Room: " + " " + arrEmployee[index].getTypeRoom() + "\n"
        + "9. Rent Days: " + " " + arrEmployee[index].getRentDays() + "\n"
        + "10. Type Service: " + " " + arrEmployee[index].getTypeService() + "\n"
        + "11. TotalPays: " + " " + arrEmployee[index].getTotalPays() + "\n"
        + "============== \n";
}