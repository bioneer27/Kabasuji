package builderModel;

public class SelectedPiece {

	Piece p;
	
	
	public SelectedPiece(){
		
	}
	
	public void setselectedPiece(Piece p){
		this.p = p;
		if(this.p != null){
			System.out.println("SelectedPiece Updated");
		}
	}
	public Piece getSelectedPiece(){
		return p;
	}
}
