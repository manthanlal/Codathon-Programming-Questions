class Reverse_Number {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int digit=0, reverse=0;
        if(args.length==1){
            while(num!=0){
                digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num/10;
            }
            System.out.println(reverse);
        }
        else if(args.length>1)
            System.out.println("Multiple Argument detected");
        else
            System.out.println("No Input Detected : Something Went Wrong");
    }
}
