public class solution11 {
    public static void main(String[] args) {
        int creditHour = 3;
        int totalCredits = creditHour * 5;

        double gpa = (calculateGP(35, 50, 5, 10)* 3
                    + calculateGP(35, 50, 5, 10)* 3
                    + calculateGP(35, 50, 5, 10)* 3
                    + calculateGP(35, 50, 5, 10)* 3
                    + calculateGP(35, 50, 5, 10)* 3) / totalCredits;

                    System.out.println("Your GPA is: " + gpa);
    }

    public static double calculateGP(int mid, int finalTerm, int quiz, int assaignment){
        if(mid>35 || finalTerm > 50 || quiz > 5 || assaignment> 10){
            return 0;
          }

          int obtainedMarks = mid + finalTerm + quiz + assaignment;
          double gp = (obtainedMarks / 100.0) * 4.0;
          return gp;
    }
}
