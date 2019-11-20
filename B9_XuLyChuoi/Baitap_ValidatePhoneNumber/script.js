function isPhoneNumber(str) {
    regexp = /^[0-9]{2}(-[0][0-9]{9})$/;
    if(regexp.test(str)){
        alert("Validate Phone Number!");
    } else {
        alert("Invalid Phone Number!");
    }
}