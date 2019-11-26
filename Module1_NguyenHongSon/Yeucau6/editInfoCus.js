function editInformationCustomer() {
    choose = prompt("Chọn khách hàng muốn edit \n" + get2InforCustomer() + arrListCustomer.length + ".Back");
    switch (choose) {
        case (arrListCustomer.length) + "":
            displayMainMenu();
            break;
        default:
            displayEditCustomer(choose);
    }
}
function displayEditCustomer(index) {
    choose = prompt("Chọn đối tượng cần chỉnh sửa: \n" + getInformationCustomer(index)
        + 12 + ".Back");
    processEditCustomer(index);
}

function processEditCustomer(index) {
    switch (choose) {
        case "0":
            arrListCustomer[index].setNameCustomer(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "1":
            arrListCustomer[index].setIdCard(prompt("Nhập nội dung muốn thay đổi"));
            displayEditCustomer(index);
            break;
        case "2":
            arrListCustomer[index].setBirthdayCustomer( prompt("Nhập nội dung muốn thay đổi"));
            displayEditCustomer(index);
            break;
        case "3":
            arrListCustomer[index].setEmailCustomer(prompt("Nhập nội dung muốn thay đổi"));
            displayEditCustomer(index);
            break;
        case "4":
            arrListCustomer[index].setAddressCustomer(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "5":
            arrListCustomer[index].setTypeCustomer(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "6":
            arrListCustomer[index].setDiscount(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "7":
            arrListCustomer[index].setNumberOfAccompanying(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "8":
            arrListCustomer[index].setTypeRoom(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "9":
            arrListCustomer[index].setRentDays(prompt("Nhập nội dung muốn thay đổi"))  ;
            displayEditCustomer(index);
            break;
        case "10":
            arrListCustomer[index].setTypeService(prompt("Nhập nội dung muốn thay đổi")) ;
            displayEditCustomer(index);
            break;
        case "11":
            displayMainMenu();
    }
}