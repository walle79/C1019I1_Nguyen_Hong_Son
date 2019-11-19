var SwitchButton = function () {
    this.setStatus = function (status) {
        this.status = status;
    }
    this.getStatus = function () {
        return this.status;
    };
    this.getLamp = function () {
        return this.lamp;
    };
    this.connectToLamp = function (lamp) {
        this.lamp = lamp;
    };
    this.switchOff = function () {
        this.setStatus(false);
        this.lamp.turnOff();
    };
    this.switchOn = function () {
        this.setStatus(true);
        this.lamp.turnOn();
    };
}