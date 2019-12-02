function is_usZipCode(str) {
    regexp = /^[0-9]{5}(?:-[0-9]{4})?$/;
    if (regexp.test(str)) {
        alert("Exactly!!");
    } else {
        alert("False!")
    }
}