
void setup(){
  size(500,500);
  background(128,240,181);
}

void draw(){
  
  stroke(56,12,95);
  for(int i = 0; i <10; i ++){
    fill(frameCount,0,frameCount);
  ellipse(getWormX(frameCount),getWormY(frameCount),50,50);
 
  }
  makeMagical();
  
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
