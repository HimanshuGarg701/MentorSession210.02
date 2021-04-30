public class Practice {
    public static void main(String[] args){
           Person person1 = new Person("Mike", 24, "Australian");
           Person person2 = new Person(25);
           Person person3 = new Person("John", 29);
           Person person4 = new Person("Josh", 27, 12345, "Italian");

           System.out.println(person1.getName());
           person1.eligibleDrinker();
           person4.eligibleDrinker();


           //System.out.println(person1.ssn);
    }
}
