import java.text.DecimalFormat;

public class SimpleCalculator {
    private String number ;
    private double res ;
    private double result = 0;
    private char firstChar ;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    int count = 0;
    public void calResult(String cmd) throws UnknownCmdException{
        String[] a = cmd.split(" ");
        if( a.length == 2){

            if(isNumber(a[1])){
                number = a[1];
            }
            else {
                number = a[1];
            }


            firstChar = cmd.charAt(0);
            if(isOperator(firstChar)&&isNumber(number)){
                res =Double.parseDouble(number) ;
                if(firstChar == '+'){
                    result = result + res ;
                }
                else if(firstChar == '-'){
                    result = result - res ;
                }
                else if(firstChar == '*'){
                    result = result * res;
                }
                else if(firstChar == '/'){
                    if(res == 0){
                        throw new UnknownCmdException("Can not divide by 0");
                    } else {
                        result = result / res ;
                    }
                }
            }
            else if(!isOperator(firstChar)&&isNumber(number)){
                throw new UnknownCmdException(firstChar+" is an unknown operator");
            }
            else if(!isNumber(number)&&isOperator(firstChar)){

                throw new UnknownCmdException(number +" is an unknown value");
            }
            else if(firstChar == '/' && res == 0){
                throw new UnknownCmdException("Can not divide by 0");
            }
            else{
                throw new UnknownCmdException( firstChar+" is an unknown operator and "+number+" is an unknown value");
            }
        }
        else{
            throw new UnknownCmdException( "Please enter 1 operator and 1 value separated by 1 space");
        }
    }
    public String getMsg(){

        if(count==0){
            count++;
            return "Calculator is on. Result = "+df.format(result)  ;
        }
        else if(count==1){
            count++;
            return "Result "+firstChar+" "+df.format(res)+" = "+df.format(result)+". New result = "+df.format(result);
        }

        else if(count==-1){
            count++;
            return  "Final result = "+df.format(result);
        }
        else{
            count++;
            return "Result "+firstChar+" "+df.format(res)+" = "+df.format(result)+". Updated result = "+df.format(result);
        }

    }

    public boolean endCalc(String cmd){
        if(cmd.length()==1){
            char A = cmd.charAt(0);
            if(cmd.length()==1 && A=='R'||A=='r'){
                count = -1;
                return true;
            }
        }
        return false;
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static boolean isNumber(String number){
        try{
            double a = Double.parseDouble(number);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}