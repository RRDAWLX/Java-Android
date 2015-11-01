
public class Palindrome {
    long palindromTest;
    long palindrome;
    long remainder;
    
    long arr[]=new long[8];
    int length;
    long limit;
    boolean found=false;

    public void calculate(){

        for(int a=100;a<1000;a++){
            for(int b=100;b<1000;b++){
                length=0;
                palindromTest=a*b;
                remainder=palindromTest;

                for(int c=10;remainder!=0;c=10){
                    arr[length]=remainder%c;
                    remainder=remainder/c;
                    length++;
                }

                
                if(length%2==0){
                    limit=(length/2)-(1);
                }
                else{
                    limit=length/2;
                }
                
                

                for(int counter=0;counter<=limit;counter++){
                    if(arr[counter]==arr[length-1-counter]){
                        found=true;           
                    }
                    else{
                        found=false;
                        counter=50;
                    }

                }
                
                if(found&&(palindrome<palindromTest)){
                    palindrome=palindromTest;
                    found=false;
                    
                }

            }

        }
        
        System.out.println(palindrome);
        
        
    }

    public static void main(String args[]){
        Palindrome pal=new Palindrome();
        pal.calculate();
    }

}
