
abstract class Calculate
{
    abstract int add(int a,int b);
}
class Add extends Calculate
{

    int add(int a,int b)
    {
        return(a+b);
    }

}
class Welcome
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Add ob = new Add();
        System.out.println(ob.add(a,b));
    }
}