var Mobile = function (tenDienThoai) {
    this.tenDienThoai = tenDienThoai;
    this.getTenDienThoai = function () {
        return this.tenDienThoai;
    }
    this.setPin = function (pin) {
        this.pin = pin;
    };
    this.getPin = function () {
        return this.pin;
    };
    this.setVungNhoLuuTinNhanDangSoanThao = function (vungNhoLuuTinNhanDangSoanThao) {
        this.vungNhoLuuTinNhanDangSoanThao = vungNhoLuuTinNhanDangSoanThao;
    };
    this.getVungNhoLuuTinNhanDangSoanThao = function () {
        return this.vungNhoLuuTinNhanDangSoanThao;
    };
    this.setVungNhoLuuTinNhanTrongHopThuDen = function (vungNhoLuuTinNhanTrongHopThuDen) {
        this.vungNhoLuuTinNhanTrongHopThuDen = vungNhoLuuTinNhanTrongHopThuDen;
    };
    this.getVungNhoLuuTinNhanTrongHopThuDen = function () {
        return this.vungNhoLuuTinNhanTrongHopThuDen;
    };
    this.setVungNhoLuuTinNhanDaGui = function (vungNhoLuuTinNhanDaGui) {
        this.vungNhoLuuTinNhanDaGui = vungNhoLuuTinNhanDaGui;
    };
    this.getVungNhoLuuTinNhanDaGui = function () {
        return this.vungNhoLuuTinNhanDaGui;
    };
    this.setTrangThaiDienThoai = function (trangThaiDienThoai) {
        this.trangThaiDienThoai = trangThaiDienThoai;
    };
    this.getTrangThaiDienThoai = function () {
        return this.trangThaiDienThoai;
    };
    this.kiemTraTrangThaiDienThoai = function () {
        if (this.trangThaiDienThoai == true) {
            return "Trạng thái Điện thoai đang bật";
        } else {
            return "Trạng thái Điện thoai đang tắt";
        }
    };
    this.batDienThoai = function () {
        this.setTrangThaiDienThoai(true);
    };
    this.tatDienThoai = function () {
        this.setTrangThaiDienThoai(false);
    };
    this.sacPinDienThoai = function () {
        var str = "";
        for (var i = this.pin; i <= 100; i++) {
            str += "Pin đang sạc " + i + "\n";
        }
        ;
        return str;
    };
    this.soanTinNhan = function (noiDung) {
        this.setVungNhoLuuTinNhanDangSoanThao(noiDung);
    };
    this.nhanTinNhan = function (noiDung) {
        this.setVungNhoLuuTinNhanTrongHopThuDen(noiDung);
    };
    this.guiTinNhan = function (noiDung) {
        this.setVungNhoLuuTinNhanDaGui(noiDung);
    };
    this.xemTinNhanDen = function () {
        return "Tin nhắn đến : " + this.getVungNhoLuuTinNhanTrongHopThuDen();
    };
    this.xemTinNhanDaGui = function () {
        return "Tin nhắn đã gửi : " + this.getVungNhoLuuTinNhanDaGui();
    };
    this.displayInit = function () {
        return "Bạn đã khởi tạo 1 chiếc điện thoai " + this.tenDienThoai;
    }
    this.displayTrangThaiPin = function () {
        this.setPin(0);
        return "Trạng thái pin hiện tại " + this.getPin();
    };

};