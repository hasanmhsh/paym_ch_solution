public class SelectedIcon {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solution(new int[]{100,200,100},new int[]{50,100,100},100,100));
        System.out.println(solution(new int[]{100,200,100},new int[]{50,100,100},100,70));
        System.out.println(solution(new int[]{100,200,100},new int[]{50,100,100},200,60));
    }





    public static int solution(int [] A, int [] B, int X, int Y){
        for (int i = 0 ; i < A.length ; i++){
            int horizontalComponentLength = Math.abs(A[i] - X);
            int verticalComponentLength = Math.abs(B[i] - Y);
            double tapToCenterLength = Math.sqrt(
                    Math.pow((double)horizontalComponentLength,2.0D) +
                            Math.pow((double)verticalComponentLength, 2.0D)
            );
            if(tapToCenterLength <= 20)
                return i;
        }
        return -1;
    }
}
