function displayTotalPayOfCustomer() {
    choose = prompt("Chọn khách hàng muốn thanh toán \n" + get2InforCustomer() + arrListCustomer.length + ".Back");
    switch (choose) {
        case (arrListCustomer.length) + "":
            displayMainMenu();
            break;
        default:
            alert("Tổng tiền phải trả của khách hàng" + " " + arrListCustomer[choose].getNameCustomer()+"là:"+" "
                + arrListCustomer[choose].getTotalPays() + "$");
    }
    displayMainMenu();
}