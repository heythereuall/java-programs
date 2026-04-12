class Main{
    public static <T> void print(T arr[]){
        for(T x:arr)
            System.out.print(x+" ");
    }

    public static void main(String args[]){
        Integer a[]={1,2,3};
        String b[]={"A","B","C"};

        print(a);
        System.out.println();
        print(b);
    }
}
