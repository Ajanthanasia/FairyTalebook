public class auto_Generate_id
{
    static int no=0;
    public static void main(String args[])
    {
        doll model_1=new doll("Nayanthara",100);
        no=nog(no);
        model_1.biodetail();
        System.out.println("Model Number is "+no);

        doll model_2=new doll("Ananya_Doraa",170);
        no=nog(no);
        model_2.biodetail();
        System.out.println("Model Number is "+no);


    }
    static int nog(int x)
    {
        x++;
        return x;
    }
}
class doll
{
    String name;
    int height;
    doll(String n,int h)
    {
        name=n;
        height=h;
    }
    void biodetail()
    {
        System.out.println("Name : "+name+" and height of body is : "+height);
    }
}
/* Out put
Name : Nayanthara and height of body is : 100
Model Number is 1
Name : Ananya_Doraa and height of body is : 170
Model Number is 2
*/
