package Models;

public class Villa extends Services {
    private String roomStandard;
    private String convenientOther;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String servicesName, double aresUsed, int feeRent, int maxOfPeople, String type, String id, String roomStandard, String convenientOther, double poolArea, int floor) {
        super(servicesName, aresUsed, feeRent, maxOfPeople, type, id);
        this.roomStandard = roomStandard;
        this.convenientOther = convenientOther;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientOther() {
        return convenientOther;
    }

    public void setConvenientOther(String convenientOther) {
        this.convenientOther = convenientOther;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo(){
        return  "Villa" +
                "\n1. Dịch vụ thuê: " + super.getServicesName() +
                "\n2. Diện tích sử dụng: " + super.getAresUsed() +
                "\n3. Số lượng người tối đa: " + super.getMaxOfPeople() +
                "\n4. Chi phí thuê: " + super.getFeeRent() +
                "\n5. Kiểu thuê: " + super.getType() +
                "\n6. Id: " + super.getId() +
                "\n7. Tiêu chuẩn phòng: " + roomStandard +
                "\n8. Tiện nghi khác: " + convenientOther +
                "\n9. Diện tích hồ bơi: " + poolArea +
                "\n10. Số tầng: " + floor;
    }
}
