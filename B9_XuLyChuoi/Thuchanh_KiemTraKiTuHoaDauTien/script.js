function isFirstLetterUpperCase(str) {
    regexp = /^[A-Z]/;
    if (regexp.test(str)) {
        alert("Kí tự đầu là chữ hoa!");
    } else {
        alert("Kí tự đầu là chữ thường!");
    }
}
