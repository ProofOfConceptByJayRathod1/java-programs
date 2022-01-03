class FinalObject {

    int MAX = 4;
 
    void show()
    {
        System.out.println("final method");
    }
}

class FinalKeyword extends FinalObject
{
    final void show()
    {
        System.out.println("Hello");
    }
  
    public static void main(String args[])
    {

        FinalObject e=new FinalObject();
        e.MAX=5;
        e.show();
    }
}