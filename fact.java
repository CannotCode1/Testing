public class fact{

        public  int factorial(int x){
            if(x>=1){
                return(x * factorial(x-1));
            }else{
                return 1;
            }
        }
        public int bunnyEars(int bunnies){
            if(bunnies == 0){
                return 0;
            }else{
                return 2+bunnyEars(bunnies-1);
            }
        }
        public int fibonacci(int n) {
            if(n == 0){
              return 0;
            }if(n == 1){
              return 1;
            }else{
              return fibonacci(n-1)+fibonacci(n-2);
            }
          }
        public int bunnyEars2(int bunnies){
                boolean even = false;
                if(bunnies % 2 == 0){
                  even = true;
                }
                if(bunnies<=0){
                  return 0;
                }else if(even == true){
                  return 3 + bunnyEars2(bunnies-1);
                }else{
                  return 2 + bunnyEars2(bunnies-1);
                }
        }
        public String doubleChar(String str){
            String result = "";
            for(int i = 0;i<str.length();i++){
                char temp = str.charAt(i);
                result = result + temp + temp;
            }
            return result;
        }
        public int countHi(String str){
            int result = 0;
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == 'h'){
                    if(i+1<str.length()){
                        if(str.charAt(i+1) == 'i'){
                            result++;
                    }
                    }
                    
                }
            }
            return result;
        }
        public boolean catDog(String str) {
            Boolean result = false;
            int counterCat = 0;
            int counterDog = 0;
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == 'c'){
                    if(i+2<str.length()){
                        if(str.charAt(i+1) == 'a'){
                            if(str.charAt(i+2) == 't'){
                                counterCat++;
                            }
                        }
                    }
                }
                if(str.charAt(i) == 'd'){
                    if(i+2<str.length()){
                        if(str.charAt(i+1) == 'o'){
                            if(str.charAt(i+2) == 'g'){
                                counterDog++;
                            }
                        }
                    }
                }
            }


            if(counterCat == counterDog){
                result = true;
            }
            return result;
        }
        public int countCode(String str) {
            int result = 0;
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == 'c'){
                    if(i+3<str.length()){
                        if(str.charAt(i+1) == 'o'){
                            if(str.charAt(i+3) == 'e'){
                                result++;
                            }
                        }
                    }
                }
            }
            return result;
        }
        public int sumDigits(int n){
            if(n<10){
                return n;
            }
            return n%10+sumDigits(n/10);
        }
        public int count7(int n) {
            if(n == 0){
                return 0;
            }
            if(n%10 == 7){
                return 1 + count7(n/10);
            }
            return count7(n/10);
        }
        public int powerN(int base, int n){
            if(n == 0){
                return 1;
            }
            if(n == 1){
                return base;
            }
            if(base == 0){
                return 0;                
            }
            if(base == 1){
                return 1;
            }
            return base *powerN(base,n-1);
        }
        
}