package Models;

public class House extends Services {
    private String roomStandard;
    private String convenientOther;
    private int floor;

    public House() {
        super();
    }

    public House(String roomStandard, String convenientOther, int floor) {
        this.roomStandard = roomStandard;
        this.convenientOther = convenientOther;
        this.floor = floor;
    }

    public House(String servicesName, double aresUsed, int feeRent, int maxOfPeople, String type, String id, String roomStandard, String convenientOther, int floor) {
        super(servicesName, aresUsed, feeRent, maxOfPeople, type, id);
        this.roomStandard = roomStandard;
        this.convenientOther = convenientOther;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo(){
        return  "House" +
                "\n1. Dịch vụ thuê: " + super.getServicesName() +
                "\n2. Diện tích sử dụng: " + super.getAresUsed() +
                "\n3. Số lượng người tối đa: " + super.getMaxOfPeople() +
                "\n4. Chi phí thuê: " + super.getFeeRent() +
                "\n5. Kiểu thuê: " + super.getType() +
                "\n6. Id: " + super.getId() +
                "\n7. Tiêu chuẩn phòng: " + roomStandard +
                "\n8. Tiện nghi khác: " + convenientOther +
                "\n9. Số tầng: " + floor;
    }
}
