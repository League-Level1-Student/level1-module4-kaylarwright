int x = 250;
int y = 250;
Car c= new Car(250,0);
Car a = new Car(250,250);
Car r = new Car(250,450);

void setup(){
  size(500,500);
}

void draw(){
  background(162,156,156);
  fill(49,175,34);
  stroke(49,175,34);
  outside();
  ellipse(x,y,50,50);
 
  c.update();
  a.update();
  r.update();
}

void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                  y-=10;
            }
            else if(keyCode == DOWN)
            {
                  y+=10; 
            }
            else if(keyCode == RIGHT)
            {
                  x+=10;
            }
            else if(keyCode == LEFT)
            {
                  x-=10;
            }
      }
}

void outside(){
  if(x<0){
    x=0;
  }
  if(x>500){
    x=500;
  }
 if(y<0){
   y=0;
 }
 if(y>500){
   y=500;
 }
  
}


class Car{
  int X = 150;
  int Y = 150;
  int S = 100;
  int w = 50;
  int Xspeed = 10;
  
  Car(int X, int Y){
    this.X = X;
    this.Y = Y;
    
    Xspeed = (int)random(1,10);
    
    int random = (int)random(2);
    if(random ==0){
      Xspeed*=-1;
    }
  }
  
  void draw(){
    fill(118,230,234);
    rect(X,Y,S,w);
   
  }
  
  void update(){
    X+= Xspeed;
    draw();
    if(X<0){
      X=250;
    }
    if(X>width){
      X=250;
    }
  }
  
}
