public class StudentEnrollment {
    public static void main(String[] args) {
        Student student1 = new Student("7987908", "James", "Arnold", "Comp Sci", 20);
        System.out.println(student1);

        Student student2 = new Student("98798", "Rebecca", "smith", "Cosmo", 18);
        System.out.println(student2);

        Student student3 = new Student("4326234", "Chelsey", "Williams", "Mechanics", 19);
        System.out.println(student3);

        student3.setMajor("Computer Science");
        System.out.println(student3);


    }
}

