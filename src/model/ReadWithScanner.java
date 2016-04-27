package model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import Kabasuji.Board;
import Kabasuji.Lightning;
import Kabasuji.Piece;
import Kabasuji.PieceFactory;
import Kabasuji.PieceType;
import Kabasuji.Puzzle;
import Kabasuji.Release;
import Kabasuji.Square;

/** Assumes UTF-8 encoding. JDK 7+. */
public class ReadWithScanner {
  
  /**
   Constructor.
   @param aFileName full name of an existing, readable file.
  */
  public ReadWithScanner(String aFileName,Model kab){
    fFilePath = Paths.get(aFileName);
    this.kab = kab;
  }
  
  
  /** Template method that calls {@link #processLine(String)}.  */
  public Model processLineByLine() throws IOException {
    try (Scanner scanner =  new Scanner(fFilePath, ENCODING.name())){
      while (scanner.hasNextLine()){
        processLine(scanner.nextLine());
      }      
    }
    return this.kab;
  }

  /**
 * @param badgeNum
 * @param badgeName
 * @param txtName
 * @param txtValue
 */
private void checkBadge (int badgeNum, String badgeName, String txtName, String txtValue){
	  if ((txtName.trim().equals(badgeName)) && (txtValue.trim().equals("1"))){
		  this.kab.badges[badgeNum-1].setAchieved(true);
	  }
	  else if ((txtName.trim().equals(badgeName)) && (!txtValue.trim().equals("1"))){
		  this.kab.badges[badgeNum-1].setAchieved(false);
	  }
  }
  
