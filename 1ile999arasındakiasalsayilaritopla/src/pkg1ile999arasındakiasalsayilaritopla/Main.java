
package pkg1ile999arasındakiasalsayilaritopla;

public class Main {

    public static void main(String[] args) {
        int birlerBasamagi,onlarBasamagi,yuzlerBasamagi;
        for(int i =100;i<999;i++){
            yuzlerBasamagi=i/100;
            onlarBasamagi=(i-(yuzlerBasamagi*100))/10;
            birlerBasamagi=(i-  (yuzlerBasamagi*100)-(onlarBasamagi*10));
            if((yuzlerBasamagi*yuzlerBasamagi*yuzlerBasamagi)+(onlarBasamagi*onlarBasamagi*onlarBasamagi)+(birlerBasamagi*birlerBasamagi*birlerBasamagi)==i){
                System.out.print(i+" ");            
        }
                        

        }
 
    }
    
}
