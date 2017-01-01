package jp.ac.uryukyu.ie.e145165;

/**
 * Created by masaaki on 2017/01/01.
 */
public class report5 {
    public static void main(String args[]){
        String str;
        try{

            str = "3. 14";
            double value = Double.parseDouble(str);

            System.out.println(str.length());

        }catch(NullPointerException e){

            System.out.println(" NullPointerException/ by str = "+e.getMessage());

        }
        throw new NullPointerException("nullの長さは計測できません");

    }



}
