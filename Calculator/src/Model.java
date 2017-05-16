/**
 * Created by lineville on 5/16/17.
 */
public class Model {

    private int[] nums = new int[10];
    private int modelNumber;
    private int enteredValue;


    public Model(int m){

        this.modelNumber = m;
        for(int i=0; i<10;i++){
            nums[i] = i;
        }
    }

    public int[] getNums(){
        return nums;
    }

    public int getEnteredValue(){
        return enteredValue;
    }



}
