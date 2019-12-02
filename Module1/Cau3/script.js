function isPrime(num) {
    for(i=2;i<num;i++){
        if(num%i==0){
            alert(num + " không là số nguyên tố!");
            return false;
        }
    }
    alert(num + " là số nguyên tố");
    return true;
}