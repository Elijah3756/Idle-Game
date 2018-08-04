/**
 *  Elijah Bellamy 7 6-1-17
 * pre
 * dle game are clicker games
 * Have one or multiple games
 * multiple buttons 
 * post
 * Idle game code prints cide in order its given 
 * it can look for files in the computer
 * The code needs applets to run right
 * ilde game reprints images if buffergraphics isnt in place
 * summary
 * Idle game starts off with 5 buttons made by putting the x,y,hieght,and lenght into the mmouse pressed part of the code.
 * After you have your buttons you download images and tell the computer to find them by useing getcodebase 
 * once you habe your images you can add sounds by using getdocumentbase  
 *  
 * 
 */
import java.awt.*;
import java.lang.*;
import java.applet.*;
import java.awt.event.*;  
import java.awt.image.*;
import java.awt.*;
import java.lang.*;
import java.applet.*;
import javax.imageio.*;
import java.net.*;     
import java.io.*;      
import java.awt.image.*;
import java.applet.*;   
import java.awt.Graphics;
import java.util.*;
import java.text.DateFormat;
import java.applet.Applet;
;   
public class BellamyE7IdleGame extends Applet implements MouseListener,Runnable,MouseMotionListener  {

/**
 *  Elijah Bellamy 7 6-1-17
 * pre
 * dle game are clicker games
 * Have one or multiple games
 * multiple buttons 
 * post
 * Idle game code prints cide in order its given 
 * it can look for files in the computer
 * The code needs applets to run right
 * ilde game reprints images if buffergraphics isnt in place
 * summary
 * Idle game starts off with 5 buttons made by putting the x,y,hieght,and lenght into the mmouse pressed part of the code.
 * After you have your buttons you download images and tell the computer to find them by useing getcodebase 
 * once you habe your images you can add sounds by using getdocumentbase  
 *  
 * 
 */
       Graphics bufferGraphics; 
    Image offscreen;
    Dimension dim; 
     int curX, curY; 

