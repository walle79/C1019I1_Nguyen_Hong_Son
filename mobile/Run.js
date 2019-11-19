
var nokia = new Mobile("nokia");
var pin1 = document.getElementById("pin1");
var nokiaResult = document.getElementById("nokiaResult");
var batTatDienThoai1 = document.getElementById("batTatDienThoai1");
displayInit(nokia);
displayTrangThaiPin(nokia);

var iphone = new Mobile("iphone");
var pin2 = document.getElementById("pin2");
var iphoneResult = document.getElementById("iphoneResult");
displayInit(iphone);
displayTrangThaiPin(iphone);


function displayInit(mobile) {
    switch (mobile.getTenDienThoai()) {
        case  "nokia":
            nokiaResult.innerText =  mobile.displayInit();
            break;
        case  "iphone":
            iphoneResult.innerText =  mobile.displayInit();
            break;
    }
}
function displayTrangThaiPin(mobile) {
    switch (mobile.getTenDienThoai()) {
        case  "nokia":
            pin1.innerText =  mobile.displayTrangThaiPin();
            break;
        case  "iphone":
            pin2.innerText =  mobile.displayTrangThaiPin();
            break;
    }
}
function batDienThoai(tenDienThoai) {
    switch (tenDienThoai) {
        case  "nokia":
            nokia.batDienThoai();
            nokiaResult.innerText = "nokia có" + nokia.kiemTraTrangThaiDienThoai();
            break;
        case  "iphone":
            iphone.batDienThoai();
            iphoneResult.innerText = "iphone có" + iphone.kiemTraTrangThaiDienThoai();
            break;
    }
}
function tatDienThoai(tenDienThoai) {
    switch (tenDienThoai) {
        case  "nokia":
            nokia.tatDienThoai();
            nokiaResult.innerText = "nokia có" + nokia.kiemTraTrangThaiDienThoai();
            break;
        case  "iphone":
            iphone.tatDienThoai();
            iphoneResult.innerText = "iphone có" + iphone.kiemTraTrangThaiDienThoai();
            break;
    }
}
function sacPin(tenDienThoai) {
    switch (tenDienThoai) {
        case  "nokia":
            nokiaResult.innerText = "nokia có pin " + nokia.sacPinDienThoai();
            break;
        case  "iphone":
            iphoneResult.innerText = "iphone có pin" + iphone.sacPinDienThoai();
            break;
    }
}