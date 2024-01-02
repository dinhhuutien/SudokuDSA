/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* Name: Group 19
 Member names 
Đinh Hữu Tiến	 ITCSIU21111
Nguyễn Quốc Hưng ITITIU21211
Ông Chí Viễn	 ITITIU21344

*/
package Controller;
import Models.SudokuModel;
import Views.SudokuGame;

public class SudokuController implements Controller {
	SudokuModel model;
	SudokuGame view;
	public SudokuController (SudokuModel model) {
		this.model = model;
		view = new SudokuGame(this, model);
	}
	@Override
	public void makeNewGame() {
		model.makeNewGame();
	}


	
}
