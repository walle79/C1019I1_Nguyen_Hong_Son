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
                "\n1. Id: " + super.getId() +
                "\n2. Dịch vụ thuê: " + super.getServicesName() +
                "\n3. Diện tích sử dụng: " + super.getAresUsed() +
                "\n4. Số lượng người tối đa: " + super.getMaxOfPeople() +
                "\n5. Chi phí thuê: " + super.getFeeRent() +
                "\n6. Kiểu thuê: " + super.getType() +
                "\n7. Dịch vụ đi kèm: " + super.getAccompaniedService() +
                "\n8. Dịch vụ miễn phí đi kèm: " + freeServices;
    }
}
