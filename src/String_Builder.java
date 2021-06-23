public class String_Builder
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        //StringBuilder sb1 = "Hello";             //error
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("1234567891234");              // new capacity = (old capacity * 2) + 2
        System.out.println(sb.capacity());
    }
}
