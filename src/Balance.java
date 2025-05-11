public class Balance {
    int a = 0, b = 0;
    void addRight(int n){
        a+=n;
    }
    void addLeft(int n){
        b+=n;
    }
    String getSituation(){
        if (a==b) return "=";
        else if (a>b) return "r";
        else return "l";
    }
}
