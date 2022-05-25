Ball ball;
Endzone ez;
Paddle paddle;
Button button;
PImage title;
PImage endscreen;
boolean play;
int value = 0;
boolean b;

Button[] buttons = new Button[5];


void setup () {
b=true;
size (900,700);
title = loadImage("Title.png");
endscreen = loadImage("endscreen.png");

}




void draw () {
background(0);
println(value);

  if(b){
if(!play){
credits ();
}else{
  title ();
}
  } 


if(value == 1){
  
}else if(value == 2) {
  howto();
}else if(value == 3) {
  endscreen();
}else if(value == 4){
  value=0;
  b=true;
}else if(value == 5){
 exit(); 
}




}

void credits () {
 if (keyPressed) {
      play = true;
    }
  textAlign(CENTER);
    fill(255);
    textSize(46);
    text("how to play", width/2, height/2+30);
    text("try to hit the ball past the other paddle", width/2, height/2+70);
    text("and dont let it get past your paddle", width/2, height/2+110);
    text("first to 10 points wins!", width/2, height/2+150);
    text("created by Zander Rapp", width/2, height/2+340);
   
}



void title () {
image(title, 0,0);
fill(80,80,80);
buttons[0] = new Button(800, 350, 100, 50, "start", color (122), color(222));
buttons[1] = new Button(800, 410, 100, 50, "how to", color (122), color(222));
buttons[2] = new Button(800, 470, 100, 50, "exit", color (122), color(222));
 for (int i=0; i<buttons.length; i++) {
    buttons[0].display();
    buttons[0].hover(mouseX, mouseY);
    buttons[1].display();
    buttons[1].hover(mouseX, mouseY);
    buttons[2].display();
    buttons[2].hover(mouseX, mouseY);
 }
}

void howto() {
play=false;
    if (keyPressed) {
     value=0;
      play=true;
    }
}

void endscreen(){
 b=false;
   image(endscreen,0,0);
  buttons[3] = new Button(0, 650, 100, 50, "back", color (122), color(222));
  buttons[4] = new Button(800, 650, 100, 50, "quit", color (122), color(222));
 for (int i=0; i<buttons.length; i++) {
   buttons[3].display();
    buttons[3].hover(mouseX, mouseY);
    buttons[4].display();
    buttons[4].hover(mouseX, mouseY);
   
   
 }
}
void mousePressed() {
 for (int i=0; i<buttons.length; i++) {
    if (buttons[0].on) {
    value=1;
      }else if (buttons[1].on){
        value=2;
      }else if (buttons[2].on){
        value=3;
      }else if(buttons[3].on){
       value=4; 
      }else if(buttons[4].on){
       value=5; 
      }
    }
}
