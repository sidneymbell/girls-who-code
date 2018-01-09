/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceneedle;

/**
 *
 * @author ibrah
 */
public class SpaceNeedle {
        //class constant
       private static final int SIZE=2; 
       public static void main(String[] args){
           CreateNeedle();
           CreateUpperShip();
           CreateCenterPiece();
           CreateLowerShip();
           CreateNeedle();
           CreateMiddleStructure();
           CreateUpperShip();
           CreateCenterPiece();
        
    }
         
       
       public static void CreateNeedle(){
            //prints out the needle part
            for (int i=1; i<=SIZE; i++){
                
               for (int j=1; j<=SIZE*3; j++){
                 System.out.print(" ");
               }
               System.out.println("||");
            }    
       }
       
       public static void CreateUpperShip(){
          //prints out upper ship of space needle
          int m=0; 
          for (int i=1; i<=SIZE; i++){
                   
           for(int h=1; h<=SIZE*3-(i*3); h++){
                  System.out.print(" "); 
               }
              System.out.print("__/");
               
          for (int j=0; j< m*3; j++){
              System.out.print(":"); 
          }
          
          System.out.print("||");
          
          for (int k=0; k< m*3; k++){
              System.out.print(":"); 
          }
          
          System.out.println("\\__");
          
          m++;
          
          }
          
         }
          
       public static void CreateCenterPiece(){
           System.out.print("|");
           for(int i=1; i<=SIZE*6; i++){
               System.out.print("\""); 
       }
          System.out.println("|");
         }
       
       public static void CreateLowerShip(){
           //int s=0;
          int x;
          
          for(int l=1; l<=SIZE; l++){
                  
          for(int j=0; j<l-1; j++) {
              System.out.print("  "); 
          }
          System.out.print("\\_/"); 
          
          //draw Vs
          x = ((SIZE-l)*2) + SIZE; 
          for(int k=1; k<=x; k++){
              System.out.print("\\/");
          }
          System.out.println("\\_/");
         
          }
       }
          public static void CreateMiddleStructure(){
            for(int j=1; j<=SIZE*4; j++){
              for(int i=1; i<=SIZE*3-3; i++){ 
                  System.out.print(" ");
              }
              
              System.out.println("|%%||%%|"); 
          }
         }    
}
    

