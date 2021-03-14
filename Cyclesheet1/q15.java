class methods
{
    static int wordCount(String a)
    {
         String arr[] = a.split(" ");
        return arr.length;
    }
    static void arrayToString(char a[])
    {
        String s = new String(a);
        System.out.println("String= "+s);
    }
    static void mostFrequent(String a)
    {
        char arr [] = a.toCharArray();
        int c=0,t=0,j;
        char ch=arr[0];
        for(int i=0 ; i<arr.length;i++)
        {
            t=0;
            for(j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    t++;
                }
            }
            if(t>c)
            {
                c=t;
                ch = arr[i];
            }
        }
        System.out.println("Most Frequent:"+ch);
    }
}
public class q15
{
    public static void main(String args[])
    {
        methods obj = new methods();
        String a1 = new String();
        a1="Hello there, how are you?";
        char a2[]={'h','e','l','l','o','!'};
        String a3 = new String();
        a3="arrrrahhhhrrrrkddddokkkkkk";
        System.out.println("words in: "+a1+"="+obj.wordCount(a1));
        obj.arrayToString(a2);
        obj.mostFrequent(a3);
    }
}