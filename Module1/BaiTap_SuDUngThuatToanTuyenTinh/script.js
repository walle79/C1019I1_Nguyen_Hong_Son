function viettelPhoneNumber(){
    var arrVTPhone = [];
    regexp = /(((09)[6-8])|((03)[2-9])|086)[0-9]{7}/;
    for(i=0;i<arrPhoneNumber.length;i++){
        if(regexp.test(arrPhoneNumber[i])){
            arrVTPhone.push(arrPhoneNumber[i]);
        }
    }
    document.write("Danh sách số ĐT Viettel là: " + "<br/>" + arrVTPhone.join("<br/>"));
}
