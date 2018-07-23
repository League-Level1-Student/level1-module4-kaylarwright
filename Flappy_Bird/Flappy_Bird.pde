int x = 250;
int y = 250;
int birdVelocity = 0;
int gravity = 1;
int X = 400;
int lowerPipeHeight = (int) random(100,300);
int pipeGap = 200;
int Xspeed = 5;
boolean gameRunning = true;
int s = 0;
void setup(){
  size(500,500);
  
}

void draw(){
 if(gameRunning == true){
   game();
 }else{
   endGame();
 }
  
  
  
  
}
void keyPressed(){
  if(key==' '){
   birdVelocity = -10;
  }
  if (keyCode == ENTER){
    game();
    gameRunning = true;
     x = 250;
     y = 250;
     X = 400;
     s = 0;
  }
}
void teleportPipes(){
  if(X == 0){
 X = width;
 lowerPipeHeight = (int) random(100,400);
 s++;
  }
  
}
boolean intersectsPipes() { 
     if (y < lowerPipeHeight && x > X && x < (X+100)){
          return true; }
     else if (y>lowerPipeHeight+pipeGap   && x > X && x < (X+100)) {
          return true; }
     else { return false; }
}
void game(){
   background(18,17,17);
  fill(234,224,17);
  stroke(18,17,17);
  ellipse(x,y,50,50);
 y+= birdVelocity;
 birdVelocity += gravity;
 fill(41,142,45);
 rect(X,lowerPipeHeight+pipeGap,100,height-lowerPipeHeight);
 X = X-Xspeed;
  teleportPipes();
  fill(41,142,45);
  rect(X,0,100,lowerPipeHeight);
  fill(237,245,238);
  text("Score: " + s, 250, 125);
 if(intersectsPipes()){
   gameRunning = false;
    
   }
 }


void endGame(){
  fill(237,245,238);
  text("Game Over", 250,250);
}
