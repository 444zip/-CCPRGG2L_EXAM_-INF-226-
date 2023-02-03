

public class App {

    public static void main(String[] args) {
        
                String fullName = "mikaella mendoza";
        
                removeLetter(fullName);
                
            }
        
            static void removeLetter(String str) {
               
                extractLetters(str, "");
        
            } 
        
            static String extractLetters(String str, String result) {
        
                if(str.length() == 0) {
                    return result;
                }
                char n = str.charAt(0);
                switch (n) {
                
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                  
                System.out.println(result + str.substring(1));
                    
                    return extractLetters(str.substring(1), result);
                    
                    default:
                    
                    return n + extractLetters(str.substring(1), result + n);
                }
            }
   
            }
        