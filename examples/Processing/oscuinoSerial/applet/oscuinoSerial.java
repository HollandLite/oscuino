import processing.core.*; 
import processing.xml.*; 

import com.illposed.osc.utility.*; 
import com.illposed.osc.*; 

import com.illposed.osc.utility.*; 
import com.illposed.osc.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class oscuinoSerial extends PApplet {




public void setup(){
  OSCMessage msg = new OSCMessage("/sayhello", args);

}

public void loop(){

}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "oscuinoSerial" });
  }
}
