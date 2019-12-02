function findCard(car) {
    for(i=0;i<arrCar.length;i++) {
        switch (car) {
            case "T":
                alert("Toyota");
                return true;
                break;
            case "M":
                alert("Mercedes");
                return true;
                break;
            case "H":
                alert("Huyndai");
                return true;
                break;
            case "D":
                alert("Daewon");
                return true;
                break;
        }
    }
}