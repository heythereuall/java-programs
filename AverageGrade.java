class AverageGrade {
    public static void main(String args[]) {
        int m1 = Integer.parseInt(args[0]);
        int m2 = Integer.parseInt(args[1]);
        int m3 = Integer.parseInt(args[2]);

        int avg = (m1 + m2 + m3) / 3;

        System.out.println("Average = " + avg);

        if (avg > 80)
            System.out.println("Grade: Excellent");
        else if (avg > 60)
            System.out.println("Grade: Good");
        else if (avg > 35)
            System.out.println("Grade: Pass");
        else
            System.out.println("Grade: Fail");
    }
}