  private void checkLightningLevels (int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Integer x = Integer.parseInt(ar[1]);
		  Lightning lLevel = new Lightning(levelNum, x);
		  if (ar[0].trim().equals("")){
			  lLevel.setUnlocked(false);
			  lLevel.setStars(0);
		  }else if ((ar[0].trim().equals("0"))||(ar[0].trim().equals("1"))||(ar[0].trim().equals("2"))||(ar[0].trim().equals("3"))){
			  lLevel.setStars(Integer.parseInt(ar[0].trim()));
			  lLevel.setUnlocked(true);
		  }
		  this.kab.llevels.add(lLevel);
	  }
  }
  
  private void checkPuzzleLevels (int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Integer x = Integer.parseInt(ar[1]);
		  Puzzle pLevel = new Puzzle(levelNum, x);
		  if (ar[0].trim().equals("")){
			  pLevel.setUnlocked(false);
			  pLevel.setStars(0);
		  }else if ((ar[0].trim().equals("0"))||(ar[0].trim().equals("1"))||(ar[0].trim().equals("2"))||(ar[0].trim().equals("3"))){
			  pLevel.setStars(Integer.parseInt(ar[0].trim()));
			  pLevel.setUnlocked(true);
		  }
		  this.kab.plevels.add(pLevel);
	  }
  }
  
  private void checkReleaseLevels (int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Release rLevel = new Release(levelNum);
		  if (ar[0].trim().equals("")){
			  rLevel.setUnlocked(false);
			  rLevel.setStars(0);
		  }else if ((ar[0].trim().equals("0"))||(ar[0].trim().equals("1"))||(ar[0].trim().equals("2"))||(ar[0].trim().equals("3"))){
			  rLevel.setStars(Integer.parseInt(ar[0].trim()));
			  rLevel.setUnlocked(true);
		  }
		  this.kab.rlevels.add(rLevel);
	  }
  }
  
  private void checkLightningPieces (int levelNum, String lvlName,PieceFactory pF, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Bullpen bpen = new Bullpen();
		  this.kab.llevels.get(levelNum-1).setBullpen(bpen);
		  for (int i = 0; i < ar.length; i++) {
			  Integer x = Integer.parseInt(ar[i]);
			  Piece piece =  pF.makePiece(x);
			  this.kab.llevels.get(levelNum-1).getBullpen().getPieces().add(piece);//setPiece will depend on the factory pieces
		  }
	  }
  }
  
  private void checkPuzzlePieces (int levelNum, String lvlName, PieceFactory pF, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Bullpen bpen = new Bullpen();
		  this.kab.plevels.get(levelNum-1).setBullpen(bpen);
		  for (int i = 0; i < ar.length; i++) {
			  Integer x = Integer.parseInt(ar[i]);
			  Piece piece =  pF.makePiece(x);
			  this.kab.plevels.get(levelNum-1).getBullpen().getPieces().add(piece);//setPiece will depend on the factory pieces
		  }
	  }
  }
  
  private void checkReleasePieces (int levelNum, String lvlName, PieceFactory pF, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Bullpen bpen = new Bullpen();
		  this.kab.rlevels.get(levelNum-1).setBullpen(bpen);
		  for (int i = 0; i < ar.length; i++) {
			  Integer x = Integer.parseInt(ar[i]);
			  Piece piece =  pF.makePiece(x);
			  this.kab.rlevels.get(levelNum-1).getBullpen().getPieces().add(piece);//setPiece will depend on the factory pieces
		  }
	  }
  }
  
  private void checkLightningBoard(int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Board board = new Board(PieceType.LIGHTNING);
		  this.kab.llevels.get(levelNum-1).setBoard(board);
		  for (int i = 0; i < 12; i++) {
			  for(int j = 0; j < 12; j++){
				  Integer x = Integer.parseInt(ar[(i * 12) + j]);
				  if(x == 1){
					  this.kab.llevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.LIGHTNING,true,false);
				  }else if(x == 0){
					  this.kab.llevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.LIGHTNING,false,false);
				  }
			  }
		  }
		  this.kab.llevels.get(levelNum-1).getBoard().createSquares();
	  }
  }
  
  private void checkPuzzleBoard(int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Board board = new Board(PieceType.PUZZLE);
		  this.kab.plevels.get(levelNum-1).setBoard(board);
		  for (int i = 0; i < 12; i++) {
			  for(int j = 0; j < 12; j++){
				  Integer x = Integer.parseInt(ar[(i * 12) + j]);
				  if(x == 1){
					  this.kab.plevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.PUZZLE,true,false);
				  }else if(x == 0){
					  this.kab.plevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.PUZZLE,false,false);
				  }
			  }
		  }
		  this.kab.plevels.get(levelNum-1).getBoard().createSquares();
	  }
  }
  
  private void checkReleaseBoard(int levelNum, String lvlName, String txtName, String txtValue){
	  if (txtName.trim().equals(lvlName)){
		  String[] ar=txtValue.trim().split(",");
		  Board board = new Board(PieceType.RELEASE);
		  this.kab.rlevels.get(levelNum-1).setBoard(board);
		  for (int i = 0; i < 12; i++) {
			  for(int j = 0; j < 12; j++){
				  Integer x = Integer.parseInt(ar[(i * 12) + j]);
				  if(x == 1){
					  this.kab.rlevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.RELEASE,true,false);
				  }else if(x == 0){
					  this.kab.rlevels.get(levelNum-1).getBoard().getSquares()[j][i]= new Square(j,i,PieceType.RELEASE,false,false);
				  }
			  }
		  }
		  this.kab.rlevels.get(levelNum-1).getBoard().createSquares();
	  }
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
      
      checkBadge (1,"BADGE1", name, value);
      checkBadge (2,"BADGE2", name, value);
      checkBadge (3,"BADGE3", name, value);
      checkBadge (4,"BADGE4", name, value);
      checkBadge (5,"BADGE5", name, value);
      checkBadge (6,"BADGE6", name, value);
      checkBadge (7,"BADGE7", name, value);
      checkBadge (8,"BADGE8", name, value);
      checkBadge (9,"BADGE9", name, value);
      checkBadge (10,"BADGE10", name, value);
      checkLightningLevels (1,"LLEVEL1", name, value);
      checkLightningLevels (2,"LLEVEL2", name, value);
      checkLightningLevels (3,"LLEVEL3", name, value);
      checkLightningLevels (4,"LLEVEL4", name, value);
      checkLightningLevels (5,"LLEVEL5", name, value);
      checkPuzzleLevels (1,"PLEVEL1", name, value);
      checkPuzzleLevels (2,"PLEVEL2", name, value);
      checkPuzzleLevels (3,"PLEVEL3", name, value);
      checkPuzzleLevels (4,"PLEVEL4", name, value);
      checkPuzzleLevels (5,"PLEVEL5", name, value);
      checkReleaseLevels (1,"RLEVEL1", name, value);
      checkReleaseLevels (2,"RLEVEL2", name, value);
      checkReleaseLevels (3,"RLEVEL3", name, value);
      checkReleaseLevels (4,"RLEVEL4", name, value);
      checkReleaseLevels (5,"RLEVEL5", name, value);
      checkLightningPieces (1, "LLEVEL1_PIECES",pFactory, name, value);
      checkLightningPieces (2, "LLEVEL2_PIECES",pFactory, name, value);
      checkLightningPieces (3, "LLEVEL3_PIECES",pFactory, name, value);
      checkLightningPieces (4, "LLEVEL4_PIECES",pFactory, name, value);
      checkLightningPieces (5, "LLEVEL5_PIECES",pFactory, name, value);
      checkPuzzlePieces (1, "PLEVEL1_PIECES",pFactory, name, value);
      checkPuzzlePieces (2, "PLEVEL2_PIECES",pFactory, name, value);
      checkPuzzlePieces (3, "PLEVEL3_PIECES",pFactory, name, value);
      checkPuzzlePieces (4, "PLEVEL4_PIECES",pFactory, name, value);
      checkPuzzlePieces (5, "PLEVEL5_PIECES",pFactory, name, value);
      checkReleasePieces (1, "RLEVEL1_PIECES",pFactory, name, value);
      checkReleasePieces (2, "RLEVEL2_PIECES",pFactory, name, value);
      checkReleasePieces (3, "RLEVEL3_PIECES",pFactory, name, value);
      checkReleasePieces (4, "RLEVEL4_PIECES",pFactory, name, value);
      checkReleasePieces (5, "RLEVEL5_PIECES",pFactory, name, value);
      checkLightningBoard(1, "LLEVEL1_BOARD", name, value);
      checkLightningBoard(2, "LLEVEL2_BOARD", name, value);
      checkLightningBoard(3, "LLEVEL3_BOARD", name, value);
      checkLightningBoard(4, "LLEVEL4_BOARD", name, value);
      checkLightningBoard(5, "LLEVEL5_BOARD", name, value);
      checkPuzzleBoard(1, "PLEVEL1_BOARD", name, value);
      checkPuzzleBoard(2, "PLEVEL2_BOARD", name, value);
      checkPuzzleBoard(3, "PLEVEL3_BOARD", name, value);
      checkPuzzleBoard(4, "PLEVEL4_BOARD", name, value);
      checkPuzzleBoard(5, "PLEVEL5_BOARD", name, value);
      checkReleaseBoard(1, "RLEVEL1_BOARD", name, value);
      checkReleaseBoard(2, "RLEVEL2_BOARD", name, value);
      checkReleaseBoard(3, "RLEVEL3_BOARD", name, value);
      checkReleaseBoard(4, "RLEVEL4_BOARD", name, value);
      checkReleaseBoard(5, "RLEVEL5_BOARD", name, value);

      log("Name is : " + quote(name.trim()) + ", and Value is : " + quote(value.trim()));
    }
    scanner.close();
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
  
  private Model kab;
} 
