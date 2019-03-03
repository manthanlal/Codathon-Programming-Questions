class Reverse_Number {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int digit=0, reverse=0, numcpy = num;
        if(args.length==1){
            while(numcpy!=0){
                digit = numcpy % 10;
                reverse = reverse * 10 + digit;
                numcpy = numcpy/10;
            }
            System.out.println(reverse);
        }
        else if(args.length>1)
            System.out.println("Multiple Argument detected");
        else
            System.out.println("No Input Detected : Something Went Wrong");
    }
}