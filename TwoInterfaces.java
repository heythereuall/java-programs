interface Readable{
    void read();
}

interface Writable{
    void write();
}

class File implements Readable,Writable{
    public void read(){
        System.out.println("Reading file");
    }
    public void write(){
        System.out.println("Writing file");
    }
}

public class Main{
    public static void main(String args[]){
        File f=new File();
        f.read();
        f.write();
    }
}
