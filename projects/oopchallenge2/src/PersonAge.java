public class PersonAge {
    private String personName;
    private int pAge;

    public String getPersonName() {
        return personName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public void verifypAge() {
        if (pAge >= 18) {
            System.out.println("they are of legal age.");
        } else {
            System.out.println("is not of legal age");
        }
    }
}
