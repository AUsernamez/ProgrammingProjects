class Ball {
  color c1;
  float x, y, xspeed, yspeed, diameter;


  // constructor
  Ball(float tempX, float tempY, float tempDiameter) {
    x=tempX;
    y=tempY;
    xspeed=0;
    yspeed=0;
    diameter=tempDiameter;
  }

  void display() {
    ellipse(x, y, diameter, diameter);
  }



  void move() {
    x=x+xspeed;
    y=y+yspeed;
    
  }
  float right() {
    return x+diameter/2;
  }
  float left() {
    return x-diameter/2;
  }
  float top() {
    return y-diameter/2;
  }
  float bottom() {
    return y+diameter/2;
  }
}
