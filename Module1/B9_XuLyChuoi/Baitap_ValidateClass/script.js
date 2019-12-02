function isValidateClass(str) {
    regexp = /^[CAP][0-9]{4}[G-M]$/;
    if(regexp.test(str)){
        alert("Validate Class!");
    } else {
        alert("Invalid Class!");
    }
}