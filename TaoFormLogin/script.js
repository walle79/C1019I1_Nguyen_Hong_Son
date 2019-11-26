function login() {
    var ten = document.getElementById("username").value;
    regexp = /^[a-zA-Z0-9]{3,30}$/;
    if(regexp.test(ten)){
        console.log("Tên hợp lệ");
    } else {
        var loidangnhap = "Tên không hợp lệ! Phải từ 3-30 ký tự và không chứa ký tự đặc biệt!";
        document.getElementById("login-false").innerHTML = loidangnhap;
    }
    var mk = document.getElementById("password").value;
    if(ten == "0778767185" && mk == "sondanggett"){
        window.location = "https://www.facebook.com/thuydang1007";
    } else {
        window.location = "https://github.com/walle79/C1019I1_Nguyen_Hong_Son";
    }
}
