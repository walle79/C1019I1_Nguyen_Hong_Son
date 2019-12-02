function validateEmail(str) {
    regexp = /^[A-Za-z0-9]+(\.[A-Za-z0-9]*)?@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
    if(regexp.test(str)){
        alert("Validate Mail!");
    } else {
        alert("Underfined!");
    }
}