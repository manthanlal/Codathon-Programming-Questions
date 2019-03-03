class Mid_Number {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(args.length==1){
            int digit = num % 10;
            num = num / 10;
            digit = num % 10;
            if(digit==2 || digit==3 || digit==5 || digit==7)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
        else if(args.length>1)
            System.out.println("Multiple Input Detected");
        else
            System.out.println("No Input Detected : Something Went Wrong");

    }
}