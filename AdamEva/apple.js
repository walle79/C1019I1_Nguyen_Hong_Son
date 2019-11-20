var Apple = function () {
    this.weight = 10;
    this.getWeight = function () {
        return this.weight;
    };
    this.decrease = function () {
        this.weight--;
    }
};