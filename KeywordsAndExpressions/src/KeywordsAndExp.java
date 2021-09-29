public class KeywordsAndExp {

    public static void main(String[] args) {

        //Keywords
        //cannot use int int = 5;or false,true,null//not valid
        int int2 = 5; //valid

        //Expressions
        // a mile is equal to 1.609344 Kilometres
        double kilometres = (100 * 1.609344);
        int highscore = 50;

        if(highscore == 50){
            System.out.println("This is an expression");

        }

        //Challenge:Which parts of the code below are expressions

        int score = 100;                                  //exp: score = 100
        if (score > 99){                                  //exp: score > 99
            System.out.println("You got the high score!");//exp: "You got the high score!"
            score = 0;                                    //exp: score = 0
        }


    }
}
