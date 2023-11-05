public class Person {
    private String lastName;
    private String firstName;
    private int birthOfYear, birthOfMonth, birthOfDay;
    private String country;
    private String INN;

    public Person(String lastName, String firstName, int birthOfYear, int birthOfMonth, int birthOfDay, String country, String INN) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthOfYear = birthOfYear;
        this.birthOfMonth = birthOfMonth;
        this.birthOfDay = birthOfDay;
        this.country = country;
        this.INN = INN;
    }

    public String getLastName() { return lastName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }
    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public int getBirthOfMonth() {
        return birthOfMonth;
    }
    public void setBirthOfMonth(int birthOfMonth) {
        this.birthOfMonth = birthOfMonth;
    }

    public int getBirthOfDay() {
        return birthOfDay;
    }
    public void setBirthOfDay(int birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getINN() {
        return INN;
    }
    public void setINN(String INN) {
        this.INN = INN;
    }
}
