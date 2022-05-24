class Button{
  // member variables
  float x,y,w,h;
  boolean on;
  String val;
  color c1, c2;
  
  
  // constructor
  Button(float tempX, float tempY, float tempW, float tempH,String tempVal, color tempC1, color tempC2){
    x=tempX;
    y=tempY;
    w=tempW;
    h=tempH;
    val = tempVal;
    c1 = tempC1;
    c2 = tempC2;
    on = false;
  }
  
  // method to display the button
   void display(){
       if(on) {
         fill(c1);
       }else{
         fill(c2);
       }
     rect(x,y,w,h,5);
     fill(0);
    if(val.equals("c")){
      textAlign(RIGHT);
      textSize(30);
      text(val,x+20,y+25);
   }
   }
  
  // method for hovering over the button
  void hover(int mx, int my) {
    on = (mx>x && mx<x+w && my>y && my<y+h);
  }


}
