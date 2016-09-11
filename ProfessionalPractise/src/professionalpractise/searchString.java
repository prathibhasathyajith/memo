/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professionalpractise;

import java.util.ArrayList;
import static professionalpractise.patternS.Q1;
import static professionalpractise.patternS.Q2;
import static professionalpractise.patternS.Q3;
import static professionalpractise.patternS.Q4;
import static professionalpractise.patternS.Q5;

/**
 *
 * @author prathibha
 */
public class searchString {
    
    public static String Q1 = memonew2.Q1;//age
    public static String Q2 = memonew2.Q2;//month
    public static String Q3 = memonew2.Q3;//day
    public static String Q4 = memonew2.Q4;//f number
    public static String Q5 = memonew2.Q5;// f memeber
    PatternGenerate pg=new PatternGenerate();
    ArrayList<String> questions = new ArrayList<String>();
    
    ArrayList<String> Catogerize(String num){
        ArrayList<String> patterndivide = new ArrayList<String>();
        //int number = Integer.parseInt(num);
        String left;
        
        for (int i=0;i<num.length();i++){
            String firstnum = "";
            String lastnum="";
            //String left="";
            String right="";
            
            if(i==0){
                
                patterndivide.add("0"+Character.toString(num.charAt(i)));
                patterndivide.add(Character.toString(num.charAt(i))+Character.toString(num.charAt(i+1)));
            }
            else if(i==num.length()-1){
                patterndivide.add("0"+Character.toString(num.charAt(i)));
                //patterndivide.add(Character.toString(num.charAt(i-1))+Character.toString(num.charAt(i)));
            }
            else{
                patterndivide.add("0"+Character.toString(num.charAt(i)));
                //patterndivide.add(Character.toString(num.charAt(i-1))+Character.toString(num.charAt(i)));
                patterndivide.add(Character.toString(num.charAt(i))+Character.toString(num.charAt(i+1)));
            }
            //patterndivide.add(Character.toString(num.charAt(i)));
            
            System.out.println(patterndivide);
        }
        left="<html>hi<br>hihi"+patterndivide+"</html>";
        return patterndivide;
    }
    
    public void SecarhGiven(ArrayList<String> catpattern){
        String Searchdetails="";
        
            if(catpattern.contains(Q1)){
                Searchdetails+=Q1+"-Your Age\n";
            }
            else{
                //Searchdetails+="Q1-notmatch \n";
            }
            if(catpattern.contains(Q2)){
                Searchdetails+=Q2+"-Your Birth Month\n";
            }
            else{
                //Searchdetails+="Q2-notmatch \n";
            }
            if(catpattern.contains(Q3)){
                Searchdetails+=Q3+"-Your Birth day\n";
            }
            else{
                //Searchdetails+="Q3-notmatch \n";
            }
            if(catpattern.contains(Q4)){
                Searchdetails+=Q4+"-Your Favourite Number\n";
            }
            else{
                //Searchdetails+="Q4-notmatch \n";
            }
            if(catpattern.contains(Q5)){
                Searchdetails+=Q5+"-Your Family Members\n";
            }
            else{
                //Searchdetails+="Q5-notmatch \n";
            }
        System.out.println(Searchdetails);
    }
    
