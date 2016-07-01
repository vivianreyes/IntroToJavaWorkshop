import ddf.minim.*;
Minim minim;
AudioSample sound;  
int xposition = 50;
int speed = 3;
int yposition = 250;
void setup(){ 
  size (500,500);
  minim = new Minim (this);  
  sound = minim.loadSample("bouce.mp3", 128);
}

void draw(){
  background(119,170,238);
  ellipse (xposition,yposition, 50, 50);
  fill (221,225,051);
  stroke (204,68,170);
  xposition = xposition + speed;
  yposition = yposition + speed;
  if(xposition >= 500){
    speed = speed *-1;
  }
  if(xposition <= 0){
    speed = speed *-1;
  }
  if(yposition >= 500){
    speed = speed *-1;
    sound.trigger();  
  }
  if(yposition <= 0) {
    speed = speed *-1;
  }
  rect (mouseX, 450, 100, 25);
  
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}

  
  
  
  
  
  
}
