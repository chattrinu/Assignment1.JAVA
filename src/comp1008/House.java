package comp1008;

public class House {
            // create 3 variables with unique data type and unique accessibility
            public String name;
            private double grade;
            int studentID;

    // create 7 possible construction including default construction.

            // default construction
            public House (){}
            public House (String name,Double grade, int studentID)
            {
                this.name=name;
                this.grade = grade;
                this.studentID= studentID;
            }
            public House (String name,int studentID, Double grade)
            {
                this.name=name;
                this.studentID= studentID;
                this.grade=grade;

            }
            public House(double grade,String name,int studentID)
            {

                this.grade=grade;
                this.name=name;
                this.studentID= studentID;
            }
            public House(double grade,int studentID,String name)
            {
                this.grade=grade;
                this.studentID= studentID;
                this.name=name;
            }
            public House(int studentID,String name, double grade)
            {

                this.studentID= studentID;
                this.name=name;
                this.grade=grade;


            }
            public House(int studentID,double grade,String name)
             {
                 this.studentID= studentID;
                 this.grade=grade;
                 this.name=name;
             }

             // getter method to display the grade which is private accessibility.
             public double getGrade() {

                return grade;
             }


}
