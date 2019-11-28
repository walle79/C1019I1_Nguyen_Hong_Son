function removeFruit(traiCay) {
    for(i=0;i<arrFruit.length;i++){
        switch (traiCay) {
            case "Apple":
                arrFruit.splice(0,1);
                alert(arrFruit);
                return true;
                break;
            case "Banana":
                arrFruit.splice(1,1);
                alert(arrFruit);
                return true;
                break;
            case "Lemon":
                arrFruit.splice(2,1);
                alert(arrFruit);
                return true;
                break;
        }
    }
}