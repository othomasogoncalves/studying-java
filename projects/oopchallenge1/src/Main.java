public class Main {
    public static void main(String[] args) throws Exception {

        // practice 1
        Person person1 = new Person();

        person1.greeting();

        // practice 2
        Calculator calculator1 = new Calculator();
        
        int result = calculator1.doubleNumber(5);
        System.out.println(result);

        // practice 3
        Music music1 = new Music();

        music1.title = "Yes or No";
        music1.artist = "Teto";
        music1.yearRelease = 2025;

        music1.displaysTechnicalSpec();

        music1.asses(5.0);
        music1.asses(9.5);
        music1.asses(7.5);

        double averageReview = music1.checkMedia();
        System.out.println("Average review: " + averageReview);

        // practice 4
        Car myCar = new Car();

        myCar.model = "Audi RS5";
        myCar.year = 2024;
        myCar.color = "Black";

        myCar.displaysTechnicalSpec();

        System.out.println("The age of your car is: " + myCar.calculateCarYear());

        /// practice 5
        Student myStudent = new Student();

        myStudent.name = "Tom";
        myStudent.age = 20;

        myStudent.displaysStudentInfo();
    }
}