    public String GivenSearch(ArrayList<String> catpattern){
        String Searchdetails="----details of your pattern----\n";
        String Searchdetails2="<html>";
        int index=0;
        
        ArrayList<String> questions = new ArrayList<String>();
        int s1[]=pg.FillNumberCombinationArryAge(Q1);
        int s3[]=pg.FillNumberCombinationArryBirthDay(Q3);
        int s2[]= pg.FillNumberCombinationArryBirthMonth(Q2);
        int s4[]= pg.FillNumberCombinationArryFnumber(Q4);
        int s5[]= pg.FillNumberCombinationArryFmembers(Q5);
        
        
        
        for(int i = 0;i<3;i++){
            if(s1[i]<10){
                questions.add(String.valueOf("0"+s1[i]));
            }else{
                questions.add(String.valueOf(s1[i]));
            }  
        }
        for(int i=0;i<3;i++){
            if(s2[i]<10){
                questions.add(String.valueOf("0"+s2[i]));
            }else{
                questions.add(String.valueOf(s2[i]));
            }
        }
        for(int i=0;i<3;i++){
            if(s3[i]<10){
                questions.add(String.valueOf("0"+s3[i]));
            }else{
                questions.add(String.valueOf(s3[i]));
            }
        }
        for(int i=0;i<3;i++){
            if(s4[i]<10){
                questions.add(String.valueOf("0"+s4[i]));
            }else{
                questions.add(String.valueOf(s4[i]));
            }
        }
        for(int i=0;i<3;i++){
            if(s5[i]<10){
                questions.add(String.valueOf("0"+s5[i]));
            }else{
                questions.add(String.valueOf(s5[i]));
            }
        }
        
        System.out.println(questions);
        
        for(int i= 0 ;i<catpattern.size();i++){
            questions.contains(catpattern.get(i));
            for(String s:questions){
                index = questions.indexOf(catpattern.get(i));
            }
            if(index==0){
                //Searchdetails2+=Q1;
                Searchdetails+=catpattern.get(i)+"  -Your Age \n ";
            }
            else if(index==1){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Age number addition \n ";
            }
            else if(index==2){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Age number Multiply \n ";
            }
            else if(index==3){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Your birthmonth \n ";
            }
            else if(index==4){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Month number addition \n ";
            }
            else if(index==5){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Month number Multiply \n ";
            }
            else if(index==6){
                //Searchdetails2+=Q3;
                Searchdetails+=catpattern.get(i)+"  -Your birthday \n ";
            } 
            else if(index==7){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Day number addition \n ";
            }
            else if(index==8){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Day number Multiply \n ";
            }
            else if(index==9){
                //Searchdetails2+=Q4;
                Searchdetails+=catpattern.get(i)+"  -Your favourite number \n ";
            }
            else if(index==10){
                //Searchdetails2+=Q5;
                Searchdetails+=catpattern.get(i)+"  -Favourite number addition  \n ";
            }
            else if(index==11){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Favourite number Multiply \n ";
            }
            else if(index==12){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Your family members \n ";
            }
            else if(index==13){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Members number addition \n ";
            }
            else if(index==14){
                //Searchdetails2+=Q2;
                Searchdetails+=catpattern.get(i)+"  -Members number Multiply \n ";
            }
            else{
                //Searchdetails2+=catpattern.get(i);
                //Searchdetails+=catpattern.get(i)+"  Not enough details to match \n ";
            }
           // System.out.println(Searchdetails2);
         //   System.out.println(Searchdetails);
        }
       //Searchdetails+="";
       System.out.println(Searchdetails);
        return Searchdetails;
    }
    
    public String GivenSearch2(ArrayList<String> catpattern){
        String Searchdetails="    ----details of your pattern----\n";
        String Searchdetails2="";
        int index=0;
        ArrayList<String> questions = new ArrayList<String>();
        questions.add(Q1);
        questions.add(Q2);
        questions.add(Q3);
        questions.add(Q4);
        questions.add(Q5);
        
        for(int i= 0 ;i<catpattern.size();i++){
            questions.contains(catpattern.get(i));
            for(String s:questions){
                index = questions.indexOf(catpattern.get(i));
            }
            if(index==0){
                Searchdetails2+=Q1;
                Searchdetails+="    "+Q1+"  -Your Age \n";
            }
            else if(index==1){
                Searchdetails2+=Q2;
                Searchdetails+="    "+Q2+"  -Your Bath Month \n";
            }
            else if(index==2){
                Searchdetails2+=Q3;
                Searchdetails+="    "+Q3+"  -Your Bath Day \n";
            }
            else if(index==3){
                Searchdetails2+=Q4;
                Searchdetails+="    "+Q4+"  -Your Favourite Number \n";
            }
            else if(index==4){
                Searchdetails2+=Q5;
                Searchdetails+="    "+Q5+"  -How many of Your Family Members  \n";
            }else{
                //Searchdetails2+=catpattern.get(i);
                //Searchdetails+="    "+catpattern.get(i)+"  -Not enough details to match \n";
            }
           // System.out.println(Searchdetails2);
         //   System.out.println(Searchdetails);
        }
       //Searchdetails+="";
       System.out.println(Searchdetails);
        return Searchdetails;
    }
    
    public static void main(String args[]){
        int x = 123456789;
        searchString ss= new searchString();
        ArrayList<String> aa = new ArrayList<String>();
        aa=ss.Catogerize("1231245");
        //ss.SecarhGiven(aa);
        //System.out.println("----------------");
        ss.GivenSearch(aa);
    }
    
}
