/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ADMIN
 */
public class SudokuModel {
	Population population;
	public SudokuModel() {
		population = new Population();
	}
	public void makeNewGame() {
		population.makeNewGame();
	}
	public Genome getGenome() {
		return population.getGenome();
	}
	public boolean isSuccess() {
		return population.isMakeNewGameSuccess();
	}
	public static void main(String[] args) {
		SudokuModel s = new SudokuModel();
		s.makeNewGame();
		


	}
}