    int mouseClickX; 
    int mouseClickY;
    int MouseMoveX, MouseMoveY;
    boolean mouseEntered;
    int StudioButtonX,StudioButtonY,StudioButtonWidth,StudioButtonHeight; //1
boolean StudioButtonClicked; 
long StudioButtonCount=0;
BufferedImage Studio = null;
 int HunchoButtonX, HunchoButtonY, HunchoButtonWidth, HunchoButtonHeight; //2Huncho
boolean  HunchoButtonClicked;
long HunchoButton=10; 
BufferedImage Huncho = null;
int ReggieButtonX,ReggieButtonY,ReggieButtonWidth,ReggieButtonHeight; //3Reggie
boolean ReggieButtonClicked; 
BufferedImage Reggie = null;
long ReggieButton=100;
int RicoButtonX,RicoButtonY,RicoButtonWidth,RicoButtonHeight; //4Rico
boolean RicoButtonClicked; 
long RicoButton=1000;
BufferedImage  Rico = null;
int DAFOOLButtonX,DAFOOLButtonY,DAFOOLButtonWidth,DAFOOLButtonHeight;
boolean DAFOOLButtonClicked; 
BufferedImage DAFOOL = null;
long DAFOOLButton=10000; //5 DAFOOL
int ShabazzButtonX,ShabazzButtonY,ShabazzButtonWidth,ShabazzButtonHeight; //6 Shabazz
boolean ShabazzButtonClicked;
long ShabazzButton=100000;
BufferedImage Shabazz = null; 
 int BigfButtonX,BigfButtonY,BigfButtonWidth,BigfButtonHeight; //Bigf
boolean BigfButtonClicked; 
BufferedImage Bigf = null;
long BigfButton=1000000;
int ShyButtonX,ShyButtonY,ShyButtonWidth,ShyButtonHeight; //8 Shy
boolean ShyButtonClicked; 
BufferedImage Shy = null;
long ShyButton=10000000;
  int CloutButtonX,CloutButtonY,CloutButtonWidth,CloutButtonHeight; //1
boolean CloutButtonClicked;
 //long ShyButton=0
BufferedImage Beatmaker1 = null;
long CloutButtonCount=0;
  int Clout1ButtonX,Clout1ButtonY,Clout1ButtonWidth,Clout1ButtonHeight; //1
boolean Clout1ButtonClicked;
long Clout1ButtonCount=0;
BufferedImage Beatmaker2 = null; 
  int Clout2ButtonX,Clout2ButtonY,Clout2ButtonWidth,Clout2ButtonHeight; //1
boolean Clout2ButtonClicked;
long Clout2ButtonCount=0;
BufferedImage Beatmaker3= null;
 int BackgroundX,BackgroundY,BackgroundWidth,BackgroundHeight;
BufferedImage Background= null;
boolean DMVBackground= true;


private Thread clockThread = null;
//int Cloutincrease;
   // int autoTeacher=0;
   // int autoTeacherCost=10;
//int spinButtonX,spinButtonY,spinButtonWidth,spinButtonHeight; //
//boolean spinButtonClicked; 
//BufferedImage spin = null;
AudioClip Hunchosound;
 AudioClip BigFlockSound;
 AudioClip DaFool;
 AudioClip ReggieSound;
 AudioClip RicoSound;
AudioClip ShySound;
AudioClip ShabazzSound; 
    public void init()  
    {//this does not need to be used, but it is nice to sort for initial value setting
         super.init();
              resize(1200,1200);
              dim = getSize();  
       addMouseListener(this);
        addMouseMotionListener(this); 
          //setBackground("Background.jpg"); 
           offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics(); 
            StudioButtonX = 0; 
        StudioButtonY = 0; 
        StudioButtonWidth = 550; 
        StudioButtonHeight = 500;
        try{
            URL u = new URL(getCodeBase(),"Studio.jpg");
                Studio = ImageIO.read(u);
                /////////////////////////
                URL o = new URL(getCodeBase(),"Huncho.jpg");
                Huncho = ImageIO.read(o); 
                /////////////////////////
                URL i= new URL(getCodeBase(),"Reggie.jpeg");
                Reggie = ImageIO.read(i);
                /////////////////////////
                URL c  = new URL(getCodeBase(),"Rico.png");
                Rico = ImageIO.read(c );
                /////////////////////////
                URL s = new URL(getCodeBase(),"DAFOOL.jpg");
                DAFOOL = ImageIO.read(s);
                /////////////////////////
                URL  z= new URL(getCodeBase(),"Shabazz.jpeg");
                Shabazz = ImageIO.read(z);
                /////////////////////////
                URL g = new URL(getCodeBase(),"Bigf.jpeg");
                Bigf = ImageIO.read(g);
                /////////////////////////
                URL y= new URL(getCodeBase(),"Shy.jpg");
                Shy = ImageIO.read(y);
                ////////////////////////
                //URL n= new URL(getCodeBase(),"spin.jpeg");
                //spin = ImageIO.read(n);
                /////////////////////////////////]
                 URL  f= new URL(getCodeBase(),"Beatmaker1.jpeg");
                Beatmaker1 = ImageIO.read(f);
                /////////////////////////
                URL e = new URL(getCodeBase(),"Beatmaker2.jpg");
                Beatmaker2 = ImageIO.read(e);
                /////////////////////////
                URL q= new URL(getCodeBase(),"Beatmaker3.png");
                Beatmaker3 = ImageIO.read(q);
                
                URL l= new URL(getCodeBase(),"Background.jpg");
                Background = ImageIO.read(l);
            }   
            catch (IOException e){
            }
        /////////////////////////
               Hunchosound = getAudioClip(getDocumentBase(), "HunchoSound.au");
        HunchoButtonX = 600; 
        HunchoButtonY = 0; 
        HunchoButtonWidth = 200; 
        HunchoButtonHeight = 175;
        
       //  super.init();
      //  resize(1000,1000);
     
      // Hunchosound = getAudioClip(getDocumentBase(), "Hunchosound.au");
       // Hunchosound.play();
         /////////////////////////
          ReggieSound = getAudioClip(getDocumentBase(), "ReggieSound.au");
        ReggieButtonX = 800; 
        ReggieButtonY = 100; 
        ReggieButtonWidth = 200; 
        ReggieButtonHeight = 175;
        //  super.init();
       // resize(0,0);
        //put in init
        //ReggieSound = getAudioClip(getDocumentBase(), "ReggieSound.au");
       // ReggieSound.play();
         /////////////////////////
        RicoSound = getAudioClip(getDocumentBase(), "RicoSound.au");
         RicoButtonX = 600;
         
        RicoButtonY = 250; 
        RicoButtonWidth = 200; 
        RicoButtonHeight = 175;
         // super.init();
       //resize(0,0);
        //put in init
       // RicoSound = getAudioClip(getDocumentBase(), "RicoSound.au");
        //RicoSound.play();
         /////////////////////////
         DAFOOLButtonX = 800; 
        DAFOOLButtonY = 350; 
        DAFOOLButtonWidth = 200; 
        DAFOOLButtonHeight = 175;
       
        DaFool = getAudioClip(getDocumentBase(), "DaFool.au");
     
         /////////////////////////
         ShabazzButtonX = 600; 
        ShabazzButtonY = 500; 
        ShabazzButtonWidth = 200; 
        ShabazzButtonHeight = 175;
        
      
       ShabazzSound = getAudioClip(getDocumentBase(), "ShabazzSound.au");
      
       
         /////////////////////////
         BigfButtonX = 800; 
        BigfButtonY = 625; 
        BigfButtonWidth = 200; 
        BigfButtonHeight = 175;
        
       
        BigFlockSound = getAudioClip(getDocumentBase(), "BigFlockSound.au");
       
        
         /////////////////////////
         ShyButtonX = 600; 
        ShyButtonY = 750; 
        ShyButtonWidth = 200; 
        ShyButtonHeight = 175;
        
        
     ShySound = getAudioClip(getDocumentBase(), "ShySound.au");
        
         /////////////////////////
         CloutButtonX = 0; 
        CloutButtonY = 500; 
       CloutButtonWidth = 150; 
        CloutButtonHeight = 100;
        
        Clout1ButtonX = 200; 
        Clout1ButtonY = 500; 
       Clout1ButtonWidth = 150; 
        Clout1ButtonHeight = 100;
        
        Clout2ButtonX = 400; 
        Clout2ButtonY = 500; 
       Clout2ButtonWidth = 150; 
        Clout2ButtonHeight = 100;
        
        BackgroundX = 0; 
       BackgroundY = 0; 
        BackgroundWidth = 1000; 
         BackgroundHeight = 1000;
        
        addMouseMotionListener(this);
        
    }
    
public void start() {
        if (clockThread == null) {
            clockThread = new Thread(this, "Clock");
            clockThread.start();
        }
    }
    public void run()
  {
      Thread myThread = Thread.currentThread();
       while (clockThread == myThread) {
               //CloutButtonCount= StudioButtonCount+ (CloutButtonCount*2);
           repaint();
            CloutButtonCount= CloutButtonCount+5;
            if (CloutButtonCount>1000)
            {
            
           StudioButtonCount= StudioButtonCount*=1.05;
        }
            if( CloutButtonCount>=100)
            {
                CloutButtonCount= CloutButtonCount+20;
            }
            if( CloutButtonCount>=1000)
            {
                CloutButtonCount= CloutButtonCount+80;
            }
            if( CloutButtonCount>=10000)
            {
                CloutButtonCount= CloutButtonCount+320;
            }
            if( CloutButtonCount>100000)
            {
                CloutButtonCount= CloutButtonCount+1280;
            }
            if( CloutButtonCount>1000000)
            {
                CloutButtonCount= CloutButtonCount+5120;
            }
             if( CloutButtonCount>10000000)
            {
                CloutButtonCount= CloutButtonCount+20480;
            }
               if( CloutButtonCount>100000000)
            {
                CloutButtonCount= CloutButtonCount+81920;
            }
            try {
                Thread.sleep(1000);
                 } catch (InterruptedException e) {
                 //the VM doesnÃ¢â‚¬â„¢t want us to sleep anymore,
                //so get back to work
            }
        }
    }
    public void paint(Graphics g)  
           { 
        bufferGraphics.clearRect(0,0,dim.width,dim.width);
              if(DMVBackground)
              {
                   bufferGraphics.drawImage(Background,0,0,dim.width,dim.width,null);
                }
              else
               {
               
               //bufferGraphics.setColor(Color.green); 
        //bufferGraphics.fillRect(StudioButtonX,StudioButtonY,StudioButtonWidth,StudioButtonHeight); 
            
        Font scaryFont = new Font("Impact",Font.BOLD, 50);//creates font
        bufferGraphics.setFont(scaryFont); //sets font
        bufferGraphics.setColor(Color.black);
        bufferGraphics.drawString("Bread $"+StudioButtonCount,50,700);
        
         
            
        Font scryFont = new Font("Impact",Font.BOLD, 50);//creates font
        bufferGraphics.setFont(scaryFont); //sets font
        bufferGraphics.setColor(Color.black);
        bufferGraphics.drawString("Clout" +CloutButtonCount ,50,850);
        //bufferGraphics.drawString(" Downloads  "+StudioButtonCount+ "",400,20); 
            
if(HunchoButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(HunchoButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Hey whats good with you moe ",800,10); //print the help text for this button
                 bufferGraphics.drawString("It's Huncho Here!",800,25);
                 bufferGraphics.drawString("and i see you got some money!",800,40);
                  bufferGraphics.drawString(" Want to do a feature?",800,55);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                bufferGraphics.drawString("I'll increase your Clout by 100 ",800,70);
                 bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
         
        if(ReggieButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(ReggieButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Ayy moe its Mr.1016",550,190); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the town!",550,205);
                 bufferGraphics.drawString("If you want increase Clout by 1000",550,220);
                  bufferGraphics.drawString(" then lets do a song together",550,235);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll only charge you 1000 Bread",550,250);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
           
        if(RicoButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(RicoButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("It's Rico Here",800,290); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the DMV!",800,305);
                 bufferGraphics.drawString("If you want increase Clout by 10,000",800,320);
                  bufferGraphics.drawString("then lets do a song together",800,335);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll charge you 10,000 Bread",800,350);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
           if(DAFOOLButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(DAFOOLButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Ayy moe its Dafool aka Q DaFool",550,438); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the DMV!",550,453);
                 bufferGraphics.drawString("If you want increase Clout by 100,000",550,468);
                  bufferGraphics.drawString(" then lets do a song together",550,483);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll only charge you 100,000 Bread",550,498);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
         if(ShabazzButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(ShabazzButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Ayy moe its Shabazz Here",800,535); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the DMV!",800,550);
                 bufferGraphics.drawString("If you want increase Clout by 1,000,000",800,565);
                  bufferGraphics.drawString(" then lets do a song together",800,580);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll only charge you 1,000,000 Bread",800,595);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
        if(BigfButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(BigfButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("BigFlock here and",500,688); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the DMV!",500,703);
                 bufferGraphics.drawString("If you want increase Clout by 10,000,000",500,718);
                  bufferGraphics.drawString(" then lets do a song together",500,733);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll only charge you 10,000,000 Bread",500,748);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
        if(ShyButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(ShyButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Ayy moe its Shy Glizzy",800,813); //print the help text for this button
                 bufferGraphics.drawString("i see you getting some clout in the town!",800,828);
                 bufferGraphics.drawString("If you want increase Clout by 100,000,000",800,843);
                  bufferGraphics.drawString(" then lets do a song together",800,858);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 bufferGraphics.drawString("I'll only charge you  100,000,000 Bread",800,873);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
        if(CloutButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(CloutButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Hey man, a small venue is avalibe",0,615); //print the help text for this button
                 bufferGraphics.drawString("It will decrease Clout by 100,000",0,630);
                 bufferGraphics.drawString("I'll pay you 50,000 Bread",0,645);
                 // bufferGraphics.drawString(" then lets do a song together",0,660);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 //bufferGraphics.drawString("I'll only charge you 1000 Bread",0,675);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
         if(Clout1ButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(Clout1ButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Hey man, a Medium venue is avalibe",0,615); //print the help text for this button
                 bufferGraphics.drawString("It will decrease Clout by 1,000,000",0,630);
                 bufferGraphics.drawString("I'll pay you 500,000 Bread",0,645);
                  //bufferGraphics.drawString(" then lets do a song together",200,660);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 //bufferGraphics.drawString("I'll only charge you 1000 Bread",200,675);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        
         if(Clout2ButtonClicked){//if you are over a button
            //bufferGraphics.setColor(Color.black);
            //set a background so that you can easily read the pop up text because this follows the mouse
            //if static location help box do below
            //bufferGraphics.fillRect(800,10,120,20); //this is the help box in a static location, OPTIONAL
            //if static location help box do above
            bufferGraphics.setColor(Color.black); //change the color so that you can see the text
            if(Clout2ButtonClicked){//if over this specific button
                  Font scront = new Font("Impact",Font.BOLD, 15);
                   bufferGraphics.setFont(scront);
                bufferGraphics.drawString("Hey man, a Large venue is avalibe",0,615); //print the help text for this button
                 bufferGraphics.drawString("It will decrease Clout by 10,000,000",0,630);
                 bufferGraphics.drawString("I'll pay you 1,000,000 Bread",0,645);
                  //bufferGraphics.drawString(" then lets do a song together",400,660);
                //bufferGraphics.drawString("I'll increase your Clout by 100 but it will cost you 100 bread!!",MouseMoveX+10,MouseMoveY+20); //print another line text for this button, add y value by 10 by default
                //if static location help box do below
                 //bufferGraphics.drawString("I'll only charge you 1000 Bread",400,675);
               
                // bufferGraphics.drawString("but it will cost you 100 bread!!",800,85);
                //this is the help box TEXT in a static location, OPTIONAL
                //if static location help box do above
               //Font scront = new Font("Impact",Font.BOLD, 5);
            }
        }
        /////////////////////////////////////////////////////////////////////////
        
        
         bufferGraphics.setColor(Color.black); 
        // Hunchosound.play();
        //bufferGraphics.fillRect(HunchoButtonX,HunchoButtonY,HunchoButtonWidth,HunchoButtonHeight); 

         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.blue); 
        //bufferGraphics.fillRect(ReggieButtonX,ReggieButtonY,ReggieButtonWidth,ReggieButtonHeight);
         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.red); 
        //bufferGraphics.fillRect(RicoButtonX,RicoButtonY,RicoButtonWidth,RicoButtonHeight);
         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.black); 
       // bufferGraphics.fillRect( DAFOOLButtonX, DAFOOLButtonY, DAFOOLButtonWidth, DAFOOLButtonHeight);
         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.black); 
        //bufferGraphics.fillRect(ShabazzButtonX,ShabazzButtonY,ShabazzButtonWidth,ShabazzButtonHeight);
         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.black); 
        //bufferGraphics.fillRect(BigfButtonX,BigfButtonY,BigfButtonWidth,BigfButtonHeight);
         /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.black); 
       //bufferGraphics.fillRect(ShyButtonX,ShyButtonY,ShyButtonWidth,ShyButtonHeight);
        /////////////////////////////////////////////////////////////////////////
         bufferGraphics.setColor(Color.pink); 
       // bufferGraphics.drawRect(spinButtonX,spinButtonY,spinButtonWidth,spinButtonHeight);
        //.fillRect(CloutButtonX,CloutButtonY,CloutButtonWidth,CloutButtonHeight);
         //bufferGraphics.fillRect(Clout1ButtonX,Clout1ButtonY,Clout1ButtonWidth,Clout1ButtonHeight);
         //bufferGraphics.fillRect(Clout2ButtonX,Clout2ButtonY,Clout2ButtonWidth,Clout2ButtonHeight);
         //bufferGraphics.drawImage(Background,  BackgroundX,  BackgroundY,  BackgroundWidth,  BackgroundHeight,null);
        bufferGraphics.drawImage(Studio,StudioButtonX,StudioButtonY,StudioButtonWidth,StudioButtonHeight,null);//draws it
 /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(Huncho,HunchoButtonX,HunchoButtonY,HunchoButtonWidth,HunchoButtonHeight,null);
        /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(Reggie,ReggieButtonX,ReggieButtonY,ReggieButtonWidth,ReggieButtonHeight,null);
        /////////////////////////////////////////////////////////////////////////
       bufferGraphics.drawImage(Rico,RicoButtonX,RicoButtonY,RicoButtonWidth,RicoButtonHeight,null);
        /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(DAFOOL,DAFOOLButtonX,DAFOOLButtonY,DAFOOLButtonWidth,DAFOOLButtonHeight,null);
         /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(Shabazz,ShabazzButtonX,ShabazzButtonY,ShabazzButtonWidth,ShabazzButtonHeight,null);
         /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(Bigf,BigfButtonX,BigfButtonY,BigfButtonWidth,BigfButtonHeight,null);
         /////////////////////////////////////////////////////////////////////////
        bufferGraphics.drawImage(Shy,ShyButtonX,ShyButtonY,ShyButtonWidth,ShyButtonHeight,null);
         /////////////////////////////////////////////////////////////////////////
       // bufferGraphics.drawImage(spin,spinButtonX,spinButtonY,spinButtonWidth,spinButtonHeight,null);
        bufferGraphics.drawImage( Beatmaker1,CloutButtonX,CloutButtonY,CloutButtonWidth,CloutButtonHeight,null);
         bufferGraphics.drawImage(Beatmaker2,Clout1ButtonX,Clout1ButtonY,Clout1ButtonWidth,Clout1ButtonHeight,null);
          bufferGraphics.drawImage(Beatmaker3,Clout2ButtonX,Clout2ButtonY,Clout2ButtonWidth,Clout2ButtonHeight,null);

       
        
         g.drawImage(offscreen,0,0,this);
        
    }
}
public void update(Graphics g){paint(g);}
      public void mouseClicked (MouseEvent me) {} //dont use
    public void mousePressed (MouseEvent me) {
       
        mouseClickX = me.getX();//mouse click x
        mouseClickY = me.getY(); //mouse click y
       if(DMVBackground)
         DMVBackground=false;
         else{
       
          
            if (mouseClickX>StudioButtonX&&mouseClickX<StudioButtonX+StudioButtonWidth&&
                        mouseClickY>StudioButtonY&&mouseClickY<StudioButtonY+StudioButtonHeight)
            {
                StudioButtonCount++;
                StudioButtonClicked = true;////clicked inside rect
               
            }
            else  
                StudioButtonClicked = false; //clicked outside rect
                
            
          
              {
                if(StudioButtonCount>=100){
                     if (mouseClickX>HunchoButtonX&&mouseClickX<HunchoButtonX+HunchoButtonWidth&&
                        mouseClickY>HunchoButtonY&&mouseClickY<HunchoButtonY+HunchoButtonHeight)
            {
    
                 HunchoButton++;
                 HunchoButtonClicked = true;
                 
                 CloutButtonCount = CloutButtonCount+ 100;
                   StudioButtonCount =   StudioButtonCount+ HunchoButton;
            //put in init
            
            Hunchosound.play();
                StudioButtonCount =   StudioButtonCount- 80;
               
                
                
             //CloutButtonCount+=500;
                 }
                 //clicked inside rect
                 
                
            
            }
            else  
        
                HunchoButtonClicked = false; //clicked outside rect
               
          if( StudioButtonCount>=1000 ){
                 if (mouseClickX>ReggieButtonX&&mouseClickX<ReggieButtonX+ReggieButtonWidth&&
                        mouseClickY>ReggieButtonY&&mouseClickY<ReggieButtonY+ReggieButtonHeight)
            {
                 ReggieButton++;
                 ReggieButtonClicked = true;
                   CloutButtonCount = CloutButtonCount+ 1000;
                   StudioButtonCount =   StudioButtonCount+ ReggieButton;
               
    
            ReggieSound.play();
                StudioButtonCount =   StudioButtonCount- 800;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                ReggieButtonClicked = false; //clicked outside rect
                
          if( StudioButtonCount>=10000 ){
                 if (mouseClickX>RicoButtonX&&mouseClickX<RicoButtonX+RicoButtonWidth&&
                        mouseClickY>RicoButtonY&&mouseClickY<RicoButtonY+RicoButtonHeight)
            {
                 RicoButton++;
                 RicoButtonClicked = true;
                   CloutButtonCount = CloutButtonCount+ 10000;
                   StudioButtonCount =   StudioButtonCount+ RicoButton;
               
           
            RicoSound.play();
                StudioButtonCount =   StudioButtonCount- 8000;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                RicoButtonClicked = false; //clicked outside rect}
               
                if( StudioButtonCount>=100000 ){
                 if (mouseClickX>DAFOOLButtonX&&mouseClickX<DAFOOLButtonX+DAFOOLButtonWidth&&
                        mouseClickY>DAFOOLButtonY&&mouseClickY<DAFOOLButtonY+DAFOOLButtonHeight)
            {
                 DAFOOLButton++;
                 DAFOOLButtonClicked = true;
                   CloutButtonCount = CloutButtonCount+ 100000;
                   StudioButtonCount =   StudioButtonCount+ DAFOOLButton;
              
         
            DaFool.play();
               StudioButtonCount =   StudioButtonCount- 100000;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                DAFOOLButtonClicked = false; //clicked outside rect
                
                
               
               
                if( StudioButtonCount>=1000000 ){
                 if (mouseClickX>ShabazzButtonX&&mouseClickX<ShabazzButtonX+ShabazzButtonWidth&&
                        mouseClickY>ShabazzButtonY&&mouseClickY<ShabazzButtonY+ShabazzButtonHeight)
            {
                 ShabazzButton=ShabazzButton+1;
                 ShabazzButtonClicked = true;
                  CloutButtonCount = CloutButtonCount+ 1000000;
                   StudioButtonCount =   StudioButtonCount+ ShabazzButton;
             
           //ShabazzSound = getAudioClip(getDocumentBase(), "ShabazzSound.au");
           // put in init    
          ShabazzSound.play();
               StudioButtonCount =   StudioButtonCount- 1000000;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                ShabazzButtonClicked = false; //clicked outside rect
                
                
                    if( StudioButtonCount>=10000000 ){
                 if (mouseClickX>BigfButtonX&&mouseClickX<BigfButtonX+BigfButtonWidth&&
                        mouseClickY>BigfButtonY&&mouseClickY<BigfButtonY+BigfButtonHeight)
            {
                 BigfButton++;
                 BigfButtonClicked = true;
                  CloutButtonCount = CloutButtonCount+ 10000000;
                   StudioButtonCount =   StudioButtonCount+ BigfButton;
             
           //BigFlockSound = getAudioClip(getDocumentBase(), "BigFlockSound.au");
           // put in init    
          BigFlockSound.play();
                StudioButtonCount =   StudioButtonCount- 10000000;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                BigfButtonClicked = false; //clicked outside rect
                
                
                
                         if( StudioButtonCount>=100000000 ){
                 if (mouseClickX>ShyButtonX&&mouseClickX<ShyButtonX+ShyButtonWidth&&
                        mouseClickY>ShyButtonY&&mouseClickY<ShyButtonY+ShyButtonHeight)
            {
                 ShyButton++;
                 ShyButtonClicked = true;
                  CloutButtonCount = CloutButtonCount+ 100000000;
                   StudioButtonCount =   StudioButtonCount+ ShyButton;
            
          //ShySound = getAudioClip(getDocumentBase(), "ShySound.au");
           // put in init    
         ShySound.play();
                StudioButtonCount =   StudioButtonCount- 100000000;
            
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                ShyButtonClicked = false; //clicked outside rect
               
               
               //
                  if(  CloutButtonCount>=100000 ){
                 if (mouseClickX> CloutButtonX&&mouseClickX< CloutButtonX+ CloutButtonWidth&&
                        mouseClickY> CloutButtonY&&mouseClickY< CloutButtonY+ CloutButtonHeight)
            {
                 //CloutButton++;
                 CloutButtonClicked = true;
                  StudioButtonCount = StudioButtonCount+ 50000;
                   
          
                CloutButtonCount =   CloutButtonCount- 100000;
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                CloutButtonClicked = false; //clicked outside rect
                
                      if(  CloutButtonCount>=1000000 ){
                 if (mouseClickX> Clout1ButtonX&&mouseClickX< Clout1ButtonX+ Clout1ButtonWidth&&
                        mouseClickY> Clout1ButtonY&&mouseClickY< Clout1ButtonY+ Clout1ButtonHeight)
            {
                 //CloutButton++;
                 Clout1ButtonClicked = true;
                  StudioButtonCount = StudioButtonCount+ 500000;
                  CloutButtonCount =  CloutButtonCount- 1000000;
          
                
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                Clout1ButtonClicked = false; //clicked outside rect
                
                
                          if(  CloutButtonCount>=10000000 ){
                 if (mouseClickX> Clout2ButtonX&&mouseClickX< Clout2ButtonX+ Clout2ButtonWidth&&
                        mouseClickY> Clout2ButtonY&&mouseClickY< Clout2ButtonY+ Clout2ButtonHeight)
            {
                 //CloutButton++;
                 Clout2ButtonClicked = true;
                  StudioButtonCount = StudioButtonCount+ 1000000;
                   
          
                CloutButtonCount =   CloutButtonCount- 10000000;
                 
                 //clicked inside rect
                 
                }
            
            }
            else  
                Clout2ButtonClicked = false; //clicked outside rect
                
              
               
              
           
           
           


      
    }
      repaint(); 
}
}
public void mouseReleased (MouseEvent me) {}  //dont use
    public void mouseEntered (MouseEvent me) { 
        mouseEntered = true;//this is great for 'pranks'
        repaint(); 
    } 
    public void mouseMoved(MouseEvent evt){ 
        MouseMoveX = evt.getX();//set the x to our class variable
        MouseMoveY = evt.getY(); //set the y to our class variable
        if (MouseMoveX>HunchoButtonX&&MouseMoveX<HunchoButtonX+HunchoButtonWidth&&
            MouseMoveY>HunchoButtonY&&MouseMoveY<HunchoButtonY+HunchoButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               HunchoButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           HunchoButtonClicked=false;//when not over the button, dont print the help box
           if (MouseMoveX>ReggieButtonX&&MouseMoveX<ReggieButtonX+ReggieButtonWidth&&
            MouseMoveY>ReggieButtonY&&MouseMoveY<ReggieButtonY+ReggieButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               ReggieButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           ReggieButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>RicoButtonX&&MouseMoveX<RicoButtonX+RicoButtonWidth&&
            MouseMoveY>RicoButtonY&&MouseMoveY<RicoButtonY+RicoButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
              RicoButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
            RicoButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX> DAFOOLButtonX&&MouseMoveX< DAFOOLButtonX+ DAFOOLButtonWidth&&
            MouseMoveY> DAFOOLButtonY&&MouseMoveY< DAFOOLButtonY+ DAFOOLButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               DAFOOLButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
            DAFOOLButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>ShabazzButtonX&&MouseMoveX<ShabazzButtonX+ShabazzButtonWidth&&
            MouseMoveY>ShabazzButtonY&&MouseMoveY<ShabazzButtonY+ShabazzButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               ShabazzButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           ShabazzButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>BigfButtonX&&MouseMoveX<BigfButtonX+BigfButtonWidth&&
            MouseMoveY>BigfButtonY&&MouseMoveY<BigfButtonY+BigfButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               BigfButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           BigfButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>ShyButtonX&&MouseMoveX<ShyButtonX+ShyButtonWidth&&
            MouseMoveY>ShyButtonY&&MouseMoveY<ShyButtonY+ShyButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               ShyButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           ShyButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>CloutButtonX&&MouseMoveX<CloutButtonX+CloutButtonWidth&&
            MouseMoveY>CloutButtonY&&MouseMoveY<CloutButtonY+CloutButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               CloutButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
          CloutButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX>Clout1ButtonX&&MouseMoveX<Clout1ButtonX+Clout1ButtonWidth&&
            MouseMoveY>Clout1ButtonY&&MouseMoveY<Clout1ButtonY+Clout1ButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
               Clout1ButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
           Clout1ButtonClicked=false;//when not over the button, dont print the help box
              if (MouseMoveX> Clout2ButtonX&&MouseMoveX< Clout2ButtonX+ Clout2ButtonWidth&&
            MouseMoveY> Clout2ButtonY&&MouseMoveY< Clout2ButtonY+ Clout2ButtonHeight){//same as the button if statement just using MouseMoveX instead of mouseClickX
                Clout2ButtonClicked=true;//set it to true so that we know to print the help box
        }
        else
            Clout2ButtonClicked=false;//when not over the button, dont print the help box
           
        repaint(); 
    } 
    public void mouseDragged(MouseEvent evt){ //needed to make the mousemotionlistener work
    } 
    public void mouseExited (MouseEvent me) { 
        mouseEntered = false;//more pranks
        repaint(); 
    }  
}  



