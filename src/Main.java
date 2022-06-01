Ball ball;
Endzone ez;
Paddle paddle;
Button button;
PImage title;
PImage endscreen;
PImage game;
boolean play;
int value = 0;
boolean b;
int i;
boolean g;

Button[] buttons = new Button[5];


void setup () {
  g=true;
  b=true;
  size (900, 700);
  title = loadImage("Title.png");
  endscreen = loadImage("endscreen.png");
  game = loadImage("game.png");
   ball= new Ball(450, 350,40);
}




void draw () {
  background(0);
  println(value);
if(g){
  if (b) {
    if (!play) {
      credits ();
    } else {
      title ();
    }
  }
}

  if (value == 1) {
    game();
  } else if (value == 2) {
    howto();
  } else if (value == 3) {
    exit();
    } else if (value == 4) {
     endscreen(); 
    // } else if (value == 5) {
    //  exit();
  }
}
void keyPressed() {
  play = true;
  b=true;
  value = 0;
}

void credits () {
  textAlign(CENTER);
  fill(255);
  textSize(46);
  text("how to play", width/2, height/2+30);
  text("try to hit the ball past the other paddle", width/2, height/2+70);
  text("and dont let it get past your paddle", width/2, height/2+110);
  text("first to 10 points wins!", width/2, height/2+150);
  text("press any key to continue", width/2, height/2+190);
  text("created by Zander Rapp", width/2, height/2+340);
}



void title () {
  image(title, 0, 0);
  fill(80, 80, 80);
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

void endscreen() {
  b=false;
  image(endscreen, 0, 0);
  text("GAME OVER", width/2, height/2+30);
  text("thanks for playing", width/2, height/2+90);
  text("press any key to continue", width/2, height/2+320);
text("ReCreated By Zander Rapp", width/2+180, height/2-40);

  //buttons[3] = new Button(0, 650, 100, 50, "back", color (122), color(222));
  //buttons[4] = new Button(800, 650, 100, 50, "quit", color (122), color(222));
  //for (int i=0; i<buttons.length; i++) {
  //  buttons[3].display();
  //buttons[3].hover(mouseX, mouseY);
  //buttons[4].display();
  //buttons[4].hover(mouseX, mouseY);
  //}
}
void mousePressed() {
  for (int i=0; i<buttons.length; i++) {
    if (buttons[0].on) {
      value=1;
    } else if (buttons[1].on) {
      value=2;
    } else if (buttons[2].on) {
      value=3;
    }
    // if (!b){
    //if (play){

    //} else if (buttons[3].on) {
    // value=4;
    //} else if (buttons[4].on) {
    // value=5;

    // }
    //}else{
    //break;
  }
}
//}\

void game(){
 play=false;
 g=false;
 image(game,0,0);
  background (80,80,80); 
 
  ball.xspeed = random (5,-5);
  ball.yspeed = 0;
  fill(225);
 ball.move();
  ball.display();
  if (ball.right()<width){
   ball.xspeed = -ball.xspeed;
 
}
  if (ball.left()<width){
   ball.xspeed = -ball.xspeed;

}
  if (ball.bottom()<height){
   ball.yspeed = -ball.yspeed;
  }
  if (ball.top()<0){
   ball.yspeed = -ball.yspeed;
  }
  
}

void score() {




}
