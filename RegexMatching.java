class Regex{
    public static void main(String args[]){
        String s="aa";
        if(s.matches("a*"))
            System.out.println("Match");
        else
            System.out.println("No Match");
    }
}
