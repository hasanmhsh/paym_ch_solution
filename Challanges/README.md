# Android challenge answer 
# Name : Hasan Mohamed Shehata Ebrahim
# ID : JP-045


## ABString problem Solution



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














## Selected icon problem solution



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



# McqAndroid

1-Which of the following versions of android introduces the runtime permissions model?

Answer : C
C)Marshamallow


---------------------------------------------------------------------------------------------------




2-Given a service class ExampleService ……..

Answer : D
D) The service cannot be started as it is not enabled
Also the service is a component which need to be started by another component such as activity or another service 
Also service is initially run in the main UI thread



---------------------------------------------------------------------------------------------------


3-Which of the following class is not a subclass of the context class

Answer : C
C) Fragment





---------------------------------------------------------------------------------------------------


4-Which of the following permissions is not considered dangerous

Answer : C
C) INTERNET





---------------------------------------------------------------------------------------------------

5-If you would like to take a picture using one of the installed camera applications , allowing the user to choose the application , you should

Answer : D
D) Send an implicit intent.




---------------------------------------------------------------------------------------------------

6-which of the following may be a result of memory leaks?

Answer : D
D) OutOfMemoryError





---------------------------------------------------------------------------------------------------

7-Which of the following is the least likely source of memory leaks?

Answer : C
C) Unregistered Listeners


8-Which of the following units is not density independent?

Answer  : B
B) px


---------------------------------------------------------------------------------------------------

9-Which of the following statements is the proper way to start another activity from the current activity?

Answer : A
A) startActivity(new Intent(this, AnotherActivity.class));





---------------------------------------------------------------------------------------------------

10 – which of the following is not a reason for using ProGuard?

Answer : B
B) hiding secret values in the code





