public class ABString {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solution("abba"));
    }

    //Letter 'a' 'b' ocuurance
    public static boolean solution(String str){
        str = str.toLowerCase();
        boolean isBFound = false;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'b') {
                isBFound = true;
                continue;
            }
            if(isBFound && str.charAt(i) == 'a')
                return false;
        }
        return true;
    }
}
