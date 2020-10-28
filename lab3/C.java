public class C extends B {
    public static int x=3;
    public void setCx(int aX) {
        x = aX;
    }
    public int getCx(){return x;}
    public void setXInA(int aX) {
        super.setAx(aX);
    }
    public int getXInA() {
        return super.getAx();
    } 
}