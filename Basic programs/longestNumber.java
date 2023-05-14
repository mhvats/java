class longestNumber{
    public static int check(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b > a && b > c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String args[]){
        int a =5, b=6, c=2;
        int res = check(a, b, c);
        System.out.println(res);
    }
}