import java.util.Arrays;

class Buss {
    private String driverName;
    private String busNumber;
    private String routeNumber;
    private String brand;
    private int yearOfOperation;
    private int mileage;

    // Конструктори
    public Buss(String driverName, String busNumber, String routeNumber, String brand, int yearOfOperation, int mileage) {
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfOperation = yearOfOperation;
        this.mileage = mileage;
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfOperation() {
        return yearOfOperation;
    }

    public void setYearOfOperation(int yearofoperation) {
        this.yearOfOperation = yearofoperation;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Метод toString для виведення об'єкта у рядок
    @Override
    public String toString() {
        return "Buss{" +
                "driverName='" + driverName + '\'' +
                ", busNumber='" + busNumber + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfOperation=" + yearOfOperation +
                ", mileage=" + mileage +
                '}';
    }

    // Додатковий метод для створення масиву об'єктів Bus
    public static Buss[] createBusArray() {
        Buss[] buses = new Buss[3];
        buses[0] = new Buss("Син Батька", "109", "ВДНХ-Либідська", "Mercedes", 2018, 50000);
        buses[1] = new Buss("Син Матері", "М2", "ВДНХ-Деміївська", "Volvo", 2019, 60000);
        buses[2] = new Buss("Онук Діда", "109М", "Васильківська-Гуртожиток", "BMW", 2017, 45000);
        return buses;
    }

    public static void main(String[] args) {
        // Створення масиву об'єктів Bus
        Buss[] buses = createBusArray();

        // Виведення всіх автобусів
        System.out.println("Всі автобуси:");
        for (Buss bus : buses) {
            System.out.println(bus);
        }

        // а) Список автобусів для заданого номера маршруту
        String desiredRoute = "куди поїхати з гурртожитку?...";
        System.out.println("\nСписок автобусів для маршруту " + desiredRoute + ":");
        for (Buss buss : buses) {
            if (buss.getRouteNumber().equals(desiredRoute)) {
                System.out.println(buss);
            }
        }

        // Б) Список автобусів, які експлуатуються більше заданого терміну
        int yearsOfOperationThreshold = 2;
        System.out.println("\nСписок автобусів, які експлуатуються більше " + yearsOfOperationThreshold + " років:");
        for (Buss buss : buses) {
            if (2023 - buss.getYearOfOperation() > yearsOfOperationThreshold) {
                System.out.println(buss);
            }
        }

        // с) Список автобусів, пробіг у яких більше заданої відстані
        int mileageThreshold = 55000;
        System.out.println("\nСписок автобусів з пробігом більше " + mileageThreshold + " км:");
        for (Buss bus : buses) {
            if (bus.getMileage() > mileageThreshold) {
                System.out.println(bus);
            }
        }
    }
}
