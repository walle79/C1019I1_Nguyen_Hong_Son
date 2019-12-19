package Models;

public class Room extends Services{
    private String freeServices;

    public Room() {
    }

    public Room(String servicesName, double aresUsed, int feeRent, int maxOfPeople, String type, String id, String freeServices) {
        super(servicesName, aresUsed, feeRent, maxOfPeople, type, id);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
    @Override
    public String showInfo(){
        return  "Room" +
                "\n1. Dịch vụ thuê: " + super.getServicesName() +
                "\n2. Diện tích sử dụng: " + super.getAresUsed() +
                "\n3. Số lượng người tối đa: " + super.getMaxOfPeople() +
                "\n4. Chi phí thuê: " + super.getFeeRent() +
                "\n5. Kiểu thuê: " + super.getType() +
                "\n6. Id: " + super.getId() +
                "\n7. Dịch vụ miễn phí đi kèm: " + freeServices;
    }
}
