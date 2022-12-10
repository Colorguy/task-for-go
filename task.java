public class task {
    public static void main(String[] args){
        int n = 100;
        for(int i = 1; i < (n+1); i++){
            if (i % 3 == 0 && i % 15 != 0){// выбираем кратные 3, но исключая кратные 15
                System.out.println("Fizz");
            }else{
                if(i % 5 == 0 && i % 15 != 0){// выбираем кратные 5, но исключая кратные 15
                    System.out.println("Buzz");
                }else{
                    if(i % 15 == 0){//кратные 15
                        System.out.println("FizzBuzz");
                    }else{
                        System.out.println(i);
                    }
                }
            }
        }
    }
}