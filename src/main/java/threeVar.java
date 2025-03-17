public class threeVar extends twoVar {
    public int num2;
    public threeVar(int num, boolean exists, int num2){
        super(num, exists);
        this.num2 = num2;
    }

    public int getNum2(){
        return this.num2;
    }

    public void threeVarPrint(){
        if(this.num2  ==  1){
            System.out.println("Hand one wins");
        } else if (this.num2 == 2){
            System.out.println("Hand 2 wins");
        } else {
            System.out.println("Draw");
        }
    }
}