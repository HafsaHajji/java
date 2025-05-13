class simpleEx{
    public static void main(String args[]) {
        // int x = 10;
        // int y = 12;
        // if (x+y>20){
        //     System.out.println("x + y is greater than 20");
        // }

        // int age= 20;
        // if(age >=20){
        //     System.out.println("You are allowed to enter");
        // }
        // int age = 18;
        // if(age < 17){
        //     System.out.println("You are not allowed to enter");
        // } else{
        //     System.out.println("You are allowed to enter");
        // }

        // checking cities using elsif
        // String city = "mogadishu";
        // if(city == "kismayo"){
        //     System.out.println("Welcome to Kismayo city");
        // }else if(city == "Baydhabo"){
        //     System.out.println("Welcome to Baydhabo city");
        // } else if (city == "hargeisa"){
        //     System.out.println("Welcome to hargeisa city");
        // } else {
        //     System.out.println(city);
        // }

        String city = "mogadishu";
        String nationality = "Somali";
        if(city == "kismayo" && nationality == "Somali"){
            System.out.println("you are not eligable to vote");
        }else if(city == "Baydhabo" && nationality == "Kenya"){
            System.out.println("you are not eligable to vote");
        } else if (city == "mogadishu" && nationality == "somali"){
            System.out.println("you are eligable to vote");
        } else {
            System.out.println("you are either somali or your city is mogadisho");
        }
    }
}