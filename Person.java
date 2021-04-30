public class Person {
    private String name = "Hidden";
    private int age;
    private int ssn=0;
    private String nationality = "American";
    boolean validAttendant = false;

    public Person(String name, int age, int ssn, String nationality) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.nationality = nationality;
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    private void addNumbers(int x, int y){
        System.out.println(x+y);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eligibleDrinker(){
        checkSSN(this.ssn);
        if(validAttendant==true && this.age > 18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

    private void checkSSN(int ssn){
        if(ssn==0){
            System.out.println("Invalid identity");
        }else{
            validAttendant = true;
            System.out.println("Valid Identity");
        }
    }

    public void updateSSN(int currentSSN, int newSSn){
        if(currentSSN == this.ssn){
            this.ssn = newSSn;
        }else{
            System.out.println("Sorry the current ssn you provided is wrong");
        }
    }
}
