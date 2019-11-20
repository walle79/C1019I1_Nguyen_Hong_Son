function validateAcc(str) {
    regexp = /^[_a-z0-9]{6,}$/;
    if(regexp.test(str)){
        alert("Validate Account!");
    } else {
        alert("Invalid Account!");
    }
}