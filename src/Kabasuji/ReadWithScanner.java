package Kabasuji;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/** Assumes UTF-8 encoding. JDK 7+. */
public class ReadWithScanner {
  
  /**
   Constructor.
   @param aFileName full name of an existing, readable file.
  */
  public ReadWithScanner(String aFileName,Kabasuji kab){
    fFilePath = Paths.get(aFileName);
    this.kab = kab;
  }
  
  
  /** Template method that calls {@link #processLine(String)}.  */
  public Kabasuji processLineByLine() throws IOException {
    try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
      while (scanner.hasNextLine()){
        processLine(scanner.nextLine());
      }      
    }
    return this.kab;
  }
  
  protected void processLine(String aLine){
    //use a second Scanner to parse the content of each line 
    Scanner scanner = new Scanner(aLine);
    scanner.useDelimiter("=");
    PieceFactory pFactory = new PieceFactory();
    if (scanner.hasNext()){
      //assumes the line has a certain structure
      String name = scanner.next();
      String value = scanner.next();
      if ((name.trim().equals("BADGEONE")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge1","Piece&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGETWO")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge2","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGETHREE")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge3","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGEFOUR")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge4","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGEFIVE")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge5","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGESIX")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge6","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGESEVEN")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge7","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGEEIGHT")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge8","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGENINE")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge9","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if ((name.trim().equals("BADGETEN")) && (value.trim().equals("1"))){
    	  Badge badge1 = new Badge("Badge10","Hate&Love");
    	  this.kab.badges.add(badge1); 
      }
      if (name.trim().equals("LLEVEL1_STARS")){
    	  Level lLevel1 = new Level(1, PieceType.LIGHTNING);
    	  lLevel1.star = Integer.parseInt(value.trim());
    	  this.kab.llevels.add(lLevel1);
      }
      if (name.trim().equals("LLEVEL2_STARS")){
    	  Level lLevel2 = new Level(2, PieceType.LIGHTNING);
    	  lLevel2.star = Integer.parseInt(value.trim());
    	  this.kab.llevels.add(lLevel2);
      }
      if (name.trim().equals("LLEVEL3_STARS")){
    	  Level lLevel3 = new Level(3, PieceType.LIGHTNING);
    	  lLevel3.star = Integer.parseInt(value.trim());
    	  this.kab.llevels.add(lLevel3);
      }
      if (name.trim().equals("PLEVEL1_STARS")){
    	  Level pLevel1 = new Level(1, PieceType.PUZZLE);
    	  pLevel1.star = Integer.parseInt(value.trim());
    	  this.kab.plevels.add(pLevel1);
      }
      if (name.trim().equals("PLEVEL2_STARS")){
    	  Level pLevel2 = new Level(2, PieceType.PUZZLE);
    	  pLevel2.star = Integer.parseInt(value.trim());
    	  this.kab.plevels.add(pLevel2);
      }
      if (name.trim().equals("RLEVEL1_STARS")){
    	  Level rLevel1 = new Level(1, PieceType.RELEASE);
    	  rLevel1.star = Integer.parseInt(value.trim());
    	  this.kab.rlevels.add(rLevel1);
      }
      if (name.trim().equals("LLEVEL1_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.llevels.get(0).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.llevels.get(0).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      if (name.trim().equals("LLEVEL2_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.llevels.get(1).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.llevels.get(1).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      if (name.trim().equals("LLEVEL3_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.llevels.get(2).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.llevels.get(2).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      if (name.trim().equals("PLEVEL1_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.plevels.get(0).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.plevels.get(0).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      if (name.trim().equals("PLEVEL2_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.plevels.get(1).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.plevels.get(1).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      if (name.trim().equals("RLEVEL1_PIECES")){
    	  String[] ar=value.trim().split(",");
    	  Bullpen bpen = new Bullpen();
    	  this.kab.rlevels.get(0).bullpen = bpen;
    	  for (int i = 0; i < ar.length; i++) {
    		  Integer x = Integer.parseInt(ar[i]);
    		  Piece piece =  pFactory.makePiece(x);
    		  this.kab.rlevels.get(0).bullpen.boxes.add(new Box(piece));//setPiece will depend on the factory pieces
    	  }
      }
      log("Name is : " + quote(name.trim()) + ", and Value is : " + quote(value.trim()));
    }
  }
  
  // PRIVATE 
  private final Path fFilePath;
  private final static Charset ENCODING = StandardCharsets.UTF_8;  
  
  private static void log(Object aObject){
    System.out.println(String.valueOf(aObject));
  }
  
  private String quote(String aText){
    String QUOTE = "'";
    return QUOTE + aText + QUOTE;
  }
  
  private Kabasuji kab;
} 
