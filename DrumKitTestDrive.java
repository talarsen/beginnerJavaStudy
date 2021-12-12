class DrumKitTestDrive {
  public static void main(String [] args){
     //create DrumKit object
     DrumKit d = new DrumKit();
      d.playSnare();
     //assign d snare to false
      d.snare = false;
      //assigning playSnare on object 'd'
      d.playTopHat();

      //condition if d.snare is true, play playSnare
      if (d.snare) {
          d.playSnare();
      }
  }
}