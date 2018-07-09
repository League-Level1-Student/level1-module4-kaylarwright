PImage backgroundImage;
int x = 250;
int xspeed = 5;
int y = 250;
int yspeed = 5;
int s = 0;
void setup(){
  size(500,500);
  backgroundImage = loadImage("pong.jpg");
  backgroundImage.resize(width,height);
}
void draw(){
  background(backgroundImage);
  fill(103,231,237);
  stroke(54,128,131);
  ellipse(x,y,50,50);
  fill(8,8,7);
  text("Score " + s, 100,100);
  
  x = x + xspeed;
  y = y + yspeed;
  if(x > width){
     xspeed = -xspeed;
  }
  if(x < 0){
    xspeed = -xspeed;
  }
  if(y < 0){
    yspeed = -yspeed;
  }
  
  fill(93,75,9);
  stroke(8,8,7);
  rect(mouseX,480, 100,20);
  if(intersects(x,y,mouseX,480,100, 20)){
    if(yspeed > 0){
      yspeed = -yspeed;
      s++;
      xspeed ++;
      yspeed --;
    }
    
  }
  
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength, int paddleheight) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength && ballY < paddleY + paddleheight)
          return true;
     else 
          return false;
}
