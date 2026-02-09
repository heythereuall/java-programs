class TernaryGrade {
    public static void main(String args[]) {
        int marks = Integer.parseInt(args[0]);

        String flag = (marks > 70) ? "Good" : "Not Good";

        System.out.println("Flag = " + flag);
    }
}
