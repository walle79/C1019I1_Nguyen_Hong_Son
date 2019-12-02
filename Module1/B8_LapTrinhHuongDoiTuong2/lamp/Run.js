var bongDen = new ElectricLamp();
var congTac = new SwitchButton();
var trangThaiBongDen = document.getElementById("trangThaiBongDen");
congTac.connectToLamp(bongDen);

function batCongTac() {
    congTac.switchOn();
    trangThaiBongDen.innerText = bongDen.getStatus();
}
function tatCongTac() {
    congTac.switchOff();
    trangThaiBongDen.innerText = bongDen.getStatus();
}