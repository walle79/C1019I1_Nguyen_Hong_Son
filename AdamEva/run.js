var apple = new Apple();
var adam = new Human();
var trangThaiNguoi = document.getElementById("trangThaiNguoi");
var trangtThaiTao = document.getElementById("trangThaiTao");
function eatApple() {
    adam.getWeight();
    apple.decrease();
    trangThaiNguoi.innerText = adam.getWeight();
    trangtThaiTao .innerText = apple.getWeight();
}