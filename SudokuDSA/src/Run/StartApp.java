/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

/**
 *
 * @author ADMIN
 */
import Controller.Controller;
import Controller.SudokuController;
import Models.SudokuModel;

public class StartApp {
	public static void main(String[] args) {
		SudokuModel model =new SudokuModel();
		Controller controller = new SudokuController(model);
	}
}
