function displayInformationCustomer (){
    choose = prompt("Chọn khách hàng muốn hiển thị \n" + get2InforCustomer() + arrListCustomer.length + ".Back");
    switch (choose) {
        case (arrListCustomer.length) + "":
            displayMainMenu();
            break;
        default:
            displayCustomer(choose);
    }
    displayMainMenu();
}

function get2InforCustomer() {
    let result = "";
    for (i = 0; i < arrListCustomer.length; i++) {
        result += "Số thứ tự:" + " " + i + "\n"
            + "0.Name:" + " " + arrListCustomer[i].getNameCustomer() + "\n"
            + "1.ID Card" + " " + arrListCustomer[i].getIdCard() + "\n"
            + "============================\n";
    }
    return result;
}

function displayCustomer(index) {
    alert(getInformationCustomer(index));
}

function getInformationCustomer(index) {
    return "0. Name: " + " " + arrListCustomer[index].getNameCustomer() + "\n"
        + "1. ID Card: " + " " + arrListCustomer[index].getIdCard() + "\n"
        + "2. Birthday: " + " " + arrListCustomer[index].getBirthdayCustomer() + "\n"
        + "3. Email: " + " " + arrListCustomer[index].getEmailCustomer() + "\n"
        + "4. Address: " + " " + arrListCustomer[index].getAddressCustomer() + "\n"
        + "5. Type Customer: " + " " + arrListCustomer[index].getTypeCustomer() + "\n"
        + "6. Discount: " + " " + arrListCustomer[index].getDiscount() + "\n"
        + "7. Number Of Accompanying: " + " " + arrListCustomer[index].getNumberOfAccompanying() + "\n"
        + "8. Type Room: " + " " + arrListCustomer[index].getTypeRoom() + "\n"
        + "9. Rent Days: " + " " + arrListCustomer[index].getRentDays() + "\n"
        + "10. Type Service: " + " " + arrListCustomer[index].getTypeService() + "\n"
        + "11. TotalPays: " + " " + arrListCustomer[index].getTotalPays() + "\n"
        + "============== \n";
}