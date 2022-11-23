package comp1008;

public class HouseRunner {
    public static void main(String[] args) {
        // create 3 objects
        House student1 = new House("Jame Mars",82.5, 12110);
        House student2 = new House("Tony Hunk",12111,77.9);
        House student3  = new House(81.6,"Mila Break",12112);

       // print out instance value of 3 objects House
        System.out.printf("Student name is %s%nStudent ID is %d%nGrade is %.2f%n",student1.name,student1.studentID,student1.getGrade());
        System.out.println();
        System.out.printf("Student name is %s%nStudent ID is %d%nGrade is %.2f%n",student2.name,student2.studentID,student2.getGrade());
        System.out.println();
        System.out.printf("Student name is %s%nStudent ID is %d%nGrade is %.2f%n",student3.name,student3.studentID,student3.getGrade());
        System.out.println();


    }



}
